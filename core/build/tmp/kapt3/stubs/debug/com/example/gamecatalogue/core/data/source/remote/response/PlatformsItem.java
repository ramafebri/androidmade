package com.example.gamecatalogue.core.data.source.remote.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tH\u00c6\u0003J9\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0007H\u00d6\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001e"}, d2 = {"Lcom/example/gamecatalogue/core/data/source/remote/response/PlatformsItem;", "", "requirementsRu", "Lcom/example/gamecatalogue/core/data/source/remote/response/RequirementsRu;", "requirementsEn", "Lcom/example/gamecatalogue/core/data/source/remote/response/RequirementsEn;", "releasedAt", "", "platform", "Lcom/example/gamecatalogue/core/data/source/remote/response/Platform;", "(Lcom/example/gamecatalogue/core/data/source/remote/response/RequirementsRu;Lcom/example/gamecatalogue/core/data/source/remote/response/RequirementsEn;Ljava/lang/String;Lcom/example/gamecatalogue/core/data/source/remote/response/Platform;)V", "getPlatform", "()Lcom/example/gamecatalogue/core/data/source/remote/response/Platform;", "getReleasedAt", "()Ljava/lang/String;", "getRequirementsEn", "()Lcom/example/gamecatalogue/core/data/source/remote/response/RequirementsEn;", "getRequirementsRu", "()Lcom/example/gamecatalogue/core/data/source/remote/response/RequirementsRu;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "core_debug"})
public final class PlatformsItem {
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "requirements_ru")
    private final com.example.gamecatalogue.core.data.source.remote.response.RequirementsRu requirementsRu = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "requirements_en")
    private final com.example.gamecatalogue.core.data.source.remote.response.RequirementsEn requirementsEn = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "released_at")
    private final java.lang.String releasedAt = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "platform")
    private final com.example.gamecatalogue.core.data.source.remote.response.Platform platform = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.example.gamecatalogue.core.data.source.remote.response.PlatformsItem copy(@org.jetbrains.annotations.Nullable
    com.example.gamecatalogue.core.data.source.remote.response.RequirementsRu requirementsRu, @org.jetbrains.annotations.Nullable
    com.example.gamecatalogue.core.data.source.remote.response.RequirementsEn requirementsEn, @org.jetbrains.annotations.Nullable
    java.lang.String releasedAt, @org.jetbrains.annotations.Nullable
    com.example.gamecatalogue.core.data.source.remote.response.Platform platform) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object p0) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public PlatformsItem() {
        super();
    }
    
    public PlatformsItem(@org.jetbrains.annotations.Nullable
    com.example.gamecatalogue.core.data.source.remote.response.RequirementsRu requirementsRu, @org.jetbrains.annotations.Nullable
    com.example.gamecatalogue.core.data.source.remote.response.RequirementsEn requirementsEn, @org.jetbrains.annotations.Nullable
    java.lang.String releasedAt, @org.jetbrains.annotations.Nullable
    com.example.gamecatalogue.core.data.source.remote.response.Platform platform) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.gamecatalogue.core.data.source.remote.response.RequirementsRu component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.gamecatalogue.core.data.source.remote.response.RequirementsRu getRequirementsRu() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.gamecatalogue.core.data.source.remote.response.RequirementsEn component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.gamecatalogue.core.data.source.remote.response.RequirementsEn getRequirementsEn() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getReleasedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.gamecatalogue.core.data.source.remote.response.Platform component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.gamecatalogue.core.data.source.remote.response.Platform getPlatform() {
        return null;
    }
}