package com.mateusz.workoutcustomer.menu;

import java.lang.System;

/**
 * * A class MenuActivity is Main Activity in my App
 * * @author Mateusz Karłowski
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0012\u001a\u00020\u00132\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/mateusz/workoutcustomer/menu/MenuActivity;", "Landroid/support/v4/app/FragmentActivity;", "Landroid/support/design/widget/BottomNavigationView$OnNavigationItemSelectedListener;", "()V", "fab", "Landroid/support/design/widget/FloatingActionButton;", "getFab", "()Landroid/support/design/widget/FloatingActionButton;", "setFab", "(Landroid/support/design/widget/FloatingActionButton;)V", "fragment", "Landroid/support/v4/app/Fragment;", "getFragment", "()Landroid/support/v4/app/Fragment;", "setFragment", "(Landroid/support/v4/app/Fragment;)V", "newWorkoutActivityRequestCode", "", "loadFragment", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onNavigationItemSelected", "item", "Landroid/view/MenuItem;", "app_release"})
public final class MenuActivity extends android.support.v4.app.FragmentActivity implements android.support.design.widget.BottomNavigationView.OnNavigationItemSelectedListener {
    
    /**
     * * Function onNavigationItemSelected change fragments when user chosen option on BottomNavigationView
     */
    @org.jetbrains.annotations.NotNull()
    public android.support.design.widget.FloatingActionButton fab;
    private final int newWorkoutActivityRequestCode = 1;
    @org.jetbrains.annotations.NotNull()
    public android.support.v4.app.Fragment fragment;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.design.widget.FloatingActionButton getFab() {
        return null;
    }
    
    public final void setFab(@org.jetbrains.annotations.NotNull()
    android.support.design.widget.FloatingActionButton p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.v4.app.Fragment getFragment() {
        return null;
    }
    
    public final void setFragment(@org.jetbrains.annotations.NotNull()
    android.support.v4.app.Fragment p0) {
    }
    
    @java.lang.Override()
    public boolean onNavigationItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    /**
     * * Function onCreate evokes when class MenuActivity are creates.
     *     * It set layout activity_menu
     *     * It evokes function loadFragment because set default fragment
     *     * Next create variable navigation and changes it into BottomNavigationView from layout
     *     * The last set listener for BottomNavigationView
     */
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * * Function loadFragment start new Fragment in the part of the Layout
     */
    public final boolean loadFragment(@org.jetbrains.annotations.Nullable()
    android.support.v4.app.Fragment fragment) {
        return false;
    }
    
    public MenuActivity() {
        super();
    }
}