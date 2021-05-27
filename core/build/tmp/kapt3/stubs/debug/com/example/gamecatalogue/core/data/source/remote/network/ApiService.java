package com.example.gamecatalogue.core.data.source.remote.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/example/gamecatalogue/core/data/source/remote/network/ApiService;", "", "getDetailGame", "Lcom/example/gamecatalogue/core/data/source/remote/response/GameDetailResponse;", "path", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getListGame", "Lcom/example/gamecatalogue/core/data/source/remote/response/ListGameResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "games?key=f0b1a28672d14f7e9350d179d277b5cd")
    public abstract java.lang.Object getListGame(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.gamecatalogue.core.data.source.remote.response.ListGameResponse> p0);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "games/{gameId}?key=f0b1a28672d14f7e9350d179d277b5cd")
    public abstract java.lang.Object getDetailGame(@retrofit2.http.Path(value = "gameId")
    int path, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.gamecatalogue.core.data.source.remote.response.GameDetailResponse> p1);
}