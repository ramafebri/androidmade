package com.example.gamecatalogue.core.data.source.remote.network

import com.example.gamecatalogue.core.BuildConfig
import com.example.gamecatalogue.core.data.source.remote.response.GameDetailResponse
import com.example.gamecatalogue.core.data.source.remote.response.ListGameResponse
import retrofit2.http.GET
import retrofit2.http.Path

const val apiKey = BuildConfig.API_KEY
interface ApiService {
    @GET("games?key=$apiKey")
    suspend fun getListGame(): ListGameResponse

    @GET("games/{gameId}?key=$apiKey")
    suspend fun getDetailGame(@Path("gameId") path: Int): GameDetailResponse
}