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
 * @property allWorkout is all workout in database with workout and function
 * @property repositoryExercise is var repository with exercise and function
 * @property allExercise is all exercise in database
 * @constructor get repository and allWorkout
 * @author Mateusz Karłowski
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

    /**
     * Function delete all data
     */

    fun deleteAll() = scope.launch(Dispatchers.IO){
        repository.deleteAll()
        repositoryExercise.deleteAll()
    }

    /**
     * Function delete workout by ID
     */

    fun deleteById(id : Int) = scope.launch(Dispatchers.IO){
        repository.deleteById(id)
        repositoryExercise.deleteByWorkoutId(id)
    }

    /**
     * Function delete exercise by ID
     */

    fun deleteExerciseById(id : Int) = scope.launch(Dispatchers.IO){
        repositoryExercise.deleteByExerciseId(id)
    }

    /**
     * Function find workout by ID
     */

    fun findWorkoutById(index : Int): Workout {
        allWorkout.value?.forEach { workout ->
            if(workout.id==index)
                return workout
        }
        return Workout(0, "Error", "Error")
    }

    /**
     * Function find exercise by ID
     */

    fun findExerciseById(index : Int): Exercise {
        allExercise.value?.forEach { exercise ->
            if(exercise.id==index)
                return exercise
        }
        return Exercise(0, 0, "Error", "Error","Error",0, true,0,"Error", 0, 0,"Error")
    }
}