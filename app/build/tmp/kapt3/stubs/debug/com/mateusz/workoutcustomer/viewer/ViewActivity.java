package com.mateusz.workoutcustomer.viewer;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0011"}, d2 = {"Lcom/mateusz/workoutcustomer/viewer/ViewActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "exerciseAdapter", "Lcom/mateusz/workoutcustomer/viewer/ExerciseAdapter;", "getExerciseAdapter", "()Lcom/mateusz/workoutcustomer/viewer/ExerciseAdapter;", "setExerciseAdapter", "(Lcom/mateusz/workoutcustomer/viewer/ExerciseAdapter;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "start", "view", "Landroid/view/View;", "Companion", "app_debug"})
public final class ViewActivity extends android.support.v7.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    public com.mateusz.workoutcustomer.viewer.ExerciseAdapter exerciseAdapter;
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
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void start(@org.jetbrains.annotations.NotNull()
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