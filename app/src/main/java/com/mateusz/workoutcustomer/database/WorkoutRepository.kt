package com.mateusz.workoutcustomer.database

import android.arch.lifecycle.LiveData
import android.support.annotation.WorkerThread

/** Workout Reposority is class contain
 * @property wordDao element for get all workout
 * @property allWorkout has all workour
 */

class WorkoutRepository (private val wordDao: WorkoutDao) {
    var allWorkout : LiveData<List<Workout>> = wordDao.getAllWords()

    /**
     * Insert new element to database
     */
    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(workout: Workout){
        wordDao.insert(workout)
        allWorkout = wordDao.getAllWords()
    }

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun deleteAll(){
        wordDao.deleteAll()
    }

}