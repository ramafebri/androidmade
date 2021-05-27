package com.example.gamecatalogue.core.domain.model

data class GameDetail(
    val id: Int,
    val name: String,
    val released: String,
    val backgroundImage: String,
    val rating: Double,
    val website: String,
    val description: String,
)
