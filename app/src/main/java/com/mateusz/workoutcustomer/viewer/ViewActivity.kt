package com.mateusz.workoutcustomer.viewer

import android.arch.lifecycle.Observer
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.mateusz.workoutcustomer.R
import com.mateusz.workoutcustomer.creator.ExerciseActivity
import com.mateusz.workoutcustomer.creator.SetTitleActivity
import com.mateusz.workoutcustomer.database.Workout
import com.mateusz.workoutcustomer.database.WorkoutAdapter
import com.mateusz.workoutcustomer.menu.MainActivity

class ViewActivity : AppCompatActivity() {
    lateinit var exerciseAdapter: ExerciseAdapter
    var id : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)
        id = intent.getIntExtra(WorkoutAdapter.ID, 0)
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
        supportActionBar?.hide()
    }

    fun start(view: View){
        if(exerciseAdapter.mExercise.isNotEmpty()) {
            var startInetnt = Intent(this, StartActivity::class.java)
            startInetnt.putExtra(WORKOUTID, workoutId)
            startActivity(startInetnt)
        }
        else{
            val toast = Toast.makeText(applicationContext, "You can't start workout without exercise", Toast.LENGTH_SHORT)
            toast.show()
        }
    }

    fun deleteWorkout(view: View){
        MainActivity.workoutViewModel.deleteById(id)
        finish()
    }

    fun newExercise(view : View){
        var nextIntent = Intent(this, ExerciseActivity::class.java)
        nextIntent.putExtra(SetTitleActivity.ID, id)
        startActivity(nextIntent)
    }

    companion object {
        var workoutId : Int = 0
        var WORKOUTID : String = "com.mateusz.workoutcustomer.workoutid"
    }
}
