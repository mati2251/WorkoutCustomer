package com.mateusz.workoutcustomer.menu;

import java.lang.System;

/**
 * class HomeFragment is for this display layout R.layout.fragment_home
 * *  also it read old data to CardView
 * *  @property workoutAdapter is object WorkoutAdapter for RecycleView
 * *  @see WorkoutAdapter
 * *  @author Mateusz Karłowski
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/mateusz/workoutcustomer/menu/HomeFragment;", "Landroid/support/v4/app/Fragment;", "()V", "workoutAdapter", "Lcom/mateusz/workoutcustomer/database/WorkoutAdapter;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class HomeFragment extends android.support.v4.app.Fragment {
    private com.mateusz.workoutcustomer.database.WorkoutAdapter workoutAdapter;
    private java.util.HashMap _$_findViewCache;
    
    /**
     * * onCreateView find recyclerView set adapter and LayoutManager
     *     * finally get data from database and set as data for RecycleView
     *     * @return view with recycleView
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public HomeFragment() {
        super();
    }
}