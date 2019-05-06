package com.mateusz.workoutcustomer.menu;

import java.lang.System;

/**
 * * class WorkoutAdapter extends from RecycleView.Adapter and it is for RecycleView
 * *  @property mWorkout is list Workout
 * *  @see Workout
 * *  @property id stores id clicked item
 * *  @property ID is string which stores id address. This address is for intent can put ID. This property is companion object because ViewActivity must have address for read data
 * *  @author Mateusz Karłowski
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001f2\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001f B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0014\u001a\u00020\tH\u0016J\u001c\u0010\u0015\u001a\u00020\u00162\n\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\tH\u0016J\u001c\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\tH\u0016J\u0014\u0010\u001d\u001a\u00020\u00162\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/mateusz/workoutcustomer/menu/WorkoutAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/mateusz/workoutcustomer/menu/WorkoutAdapter$WorkoutViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "cardView", "Landroid/support/v7/widget/CardView;", "id", "", "getId", "()I", "setId", "(I)V", "mInflater", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "mWorkout", "", "Lcom/mateusz/workoutcustomer/database/Workout;", "getItemCount", "onBindViewHolder", "", "holder", "positon", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "p1", "setList", "list", "Companion", "WorkoutViewHolder", "app_debug"})
public final class WorkoutAdapter extends android.support.v7.widget.RecyclerView.Adapter<com.mateusz.workoutcustomer.menu.WorkoutAdapter.WorkoutViewHolder> {
    private android.view.LayoutInflater mInflater;
    private java.util.List<com.mateusz.workoutcustomer.database.Workout> mWorkout;
    private android.support.v7.widget.CardView cardView;
    private int id;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String ID;
    public static final com.mateusz.workoutcustomer.menu.WorkoutAdapter.Companion Companion = null;
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    /**
     * * onCreateViewHolder find CardView in layout and return items look like R.layout.workout_item with data
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.mateusz.workoutcustomer.menu.WorkoutAdapter.WorkoutViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int p1) {
        return null;
    }
    
    /**
     * * onBindViewHolder set data from mWorkout to item
     */
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.mateusz.workoutcustomer.menu.WorkoutAdapter.WorkoutViewHolder holder, int positon) {
    }
    
    /**
     * * @return how many item
     */
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    /**
     * * function setList set new List with new Data
     *     *  @property list is list with workout
     */
    public final void setList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.mateusz.workoutcustomer.database.Workout> list) {
    }
    
    public WorkoutAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    /**
     * * class WorkoutViewHolder set onClick card listener and find layout item in R.layout.workout_item
     *     * @property id is workout id
     *     * @property mWorkoutTitle is TextView with workout Title, Its id is R.id.workout_title
     *     * @property mWorkoutDescription is TextView with workout Description. Its id is R.id.workout_description
     *     * @constructor set OnClick as OnClickListener
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0004H\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018\u00a8\u0006\u001f"}, d2 = {"Lcom/mateusz/workoutcustomer/menu/WorkoutAdapter$WorkoutViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "viewItem", "Landroid/view/View;", "workoutAdapter", "Lcom/mateusz/workoutcustomer/menu/WorkoutAdapter;", "(Lcom/mateusz/workoutcustomer/menu/WorkoutAdapter;Landroid/view/View;Lcom/mateusz/workoutcustomer/menu/WorkoutAdapter;)V", "id", "", "getId", "()I", "setId", "(I)V", "mAdapter", "getMAdapter", "()Lcom/mateusz/workoutcustomer/menu/WorkoutAdapter;", "setMAdapter", "(Lcom/mateusz/workoutcustomer/menu/WorkoutAdapter;)V", "mWorkoutDescription", "Landroid/widget/TextView;", "getMWorkoutDescription", "()Landroid/widget/TextView;", "setMWorkoutDescription", "(Landroid/widget/TextView;)V", "mWorkoutTitle", "getMWorkoutTitle", "setMWorkoutTitle", "onClick", "", "view", "app_debug"})
    public final class WorkoutViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
        @org.jetbrains.annotations.NotNull()
        private com.mateusz.workoutcustomer.menu.WorkoutAdapter mAdapter;
        private int id;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView mWorkoutTitle;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView mWorkoutDescription;
        
        @org.jetbrains.annotations.NotNull()
        public final com.mateusz.workoutcustomer.menu.WorkoutAdapter getMAdapter() {
            return null;
        }
        
        public final void setMAdapter(@org.jetbrains.annotations.NotNull()
        com.mateusz.workoutcustomer.menu.WorkoutAdapter p0) {
        }
        
        public final int getId() {
            return 0;
        }
        
        public final void setId(int p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMWorkoutTitle() {
            return null;
        }
        
        public final void setMWorkoutTitle(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMWorkoutDescription() {
            return null;
        }
        
        public final void setMWorkoutDescription(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        /**
         * * onClick start new Intent and put ID to this Intent
         */
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
        }
        
        public WorkoutViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View viewItem, @org.jetbrains.annotations.NotNull()
        com.mateusz.workoutcustomer.menu.WorkoutAdapter workoutAdapter) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/mateusz/workoutcustomer/menu/WorkoutAdapter$Companion;", "", "()V", "ID", "", "getID", "()Ljava/lang/String;", "setID", "(Ljava/lang/String;)V", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getID() {
            return null;
        }
        
        public final void setID(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        private Companion() {
            super();
        }
    }
}