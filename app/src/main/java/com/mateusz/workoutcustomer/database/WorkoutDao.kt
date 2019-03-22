package com.mateusz.workoutcustomer.database

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query

/** **WorkoutDao** is a class for insert data
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
    fun getAllWords() : LiveData<List<Workout>>

    @Query("SELECT * FROM workout_table WHERE _id LIKE :index ORDER BY _id, title, description ASC")
    fun getFromId(index : Int) : Workout

    @Query("DELETE FROM workout_table WHERE _id LIKE :index")
    fun removeById(index : Int)
}