package com.example.gamecatalogue.core.data.source.local.room;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.gamecatalogue.core.data.source.local.entity.GameEntity;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class GameDao_Impl implements GameDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<GameEntity> __insertionAdapterOfGameEntity;

  private final EntityDeletionOrUpdateAdapter<GameEntity> __updateAdapterOfGameEntity;

  public GameDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfGameEntity = new EntityInsertionAdapter<GameEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `game` (`id`,`name`,`released`,`background_image`,`rating`,`isFavorite`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, GameEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getReleased() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getReleased());
        }
        if (value.getBackgroundImage() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getBackgroundImage());
        }
        stmt.bindDouble(5, value.getRating());
        final int _tmp;
        _tmp = value.isFavorite() ? 1 : 0;
        stmt.bindLong(6, _tmp);
      }
    };
    this.__updateAdapterOfGameEntity = new EntityDeletionOrUpdateAdapter<GameEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `game` SET `id` = ?,`name` = ?,`released` = ?,`background_image` = ?,`rating` = ?,`isFavorite` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, GameEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getReleased() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getReleased());
        }
        if (value.getBackgroundImage() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getBackgroundImage());
        }
        stmt.bindDouble(5, value.getRating());
        final int _tmp;
        _tmp = value.isFavorite() ? 1 : 0;
        stmt.bindLong(6, _tmp);
        stmt.bindLong(7, value.getId());
      }
    };
  }

  @Override
  public Object insertGame(final List<GameEntity> game, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfGameEntity.insert(game);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public void updateFavoriteGame(final GameEntity game) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfGameEntity.handle(game);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Flow<List<GameEntity>> getAllGame() {
    final String _sql = "SELECT * FROM game";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"game"}, new Callable<List<GameEntity>>() {
      @Override
      public List<GameEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfReleased = CursorUtil.getColumnIndexOrThrow(_cursor, "released");
          final int _cursorIndexOfBackgroundImage = CursorUtil.getColumnIndexOrThrow(_cursor, "background_image");
          final int _cursorIndexOfRating = CursorUtil.getColumnIndexOrThrow(_cursor, "rating");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
          final List<GameEntity> _result = new ArrayList<GameEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final GameEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpReleased;
            if (_cursor.isNull(_cursorIndexOfReleased)) {
              _tmpReleased = null;
            } else {
              _tmpReleased = _cursor.getString(_cursorIndexOfReleased);
            }
            final String _tmpBackgroundImage;
            if (_cursor.isNull(_cursorIndexOfBackgroundImage)) {
              _tmpBackgroundImage = null;
            } else {
              _tmpBackgroundImage = _cursor.getString(_cursorIndexOfBackgroundImage);
            }
            final double _tmpRating;
            _tmpRating = _cursor.getDouble(_cursorIndexOfRating);
            final boolean _tmpIsFavorite;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp != 0;
            _item = new GameEntity(_tmpId,_tmpName,_tmpReleased,_tmpBackgroundImage,_tmpRating,_tmpIsFavorite);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<GameEntity>> getFavoriteGame() {
    final String _sql = "SELECT * FROM game where isFavorite = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"game"}, new Callable<List<GameEntity>>() {
      @Override
      public List<GameEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfReleased = CursorUtil.getColumnIndexOrThrow(_cursor, "released");
          final int _cursorIndexOfBackgroundImage = CursorUtil.getColumnIndexOrThrow(_cursor, "background_image");
          final int _cursorIndexOfRating = CursorUtil.getColumnIndexOrThrow(_cursor, "rating");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
          final List<GameEntity> _result = new ArrayList<GameEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final GameEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpReleased;
            if (_cursor.isNull(_cursorIndexOfReleased)) {
              _tmpReleased = null;
            } else {
              _tmpReleased = _cursor.getString(_cursorIndexOfReleased);
            }
            final String _tmpBackgroundImage;
            if (_cursor.isNull(_cursorIndexOfBackgroundImage)) {
              _tmpBackgroundImage = null;
            } else {
              _tmpBackgroundImage = _cursor.getString(_cursorIndexOfBackgroundImage);
            }
            final double _tmpRating;
            _tmpRating = _cursor.getDouble(_cursorIndexOfRating);
            final boolean _tmpIsFavorite;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp != 0;
            _item = new GameEntity(_tmpId,_tmpName,_tmpReleased,_tmpBackgroundImage,_tmpRating,_tmpIsFavorite);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
