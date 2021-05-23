package com.example.gamecatalogue.presentation.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.gamecatalogue.core.domain.usecase.GameUseCase

class HomeViewModel(gameUseCase: GameUseCase): ViewModel() {
    val listGame = gameUseCase.getAllGame().asLiveData()
}