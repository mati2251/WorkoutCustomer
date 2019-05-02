package com.mateusz.workoutcustomer.viewer

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.View
import android.widget.TextView
import com.mateusz.workoutcustomer.R
import com.mateusz.workoutcustomer.database.Exercise

class RepeatViewerActivity : AppCompatActivity() {

    lateinit var exercise : Exercise

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_repeat_viewer)
        exercise = StartActivity.workoutExercise[StartActivity.position]
        StartActivity.series++
        var currentSeries : TextView = findViewById(R.id.currentSeries2)
        currentSeries.text = "Current series: ${StartActivity.series}"
        if(StartActivity.series==exercise.series) {
            StartActivity.position++
            StartActivity.series=0
        }
        var title : TextView = findViewById(R.id.title_repeat_viewer)
        var description : TextView = findViewById(R.id.description_repeat_viewer)
        var instruction : TextView = findViewById(R.id.instruction_repeat_viewer)
        var series : TextView = findViewById(R.id.series_repeat_viewer)
        var repeat : TextView = findViewById(R.id.repeat_viewer)
        title.text = exercise.title
        description.text = exercise.description
        instruction.text = exercise.instruction
        series.text = exercise.series.toString()
        repeat.text = exercise.repeat.toString()
        supportActionBar?.hide()
    }

    fun pause(view: View){
        var intent : Intent = Intent(this, PauseActivity::class.java)
        intent.putExtra(TimeViewerActivity.pause, exercise.pause)
        intent.putExtra(TimeViewerActivity.pauseFormat, exercise.pauseFormat)
        startActivity(intent)
        finish()
    }

    override fun onBackPressed() {
        AlertDialog.Builder(this)
            .setTitle("Cancel Workout")
            .setMessage("Are you sure you want to cancel workout?")
            .setPositiveButton("OK") { dialog, which ->
                super.onBackPressed()
                StartActivity.series = 0
            }
            .setNegativeButton("CANCLE", null)
            .show()
    }
}