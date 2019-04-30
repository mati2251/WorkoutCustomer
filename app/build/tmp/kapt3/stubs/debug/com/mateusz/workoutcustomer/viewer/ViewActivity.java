package com.mateusz.workoutcustomer.viewer;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0012\u0010\u0014\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\u000e\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lcom/mateusz/workoutcustomer/viewer/ViewActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "exerciseAdapter", "Lcom/mateusz/workoutcustomer/viewer/ExerciseAdapter;", "getExerciseAdapter", "()Lcom/mateusz/workoutcustomer/viewer/ExerciseAdapter;", "setExerciseAdapter", "(Lcom/mateusz/workoutcustomer/viewer/ExerciseAdapter;)V", "id", "", "getId", "()I", "setId", "(I)V", "deleteWorkout", "", "view", "Landroid/view/View;", "newExercise", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "start", "Companion", "app_debug"})
public final class ViewActivity extends android.support.v7.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    public com.mateusz.workoutcustomer.viewer.ExerciseAdapter exerciseAdapter;
    private int id;
    private static int workoutId;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String WORKOUTID;
    public static final com.mateusz.workoutcustomer.viewer.ViewActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.mateusz.workoutcustomer.viewer.ExerciseAdapter getExerciseAdapter() {
        return null;
    }
    
    public final void setExerciseAdapter(@org.jetbrains.annotations.NotNull()
    com.mateusz.workoutcustomer.viewer.ExerciseAdapter p0) {
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void start(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void deleteWorkout(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void newExercise(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public ViewActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/mateusz/workoutcustomer/viewer/ViewActivity$Companion;", "", "()V", "WORKOUTID", "", "getWORKOUTID", "()Ljava/lang/String;", "setWORKOUTID", "(Ljava/lang/String;)V", "workoutId", "", "getWorkoutId", "()I", "setWorkoutId", "(I)V", "app_debug"})
    public static final class Companion {
        
        public final int getWorkoutId() {
            return 0;
        }
        
        public final void setWorkoutId(int p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getWORKOUTID() {
            return null;
        }
        
        public final void setWORKOUTID(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        private Companion() {
            super();
        }
    }
}