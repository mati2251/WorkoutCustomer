package com.mateusz.workoutcustomer.database;

import java.lang.System;

/**
 * * WorkoutViewModel is class extend AndroidViewModel
 * * @property repository is var repository
 * * @property allWorkout is all workout in database with workout and function
 * * @property repositoryExercise is var repository with exercise and function
 * * @property allExercise is all exercise in database
 * * @constructor get repository and allWorkout
 * * @author Mateusz Karłowski
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010%\u001a\u00020\u0016J\u000e\u0010&\u001a\u00020\u00162\u0006\u0010\'\u001a\u00020(J\u000e\u0010)\u001a\u00020\u00162\u0006\u0010\'\u001a\u00020(J\u000e\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020(J\u000e\u0010,\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020(J\u000e\u0010-\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\bJ\u000e\u0010-\u001a\u00020\u00162\u0006\u0010/\u001a\u00020\u000eJ\b\u00100\u001a\u000201H\u0014J\u0016\u00102\u001a\u00020\u00162\u0006\u0010\'\u001a\u00020(2\u0006\u00103\u001a\u000204J\u0016\u00105\u001a\u00020\u00162\u0006\u0010\'\u001a\u00020(2\u0006\u00106\u001a\u000204J\u0016\u00107\u001a\u00020\u00162\u0006\u0010\'\u001a\u00020(2\u0006\u00108\u001a\u00020(J\u0016\u00109\u001a\u00020\u00162\u0006\u0010\'\u001a\u00020(2\u0006\u0010:\u001a\u000204J\u0016\u0010;\u001a\u00020\u00162\u0006\u0010\'\u001a\u00020(2\u0006\u0010<\u001a\u00020(J\u0016\u0010=\u001a\u00020\u00162\u0006\u0010\'\u001a\u00020(2\u0006\u0010>\u001a\u00020(J\u0016\u0010?\u001a\u00020\u00162\u0006\u0010\'\u001a\u00020(2\u0006\u0010@\u001a\u00020(J\u0016\u0010A\u001a\u00020\u00162\u0006\u0010\'\u001a\u00020(2\u0006\u0010B\u001a\u000204J\u0016\u0010C\u001a\u00020\u00162\u0006\u0010\'\u001a\u00020(2\u0006\u0010D\u001a\u000204J\u0016\u0010E\u001a\u00020\u00162\u0006\u0010\'\u001a\u00020(2\u0006\u00103\u001a\u000204J\u0016\u0010F\u001a\u00020\u00162\u0006\u0010\'\u001a\u00020(2\u0006\u0010D\u001a\u000204R&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR&\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\u00128BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020$X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006G"}, d2 = {"Lcom/mateusz/workoutcustomer/database/WorkoutViewModel;", "Landroid/arch/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "allExercise", "Landroid/arch/lifecycle/LiveData;", "", "Lcom/mateusz/workoutcustomer/database/Exercise;", "getAllExercise", "()Landroid/arch/lifecycle/LiveData;", "setAllExercise", "(Landroid/arch/lifecycle/LiveData;)V", "allWorkout", "Lcom/mateusz/workoutcustomer/database/Workout;", "getAllWorkout", "setAllWorkout", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "parentJob", "Lkotlinx/coroutines/Job;", "repository", "Lcom/mateusz/workoutcustomer/database/WorkoutRepository;", "getRepository", "()Lcom/mateusz/workoutcustomer/database/WorkoutRepository;", "setRepository", "(Lcom/mateusz/workoutcustomer/database/WorkoutRepository;)V", "repositoryExercise", "Lcom/mateusz/workoutcustomer/database/ExerciseRepository;", "getRepositoryExercise", "()Lcom/mateusz/workoutcustomer/database/ExerciseRepository;", "setRepositoryExercise", "(Lcom/mateusz/workoutcustomer/database/ExerciseRepository;)V", "scope", "Lkotlinx/coroutines/CoroutineScope;", "deleteAll", "deleteById", "id", "", "deleteExerciseById", "findExerciseById", "index", "findWorkoutById", "insert", "exercise", "workout", "onCleared", "", "updateExerciseDescription", "description", "", "updateExerciseInstruction", "instruction", "updateExercisePause", "pause", "updateExercisePauseFormat", "pauseFormat", "updateExerciseRepeat", "repeat", "updateExerciseSeries", "series", "updateExerciseTime", "time", "updateExerciseTimeFormat", "timeFormat", "updateExerciseTitle", "title", "updateWorkoutDescription", "updateWorkoutTitle", "app_debug"})
public class WorkoutViewModel extends android.arch.lifecycle.AndroidViewModel {
    private kotlinx.coroutines.Job parentJob;
    private final kotlinx.coroutines.CoroutineScope scope = null;
    @org.jetbrains.annotations.NotNull()
    private com.mateusz.workoutcustomer.database.WorkoutRepository repository;
    @org.jetbrains.annotations.NotNull()
    private android.arch.lifecycle.LiveData<java.util.List<com.mateusz.workoutcustomer.database.Workout>> allWorkout;
    @org.jetbrains.annotations.NotNull()
    private com.mateusz.workoutcustomer.database.ExerciseRepository repositoryExercise;
    @org.jetbrains.annotations.NotNull()
    private android.arch.lifecycle.LiveData<java.util.List<com.mateusz.workoutcustomer.database.Exercise>> allExercise;
    
    private final kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mateusz.workoutcustomer.database.WorkoutRepository getRepository() {
        return null;
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull()
    com.mateusz.workoutcustomer.database.WorkoutRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<java.util.List<com.mateusz.workoutcustomer.database.Workout>> getAllWorkout() {
        return null;
    }
    
    public final void setAllWorkout(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.LiveData<java.util.List<com.mateusz.workoutcustomer.database.Workout>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mateusz.workoutcustomer.database.ExerciseRepository getRepositoryExercise() {
        return null;
    }
    
    public final void setRepositoryExercise(@org.jetbrains.annotations.NotNull()
    com.mateusz.workoutcustomer.database.ExerciseRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<java.util.List<com.mateusz.workoutcustomer.database.Exercise>> getAllExercise() {
        return null;
    }
    
    public final void setAllExercise(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.LiveData<java.util.List<com.mateusz.workoutcustomer.database.Exercise>> p0) {
    }
    
    /**
     * * function **insert** insert Workout to database
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job insert(@org.jetbrains.annotations.NotNull()
    com.mateusz.workoutcustomer.database.Workout workout) {
        return null;
    }
    
    /**
     * * function insert insert exercise to database
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job insert(@org.jetbrains.annotations.NotNull()
    com.mateusz.workoutcustomer.database.Exercise exercise) {
        return null;
    }
    
    /**
     * * Function stoped parentJob
     */
    @java.lang.Override()
    protected void onCleared() {
    }
    
    /**
     * * Function delete all data
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteAll() {
        return null;
    }
    
    /**
     * * Function delete workout by ID
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteById(int id) {
        return null;
    }
    
    /**
     * * Function delete exercise by ID
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteExerciseById(int id) {
        return null;
    }
    
    /**
     * * Function find workout by ID
     */
    @org.jetbrains.annotations.NotNull()
    public final com.mateusz.workoutcustomer.database.Workout findWorkoutById(int index) {
        return null;
    }
    
    /**
     * * Function find exercise by ID
     */
    @org.jetbrains.annotations.NotNull()
    public final com.mateusz.workoutcustomer.database.Exercise findExerciseById(int index) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job updateWorkoutTitle(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String title) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job updateWorkoutDescription(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String description) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job updateExerciseTitle(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String title) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job updateExerciseDescription(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String description) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job updateExerciseInstruction(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String instruction) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job updateExerciseSeries(int id, int series) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job updateExerciseTime(int id, int time) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job updateExerciseTimeFormat(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String timeFormat) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job updateExerciseRepeat(int id, int repeat) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job updateExercisePause(int id, int pause) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job updateExercisePauseFormat(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String pauseFormat) {
        return null;
    }
    
    public WorkoutViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}