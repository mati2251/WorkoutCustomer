package com.mateusz.workoutcustomer.creator;

import java.lang.System;

/**
 * * RepeatActivity is creator repeat exercise
 * * @property series is EditText where user put series number new exercise
 * * @property repeat is EditText where user put repeat number new exercise
 * * @property pause is EditText where user put pause number new exercise
 * * @property spinner is EditText where user choose pause formats new exercise
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0017\u001a\u00020\u0012H\u0016J\u0012\u0010\u0018\u001a\u00020\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/mateusz/workoutcustomer/creator/RepeatActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "pause", "Landroid/widget/EditText;", "getPause", "()Landroid/widget/EditText;", "setPause", "(Landroid/widget/EditText;)V", "repeat", "getRepeat", "setRepeat", "series", "getSeries", "setSeries", "spinner", "Landroid/widget/Spinner;", "add", "", "addExerciseRepeat", "view", "Landroid/view/View;", "finishRepeat", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class RepeatActivity extends android.support.v7.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText series;
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText repeat;
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText pause;
    private android.widget.Spinner spinner;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getSeries() {
        return null;
    }
    
    public final void setSeries(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getRepeat() {
        return null;
    }
    
    public final void setRepeat(@org.jetbrains.annotations.NotNull()
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
     * * It finds layouts elements and stores to variable and set array strings to spinner
     */
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * * check EditText is not empty, evokes add and create new intent and start it
     */
    public final void addExerciseRepeat(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    /**
     * * check EditText is not empty, evokes add and finish activity
     */
    public final void finishRepeat(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    /**
     * * It adds new Exercise to database for this get data from intent and EditText
     */
    private final void add() {
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
    
    public RepeatActivity() {
        super();
    }
}