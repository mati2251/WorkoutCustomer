package com.mateusz.workoutcustomer.viewer;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 !2\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002!\"B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0016\u001a\u00020\u0007H\u0016J\u001c\u0010\u0017\u001a\u00020\u00182\n\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0007H\u0016J\u001c\u0010\u001b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0007H\u0016J\u0014\u0010\u001f\u001a\u00020\u00182\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\rR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\n \u0015*\u0004\u0018\u00010\u00140\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/mateusz/workoutcustomer/viewer/ExerciseAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/mateusz/workoutcustomer/viewer/ExerciseAdapter$ExerciseViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "id", "", "getId", "()I", "setId", "(I)V", "mExercise", "", "Lcom/mateusz/workoutcustomer/database/Exercise;", "getMExercise", "()Ljava/util/List;", "setMExercise", "(Ljava/util/List;)V", "mInflater", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "p1", "setList", "list", "Companion", "ExerciseViewHolder", "app_debug"})
public final class ExerciseAdapter extends android.support.v7.widget.RecyclerView.Adapter<com.mateusz.workoutcustomer.viewer.ExerciseAdapter.ExerciseViewHolder> {
    private android.view.LayoutInflater mInflater;
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.mateusz.workoutcustomer.database.Exercise> mExercise;
    private int id;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ID = "com.mateusz.workoutcustomer.ExerciseId";
    public static final com.mateusz.workoutcustomer.viewer.ExerciseAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.mateusz.workoutcustomer.database.Exercise> getMExercise() {
        return null;
    }
    
    public final void setMExercise(@org.jetbrains.annotations.NotNull()
    java.util.List<com.mateusz.workoutcustomer.database.Exercise> p0) {
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
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
    java.util.List<com.mateusz.workoutcustomer.database.Exercise> list) {
    }
    
    public ExerciseAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0004H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017\u00a8\u0006!"}, d2 = {"Lcom/mateusz/workoutcustomer/viewer/ExerciseAdapter$ExerciseViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "viewItem", "Landroid/view/View;", "exerciseAdapter", "Lcom/mateusz/workoutcustomer/viewer/ExerciseAdapter;", "(Lcom/mateusz/workoutcustomer/viewer/ExerciseAdapter;Landroid/view/View;Lcom/mateusz/workoutcustomer/viewer/ExerciseAdapter;)V", "getExerciseAdapter", "()Lcom/mateusz/workoutcustomer/viewer/ExerciseAdapter;", "setExerciseAdapter", "(Lcom/mateusz/workoutcustomer/viewer/ExerciseAdapter;)V", "id", "", "getId", "()I", "setId", "(I)V", "mExerciseDescription", "Landroid/widget/TextView;", "getMExerciseDescription", "()Landroid/widget/TextView;", "setMExerciseDescription", "(Landroid/widget/TextView;)V", "mExerciseDetails", "getMExerciseDetails", "setMExerciseDetails", "mExerciseTitle", "getMExerciseTitle", "setMExerciseTitle", "onClick", "", "view", "app_debug"})
    public final class ExerciseViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
        @org.jetbrains.annotations.NotNull()
        private com.mateusz.workoutcustomer.viewer.ExerciseAdapter exerciseAdapter;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView mExerciseTitle;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView mExerciseDescription;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView mExerciseDetails;
        private int id;
        
        @org.jetbrains.annotations.NotNull()
        public final com.mateusz.workoutcustomer.viewer.ExerciseAdapter getExerciseAdapter() {
            return null;
        }
        
        public final void setExerciseAdapter(@org.jetbrains.annotations.NotNull()
        com.mateusz.workoutcustomer.viewer.ExerciseAdapter p0) {
        }
        
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
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMExerciseDetails() {
            return null;
        }
        
        public final void setMExerciseDetails(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        public final int getId() {
            return 0;
        }
        
        public final void setId(int p0) {
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
        }
        
        public ExerciseViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View viewItem, @org.jetbrains.annotations.NotNull()
        com.mateusz.workoutcustomer.viewer.ExerciseAdapter exerciseAdapter) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/mateusz/workoutcustomer/viewer/ExerciseAdapter$Companion;", "", "()V", "ID", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}