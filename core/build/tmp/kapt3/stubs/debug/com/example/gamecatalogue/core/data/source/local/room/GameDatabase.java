package com.example.gamecatalogue.core.data.source.local.room;

import java.lang.System;

@androidx.room.Database(entities = {com.example.gamecatalogue.core.data.source.local.entity.GameEntity.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/example/gamecatalogue/core/data/source/local/room/GameDatabase;", "Landroidx/room/RoomDatabase;", "()V", "gameDao", "Lcom/example/gamecatalogue/core/data/source/local/room/GameDao;", "core_debug"})
public abstract class GameDatabase extends androidx.room.RoomDatabase {
    
    public GameDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.gamecatalogue.core.data.source.local.room.GameDao gameDao();
}