package com.mateusz.workoutcustomer.database

import android.arch.lifecycle.LiveData
import android.support.annotation.WorkerThread

/**
 * This class have functions evokes other function from ExerciseDao
 */

class ExerciseRepository (private val exerciseDao: ExerciseDao) {
    var allExercise : LiveData<List<Exercise>> = exerciseDao.getAllExercise()

    /**
     * Insert new element to database
     */
    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(exercise: Exercise){
        exerciseDao.insert(exercise)
        allExercise = exerciseDao.getAllExercise()
    }

    /**
     * Delete all element
     */

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun deleteAll(){
        exerciseDao.deleteAll()
    }

    /**
     * Delete all element the same workout ID
     */

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun deleteByWorkoutId(id: Int){
        exerciseDao.deleteByWorkoutId(id)
    }

    /**
     * Delete all element the same exercise ID
     */

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun deleteByExerciseId(id: Int){
        exerciseDao.deleteByExerciseId(id)
    }

}