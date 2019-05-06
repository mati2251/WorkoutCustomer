package com.mateusz.workoutcustomer.database;

import java.lang.System;

/**
 * * class **WorkoutDatabase** is singleton for build and open database
 * * @author Mateusz Karłowski
 */
@android.arch.persistence.room.Database(entities = {com.mateusz.workoutcustomer.database.Workout.class}, version = 1)
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/mateusz/workoutcustomer/database/WorkoutDatabase;", "Landroid/arch/persistence/room/RoomDatabase;", "()V", "workoutDao", "Lcom/mateusz/workoutcustomer/database/WorkoutDao;", "Companion", "app_debug"})
public abstract class WorkoutDatabase extends android.arch.persistence.room.RoomDatabase {
    private static volatile com.mateusz.workoutcustomer.database.WorkoutDatabase INSTANCE;
    public static final com.mateusz.workoutcustomer.database.WorkoutDatabase.Companion Companion = null;
    
    /**
     * * Abstract fun
     *     * @return WorkoutDao
     */
    @org.jetbrains.annotations.NotNull()
    public abstract com.mateusz.workoutcustomer.database.WorkoutDao workoutDao();
    
    public WorkoutDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\nB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/mateusz/workoutcustomer/database/WorkoutDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/mateusz/workoutcustomer/database/WorkoutDatabase;", "getDatabase", "context", "Landroid/content/Context;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "WorkoutDatabaseCallback", "app_debug"})
    public static final class Companion {
        
        /**
         * * Singleton implementation and open database
         */
        @org.jetbrains.annotations.NotNull()
        public final com.mateusz.workoutcustomer.database.WorkoutDatabase getDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        kotlinx.coroutines.CoroutineScope scope) {
            return null;
        }
        
        private Companion() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/mateusz/workoutcustomer/database/WorkoutDatabase$Companion$WorkoutDatabaseCallback;", "Landroid/arch/persistence/room/RoomDatabase$Callback;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;)V", "onOpen", "", "db", "Landroid/arch/persistence/db/SupportSQLiteDatabase;", "app_debug"})
        static final class WorkoutDatabaseCallback extends android.arch.persistence.room.RoomDatabase.Callback {
            private final kotlinx.coroutines.CoroutineScope scope = null;
            
            @java.lang.Override()
            public void onOpen(@org.jetbrains.annotations.NotNull()
            android.arch.persistence.db.SupportSQLiteDatabase db) {
            }
            
            public WorkoutDatabaseCallback(@org.jetbrains.annotations.NotNull()
            kotlinx.coroutines.CoroutineScope scope) {
                super();
            }
        }
    }
}