package com.example.gamecatalogue.core.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Game(
    val id: Int,
    val name: String,
    val released: String,
    val backgroundImage: String,
    val rating: Double,
    val isFavorite: Boolean
) : Parcelable