package com.mateusz.workoutcustomer.database;

import java.lang.System;

/**
 * * WorkoutViewModel is class extend AndroidViewModel
 * * @property repository is var repository
 * * @property allWorkout is all workout in database
 * * @constructor get repository and allWorkout
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\bJ\b\u0010\u001d\u001a\u00020\u001eH\u0014R&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/mateusz/workoutcustomer/database/WorkoutViewModel;", "Landroid/arch/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "allWorkout", "Landroid/arch/lifecycle/LiveData;", "", "Lcom/mateusz/workoutcustomer/database/Workout;", "getAllWorkout", "()Landroid/arch/lifecycle/LiveData;", "setAllWorkout", "(Landroid/arch/lifecycle/LiveData;)V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "parentJob", "Lkotlinx/coroutines/Job;", "repository", "Lcom/mateusz/workoutcustomer/database/WorkoutRepository;", "getRepository", "()Lcom/mateusz/workoutcustomer/database/WorkoutRepository;", "setRepository", "(Lcom/mateusz/workoutcustomer/database/WorkoutRepository;)V", "scope", "Lkotlinx/coroutines/CoroutineScope;", "insert", "workout", "onCleared", "", "app_release"})
public class WorkoutViewModel extends android.arch.lifecycle.AndroidViewModel {
    private kotlinx.coroutines.Job parentJob;
    private final kotlinx.coroutines.CoroutineScope scope = null;
    @org.jetbrains.annotations.NotNull()
    private com.mateusz.workoutcustomer.database.WorkoutRepository repository;
    @org.jetbrains.annotations.NotNull()
    private android.arch.lifecycle.LiveData<java.util.List<com.mateusz.workoutcustomer.database.Workout>> allWorkout;
    
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
    
    /**
     * * function **insert** insert Workout to database
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job insert(@org.jetbrains.annotations.NotNull()
    com.mateusz.workoutcustomer.database.Workout workout) {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public WorkoutViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}