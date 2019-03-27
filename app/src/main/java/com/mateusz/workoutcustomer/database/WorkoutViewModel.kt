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
    var repositoryExercise : ExerciseRepository
    var allExercise : LiveData<List<Exercise>>

    init{
        var workoutDao : WorkoutDao = WorkoutDatabase.getDatabase(application, scope).workoutDao()
        repository = WorkoutRepository(workoutDao)
        allWorkout = repository.allWorkout
        var exerciseDao : ExerciseDao = ExerciseDatabase.getDatabase(application, scope).exerciseDao()
        repositoryExercise = ExerciseRepository(exerciseDao)
        allExercise = repositoryExercise.allExercise
    }

    /**
     * function **insert** insert Workout to database
     */

    fun insert(workout: Workout) = scope.launch(Dispatchers.IO) {
        repository.insert(workout)
    }

    /**
     * function insert insert exercise to database
     */

    fun insert(exercise: Exercise) = scope.launch(Dispatchers.IO) {
        repositoryExercise.insert(exercise)
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
        repositoryExercise.deleteAll()
    }

    fun findWorkoutById(index : Int): Workout {
        allWorkout.value?.forEach { workout ->
            if(workout.id==index)
                return workout
        }
        return Workout(0, "Error", "Error")
    }
}