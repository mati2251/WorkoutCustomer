package com.mateusz.workoutcustomer.database

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query

@Dao
interface WorkoutDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(workout : Workout)

    @Query("DELETE FROM workout_table")
    fun deleteAll()

    @Query("SELECT * from workout_table ORDER BY _id, title, description ASC")
    fun getAllWords() : LiveData<List<Workout>>
}