package com.mateusz.workoutcustomer.viewer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.mateusz.workoutcustomer.R

class ExerciseViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise_view)
        var id =intent.getIntExtra(ExerciseAdapter.ID, 0)
        print(id)
        supportActionBar?.hide()
    }
}
