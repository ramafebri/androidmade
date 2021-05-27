package com.example.gamecatalogue.core.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001a\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b0\nH\u0016J\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000b0\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\nH\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/gamecatalogue/core/data/GameRepository;", "Lcom/example/gamecatalogue/core/domain/repository/IGameRepository;", "remoteDataSource", "Lcom/example/gamecatalogue/core/data/source/remote/RemoteDataSource;", "localDataSource", "Lcom/example/gamecatalogue/core/data/source/local/LocalDataSource;", "appExecutors", "Lcom/example/gamecatalogue/core/utils/AppExecutors;", "(Lcom/example/gamecatalogue/core/data/source/remote/RemoteDataSource;Lcom/example/gamecatalogue/core/data/source/local/LocalDataSource;Lcom/example/gamecatalogue/core/utils/AppExecutors;)V", "getAllGame", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/gamecatalogue/core/data/Resource;", "", "Lcom/example/gamecatalogue/core/domain/model/Game;", "getDetailGame", "Lcom/example/gamecatalogue/core/domain/model/GameDetail;", "gameId", "", "getFavoriteGame", "setFavoriteGame", "", "game", "state", "", "core_debug"})
public final class GameRepository implements com.example.gamecatalogue.core.domain.repository.IGameRepository {
    private final com.example.gamecatalogue.core.data.source.remote.RemoteDataSource remoteDataSource = null;
    private final com.example.gamecatalogue.core.data.source.local.LocalDataSource localDataSource = null;
    private final com.example.gamecatalogue.core.utils.AppExecutors appExecutors = null;
    
    public GameRepository(@org.jetbrains.annotations.NotNull
    com.example.gamecatalogue.core.data.source.remote.RemoteDataSource remoteDataSource, @org.jetbrains.annotations.NotNull
    com.example.gamecatalogue.core.data.source.local.LocalDataSource localDataSource, @org.jetbrains.annotations.NotNull
    com.example.gamecatalogue.core.utils.AppExecutors appExecutors) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<com.example.gamecatalogue.core.data.Resource<java.util.List<com.example.gamecatalogue.core.domain.model.Game>>> getAllGame() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<com.example.gamecatalogue.core.data.Resource<com.example.gamecatalogue.core.domain.model.GameDetail>> getDetailGame(int gameId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<java.util.List<com.example.gamecatalogue.core.domain.model.Game>> getFavoriteGame() {
        return null;
    }
    
    @java.lang.Override
    public void setFavoriteGame(@org.jetbrains.annotations.NotNull
    com.example.gamecatalogue.core.domain.model.Game game, boolean state) {
    }
}