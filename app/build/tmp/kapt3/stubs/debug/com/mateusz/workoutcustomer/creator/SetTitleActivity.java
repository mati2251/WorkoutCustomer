package com.mateusz.workoutcustomer.creator;

import java.lang.System;

/**
 * * It creates new Workout
 * * @property titleEditText is EditText where user can put data for new workout
 * * @property descriptionEditText is EditText where user can put data for new workout
 * * @property ID is address title workout id where new intent put data. And where next activity can find data from this activity. Next activity use ID for create new Exercise to this workout
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\rH\u0016J\u0012\u0010\u0011\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/mateusz/workoutcustomer/creator/SetTitleActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "descriptionEditText", "Landroid/widget/EditText;", "getDescriptionEditText", "()Landroid/widget/EditText;", "setDescriptionEditText", "(Landroid/widget/EditText;)V", "titleEditText", "getTitleEditText", "setTitleEditText", "next", "", "view", "Landroid/view/View;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"})
public final class SetTitleActivity extends android.support.v7.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText titleEditText;
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText descriptionEditText;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ID = "com.mateusz.workoutcustomer.currentId";
    public static final com.mateusz.workoutcustomer.creator.SetTitleActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getTitleEditText() {
        return null;
    }
    
    public final void setTitleEditText(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getDescriptionEditText() {
        return null;
    }
    
    public final void setDescriptionEditText(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    /**
     * *It finds layouts elements and stores to variable
     */
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * * It checks EditTexts not empty and data is too long.
     *     * If no it create new intent, put data and start it
     */
    public final void next(@org.jetbrains.annotations.NotNull()
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
    
    public SetTitleActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/mateusz/workoutcustomer/creator/SetTitleActivity$Companion;", "", "()V", "ID", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}