package com.mateusz.workoutcustomer.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

@Database(entities = arrayOf(Workout::class), version = 1)
abstract class AppDatabase : RoomDatabase(){
    abstract fun workoutDao() : WorkoutDao
}