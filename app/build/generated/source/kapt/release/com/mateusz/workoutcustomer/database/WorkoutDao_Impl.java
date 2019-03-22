package com.mateusz.workoutcustomer.database;

import android.arch.lifecycle.ComputableLiveData;
import android.arch.lifecycle.LiveData;
import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.InvalidationTracker.Observer;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import android.support.annotation.NonNull;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@SuppressWarnings("unchecked")
public class WorkoutDao_Impl implements WorkoutDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfWorkout;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public WorkoutDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfWorkout = new EntityInsertionAdapter<Workout>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `workout_table`(`_id`,`title`,`description`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Workout value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM workout_table";
        return _query;
      }
    };
  }

  @Override
  public void insert(Workout workout) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfWorkout.insert(workout);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAll() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public LiveData<List<Workout>> getAllWords() {
    final String _sql = "SELECT * from workout_table ORDER BY _id, title, description ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new ComputableLiveData<List<Workout>>() {
      private Observer _observer;

      @Override
      protected List<Workout> compute() {
        if (_observer == null) {
          _observer = new Observer("workout_table") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("_id");
          final int _cursorIndexOfTitle = _cursor.getColumnIndexOrThrow("title");
          final int _cursorIndexOfDescription = _cursor.getColumnIndexOrThrow("description");
          final List<Workout> _result = new ArrayList<Workout>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Workout _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            _item = new Workout(_tmpId,_tmpTitle,_tmpDescription);
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
    }.getLiveData();
  }
}
