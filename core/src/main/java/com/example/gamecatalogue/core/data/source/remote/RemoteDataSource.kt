package com.example.gamecatalogue.core.data.source.remote

import android.util.Log
import com.example.gamecatalogue.core.data.source.remote.network.ApiResponse
import com.example.gamecatalogue.core.data.source.remote.network.ApiService
import com.example.gamecatalogue.core.data.source.remote.response.GameDetailResponse
import com.example.gamecatalogue.core.data.source.remote.response.GameResponse

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class RemoteDataSource(private val apiService: ApiService) {

    suspend fun getAllGame(): Flow<ApiResponse<List<GameResponse>>> {
        return flow {
            try {
                val response = apiService.getListGame()
                val dataArray = response.results
                if (dataArray.isNotEmpty()){
                    emit(ApiResponse.Success(response.results))
                } else {
                    emit(ApiResponse.Empty)
                }
            } catch (e : Exception){
                emit(ApiResponse.Error(e.toString()))
                Log.e("RemoteDataSource", e.toString())
            }
        }.flowOn(Dispatchers.IO)
    }

    suspend fun getGameById(gameId: Int): Flow<ApiResponse<GameDetailResponse>> {
        return flow {
            try {
                val response = apiService.getDetailGame(gameId)
                emit(ApiResponse.Success(response))
            } catch (e : Exception){
                emit(ApiResponse.Error(e.toString()))
                Log.e("RemoteDataSource", e.toString())
            }
        }.flowOn(Dispatchers.IO)
    }
}