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
 * It opens data, This class is singleton
 */

@Database(entities = arrayOf(Exercise::class), version = 1)
abstract class ExerciseDatabase : RoomDatabase() {
    abstract fun exerciseDao () : ExerciseDao

    companion object {
        @Volatile
        private var INSTANCE: ExerciseDatabase? = null

        /**
         * Singleton implementation and open database
         */

        fun getDatabase(
            context: Context,
            scope: CoroutineScope
        ): ExerciseDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    ExerciseDatabase::class.java,
                    "exercise_database "
                )
                    .fallbackToDestructiveMigration()
                    .addCallback(ExerciseDatabaseCallback(scope))
                    .build()
                INSTANCE = instance
                instance
            }
        }

        private class ExerciseDatabaseCallback(
            private val scope: CoroutineScope
        ) : RoomDatabase.Callback() {
            override fun onOpen(db: SupportSQLiteDatabase) {
                super.onOpen(db)
                INSTANCE?.let {
                    scope.launch(Dispatchers.IO) {
                    }
                }
            }
        }
    }

}
