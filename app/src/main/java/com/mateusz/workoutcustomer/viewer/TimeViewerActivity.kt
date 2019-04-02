package com.mateusz.workoutcustomer.viewer

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.TextView
import com.mateusz.workoutcustomer.R
import com.mateusz.workoutcustomer.database.Exercise

class TimeViewerActivity : AppCompatActivity() {

    lateinit var exercise : Exercise

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_viewer)
        exercise = StartActivity.workoutExercise[StartActivity.position]
        StartActivity.series++
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
        object : CountDownTimer((exercise.time*1000).toLong(), 1000) {

            override fun onTick(millisUntilFinished: Long) {
                time.text = "${millisUntilFinished/1000}"
            }

            override fun onFinish() {
                var intent: Intent
                if(!StartActivity.workoutExercise[StartActivity.position].timeCheck){
                    intent = Intent(applicationContext, RepeatViewerActivity::class.java)
                    startActivity(intent)
                }
                else if(StartActivity.workoutExercise[StartActivity.position].timeCheck){
                    intent = Intent(applicationContext, TimeViewerActivity::class.java)
                    startActivity(intent)
                }
                finish()
            }
        }.start()
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
