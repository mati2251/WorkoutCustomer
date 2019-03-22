package com.mateusz.workoutcustomer.database

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

/**
 * WorkoutViewModel is class extend AndroidViewModel
 * @property repository is var repository
 * @property allWorkout is all workout in database
 * @constructor get repository and allWorkout
 */

open class WorkoutViewModel (application: Application) : AndroidViewModel(application){

    private var parentJob = Job()
    private val coroutineContext: CoroutineContext
        get() = parentJob + Dispatchers.Main
    private val scope = CoroutineScope(coroutineContext)
    var repository : WorkoutRepository
    var allWorkout : LiveData<List<Workout>>

    init{
        WorkoutDatabase.getDatabase(application, scope)
        var workoutDao : WorkoutDao = WorkoutDatabase.getDatabase(application, scope).workoutDao()
        repository = WorkoutRepository(workoutDao)
        allWorkout = repository.allWorkout
    }

    /**
     * function **insert** insert Workout to database
     */

    fun insert(workout: Workout) = scope.launch(Dispatchers.IO) {
        repository.insert(workout)
    }

    /**
     * Function stoped parentJob
     */

    override fun onCleared() {
        super.onCleared()
        parentJob.cancel()
    }

    fun deleteAll() = scope.launch(Dispatchers.IO){
        repository.deleteAll()
    }
}