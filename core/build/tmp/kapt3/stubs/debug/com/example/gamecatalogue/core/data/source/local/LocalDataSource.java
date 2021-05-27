package com.example.gamecatalogue.core.data.source.local;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u001f\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/example/gamecatalogue/core/data/source/local/LocalDataSource;", "", "gameDao", "Lcom/example/gamecatalogue/core/data/source/local/room/GameDao;", "(Lcom/example/gamecatalogue/core/data/source/local/room/GameDao;)V", "getAllGame", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/gamecatalogue/core/data/source/local/entity/GameEntity;", "getFavoriteGame", "insertGame", "", "gameList", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setFavoriteGame", "game", "newState", "", "core_debug"})
public final class LocalDataSource {
    private final com.example.gamecatalogue.core.data.source.local.room.GameDao gameDao = null;
    
    public LocalDataSource(@org.jetbrains.annotations.NotNull
    com.example.gamecatalogue.core.data.source.local.room.GameDao gameDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.gamecatalogue.core.data.source.local.entity.GameEntity>> getAllGame() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.gamecatalogue.core.data.source.local.entity.GameEntity>> getFavoriteGame() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object insertGame(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.gamecatalogue.core.data.source.local.entity.GameEntity> gameList, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    public final void setFavoriteGame(@org.jetbrains.annotations.NotNull
    com.example.gamecatalogue.core.data.source.local.entity.GameEntity game, boolean newState) {
    }
}