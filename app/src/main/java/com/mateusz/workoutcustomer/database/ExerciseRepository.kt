package com.mateusz.workoutcustomer.database

import android.arch.lifecycle.LiveData
import android.support.annotation.WorkerThread

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

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun deleteAll(){
        exerciseDao.deleteAll()
    }

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun deleteByWorkoutId(id: Int){
        exerciseDao.deleteByWorkoutId(id)
    }

}