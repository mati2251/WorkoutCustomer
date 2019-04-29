package com.mateusz.workoutcustomer.viewer

import android.content.DialogInterface
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.support.v7.app.AlertDialog
import android.view.View
import android.widget.TextView
import com.mateusz.workoutcustomer.R
import com.mateusz.workoutcustomer.database.Exercise
import kotlinx.android.synthetic.main.activity_start.*




class TimeViewerActivity : AppCompatActivity() {

    lateinit var exercise : Exercise
    var close : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_viewer)
        exercise = StartActivity.workoutExercise[StartActivity.position]
        StartActivity.series++
        var currentSeries : TextView = findViewById(R.id.currentSeries)
        currentSeries.text = "Current series: ${StartActivity.series}"
        if(StartActivity.series==exercise.series) {
            StartActivity.position++
            StartActivity.series=0
        }
        var title : TextView = findViewById(R.id.title_time_viewer)
        var description : TextView = findViewById(R.id.description_time_viewer)
        var instruction : TextView = findViewById(R.id.instruction_time_viewer)
        var series : TextView = findViewById(R.id.series_time_viewer)
        title.text = exercise.title
        description.text = exercise.description
        instruction.text = exercise.instruction
        series.text = exercise.series.toString()
        var time : TextView = findViewById(R.id.time_viewer)
        progressBar.progress = exercise.time
        progressBar.max = exercise.time
        object : CountDownTimer((exercise.time*1000).toLong(), 1000) {

            override fun onTick(millisUntilFinished: Long) {
                time.text = "${millisUntilFinished/1000}"
                if(close){
                    cancel()
                }
                progressBar.progress=progressBar.progress-1
            }

            override fun onFinish() {
                var intent : Intent = Intent(applicationContext, PauseActivity::class.java)
                intent.putExtra(TimeViewerActivity.pause, exercise.pause)
                startActivity(intent)
                finish()
            }
        }.start()
        supportActionBar?.hide()
    }

    fun pause(view: View){
        var intent : Intent = Intent(this, PauseActivity::class.java)
        intent.putExtra(TimeViewerActivity.pause, exercise.pause)
        startActivity(intent)
        close = true
        finish()
    }

    override fun onBackPressed() {
        AlertDialog.Builder(this)
            .setTitle("Cancel Workout")
            .setMessage("Are you sure you want to cancel workout?")
            .setPositiveButton("OK") { dialog, which ->
                super.onBackPressed()
                StartActivity.series = 0
                close = true
            }
            .setNegativeButton("CANCLE", null)
            .show()
    }

    companion object {
        var pause = "com.mateusz.workoutcustomer.pause"
    }
}
