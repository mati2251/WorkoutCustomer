package com.mateusz.workoutcustomer.database

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query

/**
 * It is interface with query to database
 */

@Dao
interface ExerciseDao{

    /**
     * Insert new exercise
     */

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(exercise: Exercise)

    /**
     * Delete all exercise
     */

    @Query("DELETE FROM exercise_table")
    fun deleteAll()

    /**
     * Delete by workout id
     */

    @Query("DELETE FROM exercise_table WHERE workoutId LIKE :index")
    fun deleteByWorkoutId(index : Int)

    /**
     * Delete by exercise id
     */

    @Query("DELETE FROM exercise_table WHERE _id LIKE :index")
    fun deleteByExerciseId(index : Int)

    /**
     * Get all exercise
     */

    @Query("SELECT * from exercise_table ORDER BY _id, title, description, instruction, series, timeCheck, time, timeFormat, repeat, pause, pauseFormat ASC")
    fun getAllExercise() : LiveData<List<Exercise>>
}