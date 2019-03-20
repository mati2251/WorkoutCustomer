package com.mateusz.workoutcustomer.database

import android.arch.lifecycle.LiveData
import android.support.annotation.WorkerThread

class WorkoutRepository (private val wordDao: WorkoutDao) {
    var allWorkout : LiveData<List<Workout>> = wordDao.getAllWords()

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(workout: Workout){
        wordDao.insert(workout)
        allWorkout = wordDao.getAllWords()
    }

}