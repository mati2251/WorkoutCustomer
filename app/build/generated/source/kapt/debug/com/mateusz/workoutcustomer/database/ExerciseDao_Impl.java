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
public class ExerciseDao_Impl implements ExerciseDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfExercise;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  private final SharedSQLiteStatement __preparedStmtOfDeleteByWorkoutId;

  private final SharedSQLiteStatement __preparedStmtOfDeleteByExerciseId;

  public ExerciseDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfExercise = new EntityInsertionAdapter<Exercise>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `exercise_table`(`_id`,`workoutId`,`title`,`description`,`instruction`,`series`,`timeCheck`,`time`,`timeFormat`,`repeat`,`pause`,`pauseFormat`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Exercise value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getWorkoutId());
        if (value.getTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTitle());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        if (value.getInstruction() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getInstruction());
        }
        stmt.bindLong(6, value.getSeries());
        final int _tmp;
        _tmp = value.getTimeCheck() ? 1 : 0;
        stmt.bindLong(7, _tmp);
        stmt.bindLong(8, value.getTime());
        if (value.getTimeFormat() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getTimeFormat());
        }
        stmt.bindLong(10, value.getRepeat());
        stmt.bindLong(11, value.getPause());
        if (value.getPauseFormat() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getPauseFormat());
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM exercise_table";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteByWorkoutId = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM exercise_table WHERE workoutId LIKE ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteByExerciseId = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM exercise_table WHERE _id LIKE ?";
        return _query;
      }
    };
  }

  @Override
  public void insert(Exercise exercise) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfExercise.insert(exercise);
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
  public void deleteByWorkoutId(int index) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteByWorkoutId.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      _stmt.bindLong(_argIndex, index);
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteByWorkoutId.release(_stmt);
    }
  }

  @Override
  public void deleteByExerciseId(int index) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteByExerciseId.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      _stmt.bindLong(_argIndex, index);
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteByExerciseId.release(_stmt);
    }
  }

  @Override
  public LiveData<List<Exercise>> getAllExercise() {
    final String _sql = "SELECT * from exercise_table ORDER BY _id, title, description, instruction, series, timeCheck, time, timeFormat, repeat, pause, pauseFormat ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new ComputableLiveData<List<Exercise>>() {
      private Observer _observer;

      @Override
      protected List<Exercise> compute() {
        if (_observer == null) {
          _observer = new Observer("exercise_table") {
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
          final int _cursorIndexOfWorkoutId = _cursor.getColumnIndexOrThrow("workoutId");
          final int _cursorIndexOfTitle = _cursor.getColumnIndexOrThrow("title");
          final int _cursorIndexOfDescription = _cursor.getColumnIndexOrThrow("description");
          final int _cursorIndexOfInstruction = _cursor.getColumnIndexOrThrow("instruction");
          final int _cursorIndexOfSeries = _cursor.getColumnIndexOrThrow("series");
          final int _cursorIndexOfTimeCheck = _cursor.getColumnIndexOrThrow("timeCheck");
          final int _cursorIndexOfTime = _cursor.getColumnIndexOrThrow("time");
          final int _cursorIndexOfTimeFormat = _cursor.getColumnIndexOrThrow("timeFormat");
          final int _cursorIndexOfRepeat = _cursor.getColumnIndexOrThrow("repeat");
          final int _cursorIndexOfPause = _cursor.getColumnIndexOrThrow("pause");
          final int _cursorIndexOfPauseFormat = _cursor.getColumnIndexOrThrow("pauseFormat");
          final List<Exercise> _result = new ArrayList<Exercise>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Exercise _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final int _tmpWorkoutId;
            _tmpWorkoutId = _cursor.getInt(_cursorIndexOfWorkoutId);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final String _tmpInstruction;
            _tmpInstruction = _cursor.getString(_cursorIndexOfInstruction);
            final int _tmpSeries;
            _tmpSeries = _cursor.getInt(_cursorIndexOfSeries);
            final boolean _tmpTimeCheck;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfTimeCheck);
            _tmpTimeCheck = _tmp != 0;
            final int _tmpTime;
            _tmpTime = _cursor.getInt(_cursorIndexOfTime);
            final String _tmpTimeFormat;
            _tmpTimeFormat = _cursor.getString(_cursorIndexOfTimeFormat);
            final int _tmpRepeat;
            _tmpRepeat = _cursor.getInt(_cursorIndexOfRepeat);
            final int _tmpPause;
            _tmpPause = _cursor.getInt(_cursorIndexOfPause);
            final String _tmpPauseFormat;
            _tmpPauseFormat = _cursor.getString(_cursorIndexOfPauseFormat);
            _item = new Exercise(_tmpId,_tmpWorkoutId,_tmpTitle,_tmpDescription,_tmpInstruction,_tmpSeries,_tmpTimeCheck,_tmpTime,_tmpTimeFormat,_tmpRepeat,_tmpPause,_tmpPauseFormat);
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
