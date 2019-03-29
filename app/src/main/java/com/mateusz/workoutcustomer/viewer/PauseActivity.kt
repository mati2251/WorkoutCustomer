package com.mateusz.workoutcustomer.viewer

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.TextView
import com.mateusz.workoutcustomer.R

class PauseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pause)
        var time : TextView = findViewById(R.id.time_pause_view)
        object : CountDownTimer(intent.getIntExtra(RepeatViewerActivity.pause, 0).toLong()*1000, 1000) {

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

    fun stopPause(view: View){
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
}
