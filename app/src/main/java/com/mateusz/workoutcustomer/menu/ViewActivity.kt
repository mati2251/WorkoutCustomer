package com.mateusz.workoutcustomer.menu

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.mateusz.workoutcustomer.R
import com.mateusz.workoutcustomer.database.Workout
import com.mateusz.workoutcustomer.database.WorkoutAdapter

class ViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)
        var id = intent.getIntExtra(WorkoutAdapter.ID, 0)
        var workout : Workout = MainActivity.workoutViewModel.findWorkoutById(id)
        var title : TextView = findViewById(R.id.workout_title_view_activity)
        var description : TextView = findViewById(R.id.workout_description_view_activity)
        title.text = workout.title
        description.text = workout.description
    }
}