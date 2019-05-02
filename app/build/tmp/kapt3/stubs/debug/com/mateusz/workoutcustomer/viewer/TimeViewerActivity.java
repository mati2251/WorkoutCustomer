package com.mateusz.workoutcustomer.viewer;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u000e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lcom/mateusz/workoutcustomer/viewer/TimeViewerActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "close", "", "getClose", "()Z", "setClose", "(Z)V", "exercise", "Lcom/mateusz/workoutcustomer/database/Exercise;", "getExercise", "()Lcom/mateusz/workoutcustomer/database/Exercise;", "setExercise", "(Lcom/mateusz/workoutcustomer/database/Exercise;)V", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "pause", "view", "Landroid/view/View;", "Companion", "app_debug"})
public final class TimeViewerActivity extends android.support.v7.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    public com.mateusz.workoutcustomer.database.Exercise exercise;
    private boolean close;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String pause;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String pauseFormat;
    public static final com.mateusz.workoutcustomer.viewer.TimeViewerActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.mateusz.workoutcustomer.database.Exercise getExercise() {
        return null;
    }
    
    public final void setExercise(@org.jetbrains.annotations.NotNull()
    com.mateusz.workoutcustomer.database.Exercise p0) {
    }
    
    public final boolean getClose() {
        return false;
    }
    
    public final void setClose(boolean p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void pause(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public TimeViewerActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/mateusz/workoutcustomer/viewer/TimeViewerActivity$Companion;", "", "()V", "pause", "", "getPause", "()Ljava/lang/String;", "setPause", "(Ljava/lang/String;)V", "pauseFormat", "getPauseFormat", "setPauseFormat", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPause() {
            return null;
        }
        
        public final void setPause(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPauseFormat() {
            return null;
        }
        
        public final void setPauseFormat(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        private Companion() {
            super();
        }
    }
}