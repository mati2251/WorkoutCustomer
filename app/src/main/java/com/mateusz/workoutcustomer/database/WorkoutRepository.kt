package com.mateusz.workoutcustomer.database

import android.arch.lifecycle.LiveData
import android.support.annotation.WorkerThread
import android.util.EventLogTags

/** Workout Reposority is class contain
 * @property wordDao element for get all workout
 * @property allWorkout has all workour
 * @author Mateusz Karłowski
 */

class WorkoutRepository(private val workoutDao: WorkoutDao) {
    var allWorkout: LiveData<List<Workout>> = workoutDao.getAllWorkout()

    /**
     * Insert new element to database
     */
    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(workout: Workout) {
        workoutDao.insert(workout)
        allWorkout = workoutDao.getAllWorkout()
    }

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun deleteAll() {
        workoutDao.deleteAll()
    }

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun deleteById(id: Int) {
        workoutDao.removeById(id)
    }

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun updateWorkoutTitle(id: Int, title : String) {
        workoutDao.updateWorkoutTitle(title,id)
    }

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun updateWorkoutDescription(id: Int, description : String) {
        workoutDao.updateWorkoutDescription(description,id)
    }
}