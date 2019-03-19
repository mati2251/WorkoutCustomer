package com.mateusz.workoutcustomer.database

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

open class WorkoutViewModel (application: Application) : AndroidViewModel(application){

    private var parentJob = Job()
    // By default all the coroutines launched in this scope should be using the Main dispatcher
    private val coroutineContext: CoroutineContext
        get() = parentJob + Dispatchers.Main
    private val scope = CoroutineScope(coroutineContext)
    var repository : WorkoutRepository
    val allWords : LiveData<List<Workout>>

    init{
        WorkoutDatabase.getDatabase(application, scope)
        val workoutDao : WorkoutDao = WorkoutDatabase.getDatabase(application, scope).workoutDao()
        repository = WorkoutRepository(workoutDao)
        allWords = repository.allWorkout
    }

    fun insert(workout: Workout) = scope.launch(Dispatchers.IO) {
        repository.insert(workout)
    }

}