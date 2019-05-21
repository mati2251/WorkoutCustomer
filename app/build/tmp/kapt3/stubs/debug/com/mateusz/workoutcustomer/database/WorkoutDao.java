package com.mateusz.workoutcustomer.database;

import java.lang.System;

/**
 * * **WorkoutDao** is a class for insert data
 * * @author Mateusz Karłowski
 */
@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0014\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H\'J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0007H\'J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\'J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fH\'J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fH\'\u00a8\u0006\u0012"}, d2 = {"Lcom/mateusz/workoutcustomer/database/WorkoutDao;", "", "deleteAll", "", "getAllWorkout", "Landroid/arch/lifecycle/LiveData;", "", "Lcom/mateusz/workoutcustomer/database/Workout;", "insert", "workout", "removeById", "ID", "", "updateWorkoutDescription", "description", "", "updateWorkoutTitle", "title", "app_debug"})
public abstract interface WorkoutDao {
    
    /**
     * * Function **insert** insert data to database
     */
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.mateusz.workoutcustomer.database.Workout workout);
    
    /**
     * * Function **deleteAll** delete all data in database
     */
    @android.arch.persistence.room.Query(value = "DELETE FROM workout_table")
    public abstract void deleteAll();
    
    /**
     * * Function **getAllWords** get all words form data
     *     * @return return LiveData<List<Workout>> form database
     */
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * from workout_table ORDER BY _id, title, description ASC")
    public abstract android.arch.lifecycle.LiveData<java.util.List<com.mateusz.workoutcustomer.database.Workout>> getAllWorkout();
    
    /**
     * * Function **removeById** remove workout with the same id
     */
    @android.arch.persistence.room.Query(value = "DELETE FROM workout_table WHERE _id LIKE :ID")
    public abstract void removeById(int ID);
    
    @android.arch.persistence.room.Query(value = "UPDATE workout_table SET title=:title WHERE _id LIKE :ID")
    public abstract void updateWorkoutTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String title, int ID);
    
    @android.arch.persistence.room.Query(value = "UPDATE workout_table SET description=:description WHERE _id LIKE :ID")
    public abstract void updateWorkoutDescription(@org.jetbrains.annotations.NotNull()
    java.lang.String description, int ID);
}