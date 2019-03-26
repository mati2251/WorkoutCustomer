package com.mateusz.workoutcustomer.viewer;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001dB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u00132\n\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u001c\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0011H\u0016J\u001c\u0010\u001a\u001a\u00020\u00132\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u001c\u001a\u00020\u0011R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/mateusz/workoutcustomer/viewer/ExerciseAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/mateusz/workoutcustomer/viewer/ExerciseAdapter$ExerciseViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mExercise", "", "Lcom/mateusz/workoutcustomer/database/Exercise;", "getMExercise", "()Ljava/util/List;", "setMExercise", "(Ljava/util/List;)V", "mInflater", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "p1", "setList", "list", "workoutId", "ExerciseViewHolder", "app_debug"})
public final class ExerciseAdapter extends android.support.v7.widget.RecyclerView.Adapter<com.mateusz.workoutcustomer.viewer.ExerciseAdapter.ExerciseViewHolder> {
    private android.view.LayoutInflater mInflater;
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.mateusz.workoutcustomer.database.Exercise> mExercise;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.mateusz.workoutcustomer.database.Exercise> getMExercise() {
        return null;
    }
    
    public final void setMExercise(@org.jetbrains.annotations.NotNull()
    java.util.List<com.mateusz.workoutcustomer.database.Exercise> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.mateusz.workoutcustomer.viewer.ExerciseAdapter.ExerciseViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int p1) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.mateusz.workoutcustomer.viewer.ExerciseAdapter.ExerciseViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.mateusz.workoutcustomer.database.Exercise> list, int workoutId) {
    }
    
    public ExerciseAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\f\u00a8\u0006\u0010"}, d2 = {"Lcom/mateusz/workoutcustomer/viewer/ExerciseAdapter$ExerciseViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "viewItem", "Landroid/view/View;", "exerciseAdapter", "Lcom/mateusz/workoutcustomer/viewer/ExerciseAdapter;", "(Lcom/mateusz/workoutcustomer/viewer/ExerciseAdapter;Landroid/view/View;Lcom/mateusz/workoutcustomer/viewer/ExerciseAdapter;)V", "mExerciseDescription", "Landroid/widget/TextView;", "getMExerciseDescription", "()Landroid/widget/TextView;", "setMExerciseDescription", "(Landroid/widget/TextView;)V", "mExerciseTitle", "getMExerciseTitle", "setMExerciseTitle", "app_debug"})
    public final class ExerciseViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView mExerciseTitle;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView mExerciseDescription;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMExerciseTitle() {
            return null;
        }
        
        public final void setMExerciseTitle(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMExerciseDescription() {
            return null;
        }
        
        public final void setMExerciseDescription(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        public ExerciseViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View viewItem, @org.jetbrains.annotations.NotNull()
        com.mateusz.workoutcustomer.viewer.ExerciseAdapter exerciseAdapter) {
            super(null);
        }
    }
}