package com.example.gamecatalogue.core.utils

import com.example.gamecatalogue.core.data.source.local.entity.GameEntity
import com.example.gamecatalogue.core.data.source.remote.response.GameDetailResponse
import com.example.gamecatalogue.core.data.source.remote.response.GameResponse
import com.example.gamecatalogue.core.domain.model.Game
import com.example.gamecatalogue.core.domain.model.GameDetail

object DataMapper {
    fun mapResponsesToEntities(input: List<GameResponse>): List<GameEntity> {
        val gameList = ArrayList<GameEntity>()
            input.map {
                val game = GameEntity(
                    id = it.id,
                    name = it.name,
                    released = it.released,
                    backgroundImage = it.backgroundImage,
                    rating = it.rating,
                    isFavorite = false
                )
                gameList.add(game)
            }

        return gameList
    }

    fun mapEntitiesToDomain(input: List<GameEntity>): List<Game> =
        input.map {
            Game(
                id = it.id,
                name = it.name,
                released = it.released,
                backgroundImage = it.backgroundImage,
                rating = it.rating,
                isFavorite = it.isFavorite
            )
        }

    fun convertDetailEntToDetailDom(input: GameDetailResponse): GameDetail {
        return GameDetail(
            input.id,
            input.name,
            input.released,
            input.backgroundImage,
            input.rating,
            input.website,
            input.descriptionRaw
        )
    }

    fun mapDomainToEntity(input: Game) =
        GameEntity(
            id = input.id,
            name = input.name,
            released = input.released,
            backgroundImage = input.backgroundImage,
            rating = input.rating,
            isFavorite = input.isFavorite
        )
}