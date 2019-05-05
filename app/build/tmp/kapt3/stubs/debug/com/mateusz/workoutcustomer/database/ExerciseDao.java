package com.mateusz.workoutcustomer.database;

import java.lang.System;

@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tH\'J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000bH\'\u00a8\u0006\u000e"}, d2 = {"Lcom/mateusz/workoutcustomer/database/ExerciseDao;", "", "deleteAll", "", "deleteByExerciseId", "index", "", "deleteByWorkoutId", "getAllExercise", "Landroid/arch/lifecycle/LiveData;", "", "Lcom/mateusz/workoutcustomer/database/Exercise;", "insert", "exercise", "app_debug"})
public abstract interface ExerciseDao {
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.mateusz.workoutcustomer.database.Exercise exercise);
    
    @android.arch.persistence.room.Query(value = "DELETE FROM exercise_table")
    public abstract void deleteAll();
    
    @android.arch.persistence.room.Query(value = "DELETE FROM exercise_table WHERE workoutId LIKE :index")
    public abstract void deleteByWorkoutId(int index);
    
    @android.arch.persistence.room.Query(value = "DELETE FROM exercise_table WHERE _id LIKE :index")
    public abstract void deleteByExerciseId(int index);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * from exercise_table ORDER BY _id, title, description, instruction, series, timeCheck, time, timeFormat, repeat, pause, pauseFormat ASC")
    public abstract android.arch.lifecycle.LiveData<java.util.List<com.mateusz.workoutcustomer.database.Exercise>> getAllExercise();
}