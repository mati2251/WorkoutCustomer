package com.mateusz.workoutcustomer.database

import android.arch.lifecycle.LiveData
import android.support.annotation.WorkerThread

/** Workout Reposority is class contain
 * @property wordDao element for get all workout
 * @property allWorkout has all workour
 */

class WorkoutRepository (private val workoutDao: WorkoutDao) {
    var allWorkout : LiveData<List<Workout>> = workoutDao.getAllWorkout()

    /**
     * Insert new element to database
     */
    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(workout: Workout){
        workoutDao.insert(workout)
        allWorkout = workoutDao.getAllWorkout()
    }

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun deleteAll(){
        workoutDao.deleteAll()
    }

}