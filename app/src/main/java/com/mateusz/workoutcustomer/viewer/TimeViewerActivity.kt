package com.mateusz.workoutcustomer.viewer

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.mateusz.workoutcustomer.R
import com.mateusz.workoutcustomer.database.Exercise

class TimeViewerActivity : AppCompatActivity() {

    lateinit var exercise : Exercise

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_repeat_viewer)
        exercise = StartActivity.workoutExercise[StartActivity.position]
        StartActivity.series++
        if(StartActivity.series==exercise.series) {
            StartActivity.position++
            StartActivity.series=0
        }
        var title : TextView = findViewById(R.id.title_repeat_viewer)
        var description : TextView = findViewById(R.id.description_repeat_viewer)
        var instruction : TextView = findViewById(R.id.instruction_repeat_viewer)
        var series : TextView = findViewById(R.id.series_repeat_viewer)
        title.text = exercise.title
        description.text = exercise.description
        instruction.text = exercise.instruction
        series.text = exercise.series.toString()
    }

    fun pause(view: View){
        var intent : Intent = Intent(this, PauseActivity::class.java)
        intent.putExtra(pause, exercise.pause)
        startActivity(intent)
        finish()
    }

    companion object {
        var pause = "com.mateusz.workoutcustomer.pause"
    }
}
