package com.example.gamecatalogue.core.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0003H&J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00040\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003H&J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H&\u00a8\u0006\u0011"}, d2 = {"Lcom/example/gamecatalogue/core/domain/repository/IGameRepository;", "", "getAllGame", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/gamecatalogue/core/data/Resource;", "", "Lcom/example/gamecatalogue/core/domain/model/Game;", "getDetailGame", "Lcom/example/gamecatalogue/core/domain/model/GameDetail;", "gameId", "", "getFavoriteGame", "setFavoriteGame", "", "game", "state", "", "core_debug"})
public abstract interface IGameRepository {
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<com.example.gamecatalogue.core.data.Resource<java.util.List<com.example.gamecatalogue.core.domain.model.Game>>> getAllGame();
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<com.example.gamecatalogue.core.data.Resource<com.example.gamecatalogue.core.domain.model.GameDetail>> getDetailGame(int gameId);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.gamecatalogue.core.domain.model.Game>> getFavoriteGame();
    
    public abstract void setFavoriteGame(@org.jetbrains.annotations.NotNull
    com.example.gamecatalogue.core.domain.model.Game game, boolean state);
}