package com.mateusz.workoutcustomer.database

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query

@Dao
interface ExerciseDao{
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(exercise: Exercise)

    @Query("DELETE FROM exercise_table")
    fun deleteAll()

    @Query("SELECT * from exercise_table ORDER BY _id, title, description, instruction, series, timeCheck, time, timeFormat, repeat, pause, pauseFormat ASC")
    fun getAllWords() : LiveData<List<Exercise>>
}