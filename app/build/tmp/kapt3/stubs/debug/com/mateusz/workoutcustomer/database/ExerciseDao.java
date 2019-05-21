package com.mateusz.workoutcustomer.database;

import java.lang.System;

/**
 * * It is interface with query to database
 * * @author Mateusz Karłowski
 */
@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0012\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\'J\b\u0010\u0007\u001a\u00020\u0003H\'J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005H\'J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005H\'J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fH\'J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000eH\'J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0005H\'J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0005H\'J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H\'J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0005H\'J\u0018\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H\'J\u0018\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H\'J\u0018\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H\'J\u0018\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0005H\'J\u0018\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0005H\'\u00a8\u0006%"}, d2 = {"Lcom/mateusz/workoutcustomer/database/ExerciseDao;", "", "changeExerciseID", "", "toID", "", "fromID", "deleteAll", "deleteByExerciseId", "index", "deleteByWorkoutId", "getAllExercise", "Landroid/arch/lifecycle/LiveData;", "", "Lcom/mateusz/workoutcustomer/database/Exercise;", "insert", "exercise", "updateExerciseDescription", "description", "", "ID", "updateExerciseInstruction", "instruction", "updateExercisePause", "pause", "updateExercisePauseFormat", "pauseFormat", "updateExerciseRepeat", "repeat", "updateExerciseSeries", "series", "updateExerciseTime", "time", "updateExerciseTimeFormat", "timeFormat", "updateExerciseTitle", "title", "app_debug"})
public abstract interface ExerciseDao {
    
    /**
     * * Insert new exercise
     */
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.mateusz.workoutcustomer.database.Exercise exercise);
    
    /**
     * * Delete all exercise
     */
    @android.arch.persistence.room.Query(value = "DELETE FROM exercise_table")
    public abstract void deleteAll();
    
    /**
     * * Delete by workout id
     */
    @android.arch.persistence.room.Query(value = "DELETE FROM exercise_table WHERE workoutId LIKE :index")
    public abstract void deleteByWorkoutId(int index);
    
    /**
     * * Delete by exercise id
     */
    @android.arch.persistence.room.Query(value = "DELETE FROM exercise_table WHERE _id LIKE :index")
    public abstract void deleteByExerciseId(int index);
    
    /**
     * * Get all exercise
     */
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * from exercise_table ORDER BY _id, title, description, instruction, series, timeCheck, time, timeFormat, repeat, pause, pauseFormat ASC")
    public abstract android.arch.lifecycle.LiveData<java.util.List<com.mateusz.workoutcustomer.database.Exercise>> getAllExercise();
    
    @android.arch.persistence.room.Query(value = "UPDATE exercise_table SET title=:title WHERE _id LIKE :ID")
    public abstract void updateExerciseTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String title, int ID);
    
    @android.arch.persistence.room.Query(value = "UPDATE exercise_table SET _id=:toID WHERE _id LIKE :fromID")
    public abstract void changeExerciseID(int toID, int fromID);
    
    @android.arch.persistence.room.Query(value = "UPDATE exercise_table SET description=:description WHERE _id LIKE :ID")
    public abstract void updateExerciseDescription(@org.jetbrains.annotations.NotNull()
    java.lang.String description, int ID);
    
    @android.arch.persistence.room.Query(value = "UPDATE exercise_table SET instruction=:instruction WHERE _id LIKE :ID")
    public abstract void updateExerciseInstruction(@org.jetbrains.annotations.NotNull()
    java.lang.String instruction, int ID);
    
    @android.arch.persistence.room.Query(value = "UPDATE exercise_table SET series=:series WHERE _id LIKE :ID")
    public abstract void updateExerciseSeries(int series, int ID);
    
    @android.arch.persistence.room.Query(value = "UPDATE exercise_table SET time=:time WHERE _id LIKE :ID")
    public abstract void updateExerciseTime(int time, int ID);
    
    @android.arch.persistence.room.Query(value = "UPDATE exercise_table SET timeFormat=:timeFormat WHERE _id LIKE :ID")
    public abstract void updateExerciseTimeFormat(@org.jetbrains.annotations.NotNull()
    java.lang.String timeFormat, int ID);
    
    @android.arch.persistence.room.Query(value = "UPDATE exercise_table SET repeat=:repeat WHERE _id LIKE :ID")
    public abstract void updateExerciseRepeat(int repeat, int ID);
    
    @android.arch.persistence.room.Query(value = "UPDATE exercise_table SET pause=:pause WHERE _id LIKE :ID")
    public abstract void updateExercisePause(int pause, int ID);
    
    @android.arch.persistence.room.Query(value = "UPDATE exercise_table SET pauseFormat=:pauseFormat WHERE _id LIKE :ID")
    public abstract void updateExercisePauseFormat(@org.jetbrains.annotations.NotNull()
    java.lang.String pauseFormat, int ID);
}