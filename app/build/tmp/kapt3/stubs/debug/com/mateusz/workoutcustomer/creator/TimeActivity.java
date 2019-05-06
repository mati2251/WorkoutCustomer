package com.mateusz.workoutcustomer.creator;

import java.lang.System;

/**
 * * RepeatActivity is creator repeat exercise
 * * @property series is EditText where user put series number new exercise
 * * @property repeat is EditText where user put repeat number new exercise
 * * @property pause is EditText where user put pause number new exercise
 * * @property spinner is EditText where user choose time formats new exercise
 * * @property spinnerPause is EditText where user choose pause formats new exercise
 * *
 * * @author Mateusz Karłowski
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0018\u001a\u00020\u0013H\u0016J\u0012\u0010\u0019\u001a\u00020\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b\u00a8\u0006\u001c"}, d2 = {"Lcom/mateusz/workoutcustomer/creator/TimeActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "pause", "Landroid/widget/EditText;", "getPause", "()Landroid/widget/EditText;", "setPause", "(Landroid/widget/EditText;)V", "series", "getSeries", "setSeries", "spinner", "Landroid/widget/Spinner;", "spinnerPause", "time", "getTime", "setTime", "add", "", "addExercise", "view", "Landroid/view/View;", "finish", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class TimeActivity extends android.support.v7.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText series;
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText time;
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText pause;
    private android.widget.Spinner spinner;
    private android.widget.Spinner spinnerPause;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getSeries() {
        return null;
    }
    
    public final void setSeries(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getTime() {
        return null;
    }
    
    public final void setTime(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getPause() {
        return null;
    }
    
    public final void setPause(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    /**
     * * It finds layouts elements and stores to variable and set array strings to spinners
     */
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * * check EditText is not empty, evokes add and create new intent and start it
     */
    public final void addExercise(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    /**
     * * check EditText is not empty, evokes add and finish activity
     */
    public final void finish(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    /**
     * * It adds new Exercise to database for this get data from intent and EditText
     */
    public final void add() {
    }
    
    /**
     * * It shows dialog window with message "Are you sure you want to not save this exercise?"
     *     * It has 2 options:
     *     * YES back to MenuActivity
     *     * NO do nothing
     */
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public TimeActivity() {
        super();
    }
}