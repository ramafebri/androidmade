package com.example.gamecatalogue.core.domain.repository

import com.example.gamecatalogue.core.data.Resource
import com.example.gamecatalogue.core.domain.model.Game
import com.example.gamecatalogue.core.domain.model.GameDetail
import kotlinx.coroutines.flow.Flow
interface IGameRepository {
    fun getAllGame(): Flow<Resource<List<Game>>>

    fun getDetailGame(gameId: Int): Flow<Resource<GameDetail>>

    fun getFavoriteGame(): Flow<List<Game>>

    fun setFavoriteGame(game: Game, state: Boolean)
}