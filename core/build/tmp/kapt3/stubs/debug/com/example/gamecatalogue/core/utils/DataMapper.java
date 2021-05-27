package com.example.gamecatalogue.core.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\tJ\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\b0\u000bJ\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\r0\u000b\u00a8\u0006\u000e"}, d2 = {"Lcom/example/gamecatalogue/core/utils/DataMapper;", "", "()V", "convertDetailEntToDetailDom", "Lcom/example/gamecatalogue/core/domain/model/GameDetail;", "input", "Lcom/example/gamecatalogue/core/data/source/remote/response/GameDetailResponse;", "mapDomainToEntity", "Lcom/example/gamecatalogue/core/data/source/local/entity/GameEntity;", "Lcom/example/gamecatalogue/core/domain/model/Game;", "mapEntitiesToDomain", "", "mapResponsesToEntities", "Lcom/example/gamecatalogue/core/data/source/remote/response/GameResponse;", "core_debug"})
public final class DataMapper {
    @org.jetbrains.annotations.NotNull
    public static final com.example.gamecatalogue.core.utils.DataMapper INSTANCE = null;
    
    private DataMapper() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.gamecatalogue.core.data.source.local.entity.GameEntity> mapResponsesToEntities(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.gamecatalogue.core.data.source.remote.response.GameResponse> input) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.gamecatalogue.core.domain.model.Game> mapEntitiesToDomain(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.gamecatalogue.core.data.source.local.entity.GameEntity> input) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.gamecatalogue.core.domain.model.GameDetail convertDetailEntToDetailDom(@org.jetbrains.annotations.NotNull
    com.example.gamecatalogue.core.data.source.remote.response.GameDetailResponse input) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.gamecatalogue.core.data.source.local.entity.GameEntity mapDomainToEntity(@org.jetbrains.annotations.NotNull
    com.example.gamecatalogue.core.domain.model.Game input) {
        return null;
    }
}