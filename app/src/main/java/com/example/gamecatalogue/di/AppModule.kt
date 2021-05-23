package com.example.gamecatalogue.di

import com.example.gamecatalogue.core.domain.usecase.GameInteractor
import com.example.gamecatalogue.core.domain.usecase.GameUseCase
import com.example.gamecatalogue.presentation.detail.DetailViewModel
import com.example.gamecatalogue.presentation.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val useCaseModule = module {
    factory<GameUseCase> { GameInteractor(get()) }
}

val viewModelModule = module {
    viewModel { HomeViewModel(get()) }
    viewModel { DetailViewModel(get()) }
}