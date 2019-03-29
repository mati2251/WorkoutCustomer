package com.mateusz.workoutcustomer.viewer

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
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
        title.text = workout.title
        description.text = workout.description
        exerciseAdapter = ExerciseAdapter(applicationContext)
        var recyclerView : RecyclerView = findViewById(R.id.recycle_view_exercise  )
        recyclerView.layoutManager = LinearLayoutManager(applicationContext)
        workoutId= workout.id
        MainActivity.workoutViewModel.allExercise.observe(this, Observer {
                exercise -> exercise?.let { exerciseAdapter.setList(it) }
        })
        recyclerView.adapter = exerciseAdapter
    }

    fun start(view: View){
        var startInetnt = Intent(this, StartActivity::class.java)
        startInetnt.putExtra(WORKOUTID, workoutId)
        startActivity(startInetnt)
    }

    companion object {
        var workoutId : Int = 0
        var WORKOUTID : String = "com.mateusz.workoutcustomer.workoutid"
    }
}
