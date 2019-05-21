package com.mateusz.workoutcustomer.database;

import java.lang.System;

/**
 * * This class have functions evokes other function from ExerciseDao
 * * @author Mateusz Karłowski
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J!\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0011\u0010\u0013\u001a\u00020\u000eH\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0010H\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0010H\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\bH\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ!\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001eH\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ!\u0010 \u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u001eH\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ!\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u0010H\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J!\u0010$\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u001eH\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ!\u0010&\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\'\u001a\u00020\u0010H\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J!\u0010(\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u0010H\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J!\u0010*\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u0010H\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J!\u0010,\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\u001eH\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ!\u0010.\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010/\u001a\u00020\u001eH\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fR&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00060"}, d2 = {"Lcom/mateusz/workoutcustomer/database/ExerciseRepository;", "", "exerciseDao", "Lcom/mateusz/workoutcustomer/database/ExerciseDao;", "(Lcom/mateusz/workoutcustomer/database/ExerciseDao;)V", "allExercise", "Landroid/arch/lifecycle/LiveData;", "", "Lcom/mateusz/workoutcustomer/database/Exercise;", "getAllExercise", "()Landroid/arch/lifecycle/LiveData;", "setAllExercise", "(Landroid/arch/lifecycle/LiveData;)V", "changeExerciseId", "", "toID", "", "fromID", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteByExerciseId", "id", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteByWorkoutId", "insert", "exercise", "(Lcom/mateusz/workoutcustomer/database/Exercise;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateExerciseDescription", "description", "", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateExerciseInstruction", "instruction", "updateExercisePause", "pause", "updateExercisePauseFormat", "pauseFormat", "updateExerciseRepeat", "repeat", "updateExerciseSeries", "series", "updateExerciseTime", "time", "updateExerciseTimeFormat", "timeFormat", "updateExerciseTitle", "title", "app_debug"})
public final class ExerciseRepository {
    @org.jetbrains.annotations.NotNull()
    private android.arch.lifecycle.LiveData<java.util.List<com.mateusz.workoutcustomer.database.Exercise>> allExercise;
    private final com.mateusz.workoutcustomer.database.ExerciseDao exerciseDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<java.util.List<com.mateusz.workoutcustomer.database.Exercise>> getAllExercise() {
        return null;
    }
    
    public final void setAllExercise(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.LiveData<java.util.List<com.mateusz.workoutcustomer.database.Exercise>> p0) {
    }
    
    /**
     * * Insert new element to database
     */
    @org.jetbrains.annotations.Nullable()
    @android.support.annotation.WorkerThread()
    @kotlin.Suppress(names = {"RedundantSuspendModifier"})
    public final java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.mateusz.workoutcustomer.database.Exercise exercise, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    /**
     * * Delete all element
     */
    @org.jetbrains.annotations.Nullable()
    @android.support.annotation.WorkerThread()
    @kotlin.Suppress(names = {"RedundantSuspendModifier"})
    public final java.lang.Object deleteAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    /**
     * * Delete all element the same workout ID
     */
    @org.jetbrains.annotations.Nullable()
    @android.support.annotation.WorkerThread()
    @kotlin.Suppress(names = {"RedundantSuspendModifier"})
    public final java.lang.Object deleteByWorkoutId(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    /**
     * * Delete all element the same exercise ID
     */
    @org.jetbrains.annotations.Nullable()
    @android.support.annotation.WorkerThread()
    @kotlin.Suppress(names = {"RedundantSuspendModifier"})
    public final java.lang.Object deleteByExerciseId(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @android.support.annotation.WorkerThread()
    @kotlin.Suppress(names = {"RedundantSuspendModifier"})
    public final java.lang.Object updateExerciseTitle(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @android.support.annotation.WorkerThread()
    @kotlin.Suppress(names = {"RedundantSuspendModifier"})
    public final java.lang.Object updateExerciseDescription(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @android.support.annotation.WorkerThread()
    @kotlin.Suppress(names = {"RedundantSuspendModifier"})
    public final java.lang.Object updateExerciseInstruction(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String instruction, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @android.support.annotation.WorkerThread()
    @kotlin.Suppress(names = {"RedundantSuspendModifier"})
    public final java.lang.Object updateExerciseSeries(int id, int series, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @android.support.annotation.WorkerThread()
    @kotlin.Suppress(names = {"RedundantSuspendModifier"})
    public final java.lang.Object updateExerciseTime(int id, int time, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @android.support.annotation.WorkerThread()
    @kotlin.Suppress(names = {"RedundantSuspendModifier"})
    public final java.lang.Object updateExerciseTimeFormat(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String timeFormat, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @android.support.annotation.WorkerThread()
    @kotlin.Suppress(names = {"RedundantSuspendModifier"})
    public final java.lang.Object updateExerciseRepeat(int id, int repeat, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @android.support.annotation.WorkerThread()
    @kotlin.Suppress(names = {"RedundantSuspendModifier"})
    public final java.lang.Object updateExercisePause(int id, int pause, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @android.support.annotation.WorkerThread()
    @kotlin.Suppress(names = {"RedundantSuspendModifier"})
    public final java.lang.Object updateExercisePauseFormat(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String pauseFormat, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @android.support.annotation.WorkerThread()
    @kotlin.Suppress(names = {"RedundantSuspendModifier"})
    public final java.lang.Object changeExerciseId(int toID, int fromID, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
        return null;
    }
    
    public ExerciseRepository(@org.jetbrains.annotations.NotNull()
    com.mateusz.workoutcustomer.database.ExerciseDao exerciseDao) {
        super();
    }
}