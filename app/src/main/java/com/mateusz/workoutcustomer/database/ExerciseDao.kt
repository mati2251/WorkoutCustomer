package com.mateusz.workoutcustomer.database

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query

/**
 * It is interface with query to database
 * @author Mateusz Karłowski
 */

@Dao
interface ExerciseDao {

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
    fun deleteByWorkoutId(index: Int)

    /**
     * Delete by exercise id
     */

    @Query("DELETE FROM exercise_table WHERE _id LIKE :index")
    fun deleteByExerciseId(index: Int)

    /**
     * Get all exercise
     */

    @Query("SELECT * from exercise_table ORDER BY _id, title, description, instruction, series, timeCheck, time, timeFormat, repeat, pause, pauseFormat ASC")
    fun getAllExercise(): LiveData<List<Exercise>>

    @Query("UPDATE exercise_table SET title=:title WHERE _id LIKE :ID")
    fun updateExerciseTitle(title: String, ID: Int)


    @Query("UPDATE exercise_table SET description=:description WHERE _id LIKE :ID")
    fun updateExerciseDescription(description: String, ID: Int)

    @Query("UPDATE exercise_table SET instruction=:instruction WHERE _id LIKE :ID")
    fun updateExerciseInstruction(instruction: String, ID: Int)

    @Query("UPDATE exercise_table SET series=:series WHERE _id LIKE :ID")
    fun updateExerciseSeries(series: Int, ID: Int)

    @Query("UPDATE exercise_table SET time=:time WHERE _id LIKE :ID")
    fun updateExerciseTime(time: Int, ID: Int)

    @Query("UPDATE exercise_table SET timeFormat=:timeFormat WHERE _id LIKE :ID")
    fun updateExerciseTimeFormat(timeFormat: String, ID: Int)

    @Query("UPDATE exercise_table SET repeat=:repeat WHERE _id LIKE :ID")
    fun updateExerciseRepeat(repeat: Int, ID: Int)

    @Query("UPDATE exercise_table SET pause=:pause WHERE _id LIKE :ID")
    fun updateExercisePause(pause: Int, ID: Int)

    @Query("UPDATE exercise_table SET pauseFormat=:pauseFormat WHERE _id LIKE :ID")
    fun updateExercisePauseFormat(pauseFormat: String, ID: Int)
}