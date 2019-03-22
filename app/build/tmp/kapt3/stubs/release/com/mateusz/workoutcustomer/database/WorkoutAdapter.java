package com.mateusz.workoutcustomer.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001cB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u00132\n\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u001c\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0011H\u0016J\u0014\u0010\u001a\u001a\u00020\u00132\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\nR\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001d"}, d2 = {"Lcom/mateusz/workoutcustomer/database/WorkoutAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/mateusz/workoutcustomer/database/WorkoutAdapter$WorkoutViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mInflater", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "mWorkout", "", "Lcom/mateusz/workoutcustomer/database/Workout;", "getMWorkout", "()Ljava/util/List;", "setMWorkout", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "positon", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "p1", "setList", "list", "WorkoutViewHolder", "app_release"})
public final class WorkoutAdapter extends android.support.v7.widget.RecyclerView.Adapter<com.mateusz.workoutcustomer.database.WorkoutAdapter.WorkoutViewHolder> {
    private android.view.LayoutInflater mInflater;
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.mateusz.workoutcustomer.database.Workout> mWorkout;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.mateusz.workoutcustomer.database.Workout> getMWorkout() {
        return null;
    }
    
    public final void setMWorkout(@org.jetbrains.annotations.NotNull()
    java.util.List<com.mateusz.workoutcustomer.database.Workout> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.mateusz.workoutcustomer.database.WorkoutAdapter.WorkoutViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int p1) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.mateusz.workoutcustomer.database.WorkoutAdapter.WorkoutViewHolder holder, int positon) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.mateusz.workoutcustomer.database.Workout> list) {
    }
    
    public WorkoutAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011\u00a8\u0006\u0015"}, d2 = {"Lcom/mateusz/workoutcustomer/database/WorkoutAdapter$WorkoutViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "viewItem", "Landroid/view/View;", "workoutAdapter", "Lcom/mateusz/workoutcustomer/database/WorkoutAdapter;", "(Lcom/mateusz/workoutcustomer/database/WorkoutAdapter;Landroid/view/View;Lcom/mateusz/workoutcustomer/database/WorkoutAdapter;)V", "mAdapter", "getMAdapter", "()Lcom/mateusz/workoutcustomer/database/WorkoutAdapter;", "setMAdapter", "(Lcom/mateusz/workoutcustomer/database/WorkoutAdapter;)V", "mWorkoutDescripton", "Landroid/widget/TextView;", "getMWorkoutDescripton", "()Landroid/widget/TextView;", "setMWorkoutDescripton", "(Landroid/widget/TextView;)V", "mWorkoutTitile", "getMWorkoutTitile", "setMWorkoutTitile", "app_release"})
    public final class WorkoutViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private com.mateusz.workoutcustomer.database.WorkoutAdapter mAdapter;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView mWorkoutTitile;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView mWorkoutDescripton;
        
        @org.jetbrains.annotations.NotNull()
        public final com.mateusz.workoutcustomer.database.WorkoutAdapter getMAdapter() {
            return null;
        }
        
        public final void setMAdapter(@org.jetbrains.annotations.NotNull()
        com.mateusz.workoutcustomer.database.WorkoutAdapter p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMWorkoutTitile() {
            return null;
        }
        
        public final void setMWorkoutTitile(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMWorkoutDescripton() {
            return null;
        }
        
        public final void setMWorkoutDescripton(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        public WorkoutViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View viewItem, @org.jetbrains.annotations.NotNull()
        com.mateusz.workoutcustomer.database.WorkoutAdapter workoutAdapter) {
            super(null);
        }
    }
}