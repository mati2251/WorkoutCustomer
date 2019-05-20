package com.mateusz.workoutcustomer.database

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query

/**
 * **WorkoutDao** is a class for insert data
 * @author Mateusz Karłowski
 */

@Dao
interface WorkoutDao {
    /**
     * Function **insert** insert data to database
     */

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(workout : Workout)

    /**
     * Function **deleteAll** delete all data in database
     */

    @Query("DELETE FROM workout_table")
    fun deleteAll()

    /**
     * Function **getAllWords** get all words form data
     * @return return LiveData<List<Workout>> form database
     */

    @Query("SELECT * from workout_table ORDER BY _id, title, description ASC")
    fun getAllWorkout() : LiveData<List<Workout>>

    /**
     * Function **removeById** remove workout with the same id
     */

    @Query("DELETE FROM workout_table WHERE _id LIKE :ID")
    fun removeById(ID : Int)

    @Query("UPDATE workout_table SET title=:title WHERE _id LIKE :ID")
    fun updateWorkoutTitle(title: String, ID: Int)

    @Query("UPDATE workout_table SET description=:description WHERE _id LIKE :ID")
    fun updateWorkoutDescription(description: String, ID: Int)
}