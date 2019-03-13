package com.mateusz.workoutcustomer.database

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query

@Dao
interface WorkoutDao {

    @Insert
    fun insert(workout : Workout)

    @Query("DELETE FROM workout_table")
    fun deleteAll()

    @Query("SELECT * from workout_table ORDER BY id, title, description ASC")
    fun getAllWords() : List<Workout>
}