package com.mateusz.workoutcustomer.menu;

import java.lang.System;

/**
 * * MainActivity is splash screen
 * * It shows  on 0.7 seconds layout activity_welcom and switch to MenuActivity
 * * @author Mateusz Karłowski
 * *
 * * @property workoutViewModel is object class WorkoutViewModel
 * * @see WorkoutViewModel
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014\u00a8\u0006\b"}, d2 = {"Lcom/mateusz/workoutcustomer/menu/MainActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"})
public final class MainActivity extends android.support.v7.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    public static com.mateusz.workoutcustomer.database.WorkoutViewModel workoutViewModel;
    public static final com.mateusz.workoutcustomer.menu.MainActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    /**
     * * onCreate create WorkoutViewModel and ready other data in database.
     *     * The second task onCreate is stop splash screen on 7 seconds
     */
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public MainActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/mateusz/workoutcustomer/menu/MainActivity$Companion;", "", "()V", "workoutViewModel", "Lcom/mateusz/workoutcustomer/database/WorkoutViewModel;", "getWorkoutViewModel", "()Lcom/mateusz/workoutcustomer/database/WorkoutViewModel;", "setWorkoutViewModel", "(Lcom/mateusz/workoutcustomer/database/WorkoutViewModel;)V", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.mateusz.workoutcustomer.database.WorkoutViewModel getWorkoutViewModel() {
            return null;
        }
        
        public final void setWorkoutViewModel(@org.jetbrains.annotations.NotNull()
        com.mateusz.workoutcustomer.database.WorkoutViewModel p0) {
        }
        
        private Companion() {
            super();
        }
    }
}