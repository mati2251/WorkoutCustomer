package com.mateusz.workoutcustomer.database

import android.arch.persistence.db.SupportSQLiteDatabase
import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

/**
 * class **WorkoutDatabase** is singleton for build and open database
 */

@Database(entities = arrayOf(Workout::class), version = 1)
abstract class WorkoutDatabase : RoomDatabase(){
    /**
     * Abstract fun
     * @return WorkoutDao
     */
    abstract fun workoutDao() : WorkoutDao

    companion object {
        @Volatile
        private var INSTANCE: WorkoutDatabase? = null

        /**
         * Singleton implementation and open database
         */

        fun getDatabase(
            context: Context,
            scope: CoroutineScope
        ): WorkoutDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    WorkoutDatabase::class.java,
                    "workout_database"
                )
                    .fallbackToDestructiveMigration()
                    .addCallback(WorkoutDatabaseCallback(scope))
                    .build()
                INSTANCE = instance
                instance
            }
        }

        private class WorkoutDatabaseCallback(
            private val scope: CoroutineScope
        ) : RoomDatabase.Callback() {
            override fun onOpen(db: SupportSQLiteDatabase) {
                super.onOpen(db)
                INSTANCE?.let { database ->
                    scope.launch(Dispatchers.IO) {
                    }
                }
            }
        }
    }
}