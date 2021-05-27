package com.example.gamecatalogue.core.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006H\u0016J\u001c\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\u00062\u0006\u0010\f\u001a\u00020\rH\u0016J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006H\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/gamecatalogue/core/domain/usecase/GameInteractor;", "Lcom/example/gamecatalogue/core/domain/usecase/GameUseCase;", "gameRepository", "Lcom/example/gamecatalogue/core/domain/repository/IGameRepository;", "(Lcom/example/gamecatalogue/core/domain/repository/IGameRepository;)V", "getAllGame", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/gamecatalogue/core/data/Resource;", "", "Lcom/example/gamecatalogue/core/domain/model/Game;", "getDetailGame", "Lcom/example/gamecatalogue/core/domain/model/GameDetail;", "gameId", "", "getFavoriteGame", "setFavoriteGame", "", "game", "state", "", "core_debug"})
public final class GameInteractor implements com.example.gamecatalogue.core.domain.usecase.GameUseCase {
    private final com.example.gamecatalogue.core.domain.repository.IGameRepository gameRepository = null;
    
    public GameInteractor(@org.jetbrains.annotations.NotNull
    com.example.gamecatalogue.core.domain.repository.IGameRepository gameRepository) {
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