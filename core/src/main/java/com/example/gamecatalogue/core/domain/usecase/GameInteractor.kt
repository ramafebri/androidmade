package com.example.gamecatalogue.core.domain.usecase

import com.example.gamecatalogue.core.domain.model.Game
import com.example.gamecatalogue.core.domain.repository.IGameRepository

class GameInteractor (private val gameRepository: IGameRepository): GameUseCase {

    override fun getAllGame() = gameRepository.getAllGame()

    override fun getDetailGame(gameId: Int) =  gameRepository.getDetailGame(gameId)

    override fun getFavoriteGame() = gameRepository.getFavoriteGame()

    override fun setFavoriteGame(game: Game, state: Boolean) = gameRepository.setFavoriteGame(game, state)
}