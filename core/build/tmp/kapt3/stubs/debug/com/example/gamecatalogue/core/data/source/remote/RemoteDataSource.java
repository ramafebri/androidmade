package com.example.gamecatalogue.core.data.source.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J#\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/example/gamecatalogue/core/data/source/remote/RemoteDataSource;", "", "apiService", "Lcom/example/gamecatalogue/core/data/source/remote/network/ApiService;", "(Lcom/example/gamecatalogue/core/data/source/remote/network/ApiService;)V", "getAllGame", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/gamecatalogue/core/data/source/remote/network/ApiResponse;", "", "Lcom/example/gamecatalogue/core/data/source/remote/response/GameResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGameById", "Lcom/example/gamecatalogue/core/data/source/remote/response/GameDetailResponse;", "gameId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_debug"})
public final class RemoteDataSource {
    private final com.example.gamecatalogue.core.data.source.remote.network.ApiService apiService = null;
    
    public RemoteDataSource(@org.jetbrains.annotations.NotNull
    com.example.gamecatalogue.core.data.source.remote.network.ApiService apiService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getAllGame(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.gamecatalogue.core.data.source.remote.network.ApiResponse<? extends java.util.List<com.example.gamecatalogue.core.data.source.remote.response.GameResponse>>>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getGameById(int gameId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.gamecatalogue.core.data.source.remote.network.ApiResponse<com.example.gamecatalogue.core.data.source.remote.response.GameDetailResponse>>> p1) {
        return null;
    }
}