package com.example.gamecatalogue.presentation.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.gamecatalogue.core.domain.model.Game
import com.example.gamecatalogue.core.domain.model.GameDetail
import com.example.gamecatalogue.core.domain.usecase.GameUseCase

class DetailViewModel (private val gameUseCase: GameUseCase) : ViewModel() {
    fun setFavoriteGame(game: Game, newStatus:Boolean) =
        gameUseCase.setFavoriteGame(game, newStatus)

    fun getDetailGame(gameId: Int): LiveData<com.example.gamecatalogue.core.data.Resource<GameDetail>>{
        return gameUseCase.getDetailGame(gameId).asLiveData()
    }
}