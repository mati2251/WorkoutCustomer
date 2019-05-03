package com.mateusz.workoutcustomer.viewer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.mateusz.workoutcustomer.R
import com.mateusz.workoutcustomer.menu.MainActivity

class ExerciseViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise_view)
        var exercise =MainActivity.workoutViewModel.findExerciseById(intent.getIntExtra(ExerciseAdapter.ID, 0))
        supportActionBar?.hide()
    }
}
