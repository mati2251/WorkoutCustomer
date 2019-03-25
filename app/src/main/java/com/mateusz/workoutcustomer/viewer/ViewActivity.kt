package com.mateusz.workoutcustomer.viewer

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.TextView
import com.mateusz.workoutcustomer.R
import com.mateusz.workoutcustomer.database.Workout
import com.mateusz.workoutcustomer.database.WorkoutAdapter
import com.mateusz.workoutcustomer.database.WorkoutViewModel
import com.mateusz.workoutcustomer.menu.MainActivity

class ViewActivity : AppCompatActivity() {
    lateinit var exerciseAdapter: ExerciseAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)
        var id = intent.getIntExtra(WorkoutAdapter.ID, 0)
        var workout : Workout = MainActivity.workoutViewModel.findWorkoutById(id)
        var title : TextView = findViewById(R.id.workout_title_view_activity)
        var description : TextView = findViewById(R.id.workout_description_view_activity)
        MainActivity.workoutViewModel = ViewModelProviders.of(this).get(WorkoutViewModel::class.java)
        title.text = workout.title
        description.text = workout.description
        exerciseAdapter = ExerciseAdapter(applicationContext)
        var recyclerView : RecyclerView = findViewById(R.id.recycle_view_exercise  )
        recyclerView.layoutManager = LinearLayoutManager(applicationContext)
        MainActivity.workoutViewModel.allExercise.observe(this, Observer {
                exercise -> exercise?.let { exerciseAdapter.setList(it) }
        })
        recyclerView.adapter = exerciseAdapter
    }
}
