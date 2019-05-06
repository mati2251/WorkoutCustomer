package com.mateusz.workoutcustomer.creator;

import java.lang.System;

/**
 * * class ExerciseActivity is create new Exercise
 * * @property radioGroup is group with two RadioButtons. First is Time. Second is Repeat. User choose button according from exercise
 * * @property title is EditText where user put title new exercise
 * * @property description is EditText where user put description new exercise
 * * @property instruction is EditText where user put instruction new exercise
 * * @property TITLE is address title new exercise where new intent put data. And where next activity can find data from this activity
 * * @property DESCRIPTION is address description new exercise where new intent put data. And where next activity can find data from this activity
 * * @property INSTRUCTION is address instruction new exercise where new intent put data. And where next activity can find data from this activity
 * * @author Mateusz Karłowski
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u0019\u001a\u00020\u0016H\u0016J\u0012\u0010\u001a\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b\u00a8\u0006\u001e"}, d2 = {"Lcom/mateusz/workoutcustomer/creator/ExerciseActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "description", "Landroid/widget/EditText;", "getDescription", "()Landroid/widget/EditText;", "setDescription", "(Landroid/widget/EditText;)V", "instruction", "getInstruction", "setInstruction", "radioGroup", "Landroid/widget/RadioGroup;", "getRadioGroup", "()Landroid/widget/RadioGroup;", "setRadioGroup", "(Landroid/widget/RadioGroup;)V", "title", "getTitle", "setTitle", "nextExercise", "", "view", "Landroid/view/View;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_release"})
public final class ExerciseActivity extends android.support.v7.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    public android.widget.RadioGroup radioGroup;
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText title;
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText description;
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText instruction;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TITLE = "com.mateusz.workoutcustomer.etitle";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DESCRIPTION = "com.mateusz.workoutcustomer.description";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INSTRUCTION = "com.mateusz.workoutcustomer.instrucuton";
    public static final com.mateusz.workoutcustomer.creator.ExerciseActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.RadioGroup getRadioGroup() {
        return null;
    }
    
    public final void setRadioGroup(@org.jetbrains.annotations.NotNull()
    android.widget.RadioGroup p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getInstruction() {
        return null;
    }
    
    public final void setInstruction(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    /**
     * * it finds layout elements and stores to variable
     */
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * * It checks EditText is empty. If yes show statement. But if EditText is not empty. It create new Intent, put data and start new activity
     */
    public final void nextExercise(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    /**
     * * It shows dialog with message "Are you sure you want to exit?"
     *     * This dialog have two options
     *     * YES retreat
     *     * NO do nothing
     */
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public ExerciseActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/mateusz/workoutcustomer/creator/ExerciseActivity$Companion;", "", "()V", "DESCRIPTION", "", "INSTRUCTION", "TITLE", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}