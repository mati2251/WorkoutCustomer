package com.mateusz.workoutcustomer.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/mateusz/workoutcustomer/database/WorkoutRepository;", "", "wordDao", "Lcom/mateusz/workoutcustomer/database/WorkoutDao;", "(Lcom/mateusz/workoutcustomer/database/WorkoutDao;)V", "allWorkout", "Landroid/arch/lifecycle/LiveData;", "", "Lcom/mateusz/workoutcustomer/database/Workout;", "getAllWorkout", "()Landroid/arch/lifecycle/LiveData;", "setAllWorkout", "(Landroid/arch/lifecycle/LiveData;)V", "insert", "", "workout", "(Lcom/mateusz/workoutcustomer/database/Workout;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class WorkoutRepository {
    @org.jetbrains.annotations.NotNull()
    private android.arch.lifecycle.LiveData<java.util.List<com.mateusz.workoutcustomer.database.Workout>> allWorkout;
    private final com.mateusz.workoutcustomer.database.WorkoutDao wordDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<java.util.List<com.mateusz.workoutcustomer.database.Workout>> getAllWorkout() {
        return null;
    }
    
    public final void setAllWorkout(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.LiveData<java.util.List<com.mateusz.workoutcustomer.database.Workout>> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @android.support.annotation.WorkerThread()
    @kotlin.Suppress(names = {"RedundantSuspendModifier"})
    public final java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.mateusz.workoutcustomer.database.Workout workout, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    public WorkoutRepository(@org.jetbrains.annotations.NotNull()
    com.mateusz.workoutcustomer.database.WorkoutDao wordDao) {
        super();
    }
}