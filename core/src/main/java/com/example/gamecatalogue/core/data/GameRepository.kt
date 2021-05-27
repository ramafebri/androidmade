package com.example.gamecatalogue.core.data

import com.example.gamecatalogue.core.data.source.local.LocalDataSource
import com.example.gamecatalogue.core.data.source.remote.RemoteDataSource
import com.example.gamecatalogue.core.data.source.remote.network.ApiResponse
import com.example.gamecatalogue.core.data.source.remote.response.GameDetailResponse
import com.example.gamecatalogue.core.data.source.remote.response.GameResponse
import com.example.gamecatalogue.core.domain.model.Game
import com.example.gamecatalogue.core.domain.model.GameDetail
import com.example.gamecatalogue.core.domain.repository.IGameRepository
import com.example.gamecatalogue.core.utils.AppExecutors
import com.example.gamecatalogue.core.utils.DataMapper
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map

class GameRepository
    (private val remoteDataSource: RemoteDataSource,
     private val localDataSource: LocalDataSource,
     private val appExecutors: AppExecutors
) : IGameRepository {

    override fun getAllGame(): Flow<Resource<List<Game>>> =
        object : com.example.gamecatalogue.core.data.NetworkBoundResource<List<Game>, List<GameResponse>>() {
            override fun loadFromDB(): Flow<List<Game>> {
                return localDataSource.getAllGame().map {
                    DataMapper.mapEntitiesToDomain(it)
                }
            }

            override fun shouldFetch(data: List<Game>?): Boolean =
                data == null || data.isEmpty()
                // true // ganti dengan true jika ingin selalu mengambil data dari internet

            override suspend fun createCall(): Flow<ApiResponse<List<GameResponse>>> =
                remoteDataSource.getAllGame()

            override suspend fun saveCallResult(data: List<GameResponse>) {
                val gameList = DataMapper.mapResponsesToEntities(data)
                localDataSource.insertGame(gameList)
            }

        }.asFlow()

    override fun getDetailGame(gameId: Int): Flow<Resource<GameDetail>> {
        val result: Flow<Resource<GameDetail>> = flow {
            suspend fun createCall(): Flow<ApiResponse<GameDetailResponse>> = remoteDataSource.getGameById(gameId)
            emit(Resource.Loading<GameDetail>())
            when (val apiResponse = createCall().first()) {
                is ApiResponse.Success -> {
                    val convertedData = DataMapper.convertDetailEntToDetailDom(apiResponse.data)
                    emit(
                        Resource.Success<GameDetail>(
                            convertedData
                        )
                    )
                }
                is ApiResponse.Error -> {
                    emit(Resource.Error<GameDetail>(apiResponse.errorMessage))
                }
            }
        }
        return result
    }

    override fun getFavoriteGame(): Flow<List<Game>> {
        return localDataSource.getFavoriteGame().map {
            DataMapper.mapEntitiesToDomain(it)
        }
    }

    override fun setFavoriteGame(game: Game, state: Boolean) {
        val gameEntity = DataMapper.mapDomainToEntity(game)
        appExecutors.diskIO().execute { localDataSource.setFavoriteGame(gameEntity, state) }
    }
}