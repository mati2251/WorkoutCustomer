package com.mateusz.workoutcustomer.database;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Callback;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Configuration;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.RoomOpenHelper;
import android.arch.persistence.room.RoomOpenHelper.Delegate;
import android.arch.persistence.room.util.TableInfo;
import android.arch.persistence.room.util.TableInfo.Column;
import android.arch.persistence.room.util.TableInfo.ForeignKey;
import android.arch.persistence.room.util.TableInfo.Index;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("unchecked")
public class ExerciseDatabase_Impl extends ExerciseDatabase {
  private volatile ExerciseDao _exerciseDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `exercise_table` (`_id` INTEGER NOT NULL, `workoutId` INTEGER NOT NULL, `title` TEXT NOT NULL, `description` TEXT NOT NULL, `instruction` TEXT NOT NULL, `series` INTEGER NOT NULL, `timeCheck` INTEGER NOT NULL, `time` INTEGER NOT NULL, `timeFormat` TEXT NOT NULL, `repeat` INTEGER NOT NULL, `pause` INTEGER NOT NULL, `pauseFormat` TEXT NOT NULL, PRIMARY KEY(`_id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"2ccd563b88459aa1adcbc2c79d731b7e\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `exercise_table`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsExerciseTable = new HashMap<String, TableInfo.Column>(12);
        _columnsExerciseTable.put("_id", new TableInfo.Column("_id", "INTEGER", true, 1));
        _columnsExerciseTable.put("workoutId", new TableInfo.Column("workoutId", "INTEGER", true, 0));
        _columnsExerciseTable.put("title", new TableInfo.Column("title", "TEXT", true, 0));
        _columnsExerciseTable.put("description", new TableInfo.Column("description", "TEXT", true, 0));
        _columnsExerciseTable.put("instruction", new TableInfo.Column("instruction", "TEXT", true, 0));
        _columnsExerciseTable.put("series", new TableInfo.Column("series", "INTEGER", true, 0));
        _columnsExerciseTable.put("timeCheck", new TableInfo.Column("timeCheck", "INTEGER", true, 0));
        _columnsExerciseTable.put("time", new TableInfo.Column("time", "INTEGER", true, 0));
        _columnsExerciseTable.put("timeFormat", new TableInfo.Column("timeFormat", "TEXT", true, 0));
        _columnsExerciseTable.put("repeat", new TableInfo.Column("repeat", "INTEGER", true, 0));
        _columnsExerciseTable.put("pause", new TableInfo.Column("pause", "INTEGER", true, 0));
        _columnsExerciseTable.put("pauseFormat", new TableInfo.Column("pauseFormat", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysExerciseTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesExerciseTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoExerciseTable = new TableInfo("exercise_table", _columnsExerciseTable, _foreignKeysExerciseTable, _indicesExerciseTable);
        final TableInfo _existingExerciseTable = TableInfo.read(_db, "exercise_table");
        if (! _infoExerciseTable.equals(_existingExerciseTable)) {
          throw new IllegalStateException("Migration didn't properly handle exercise_table(com.mateusz.workoutcustomer.database.Exercise).\n"
                  + " Expected:\n" + _infoExerciseTable + "\n"
                  + " Found:\n" + _existingExerciseTable);
        }
      }
    }, "2ccd563b88459aa1adcbc2c79d731b7e", "61b83d92be6ae71bfc1a5e4a64c56009");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "exercise_table");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `exercise_table`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public ExerciseDao exerciseDao() {
    if (_exerciseDao != null) {
      return _exerciseDao;
    } else {
      synchronized(this) {
        if(_exerciseDao == null) {
          _exerciseDao = new ExerciseDao_Impl(this);
        }
        return _exerciseDao;
      }
    }
  }
}
