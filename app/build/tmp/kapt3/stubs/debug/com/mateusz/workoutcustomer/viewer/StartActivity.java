package com.mateusz.workoutcustomer.viewer;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014\u00a8\u0006\b"}, d2 = {"Lcom/mateusz/workoutcustomer/viewer/StartActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"})
public final class StartActivity extends android.support.v7.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    private static java.util.ArrayList<com.mateusz.workoutcustomer.database.Exercise> workoutExercise;
    private static int position;
    private static int series;
    public static final com.mateusz.workoutcustomer.viewer.StartActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public StartActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR*\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0014"}, d2 = {"Lcom/mateusz/workoutcustomer/viewer/StartActivity$Companion;", "", "()V", "position", "", "getPosition", "()I", "setPosition", "(I)V", "series", "getSeries", "setSeries", "workoutExercise", "Ljava/util/ArrayList;", "Lcom/mateusz/workoutcustomer/database/Exercise;", "Lkotlin/collections/ArrayList;", "getWorkoutExercise", "()Ljava/util/ArrayList;", "setWorkoutExercise", "(Ljava/util/ArrayList;)V", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<com.mateusz.workoutcustomer.database.Exercise> getWorkoutExercise() {
            return null;
        }
        
        public final void setWorkoutExercise(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.mateusz.workoutcustomer.database.Exercise> p0) {
        }
        
        public final int getPosition() {
            return 0;
        }
        
        public final void setPosition(int p0) {
        }
        
        public final int getSeries() {
            return 0;
        }
        
        public final void setSeries(int p0) {
        }
        
        private Companion() {
            super();
        }
    }
}