package com.mateusz.workoutcustomer.viewer

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.mateusz.workoutcustomer.R
import com.mateusz.workoutcustomer.menu.MenuActivity

class PauseActivity : AppCompatActivity() {

    var close : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pause)
        var time : TextView = findViewById(R.id.time_pause_view)
        object : CountDownTimer(intent.getIntExtra(RepeatViewerActivity.pause, 0).toLong()*1000, 1000) {

            override fun onTick(millisUntilFinished: Long) {
                time.text = "${millisUntilFinished/1000}"
                if(close){
                    cancel()
                }
            }

            override fun onFinish() {
                var intent: Intent
                if(StartActivity.workoutExercise.size == StartActivity.position){
                    val toast = Toast.makeText(applicationContext, "You are finish workout", Toast.LENGTH_SHORT)
                    toast.show()
                    intent = Intent(applicationContext, MenuActivity::class.java)
                    startActivity(intent)
                }
                else if(!StartActivity.workoutExercise[StartActivity.position].timeCheck){
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
        supportActionBar?.hide()
    }

    fun stopPause(view: View){
        if(StartActivity.workoutExercise.size == StartActivity.position){
            val toast = Toast.makeText(applicationContext, "You are finish workout", Toast.LENGTH_SHORT)
            toast.show()
            intent = Intent(applicationContext, MenuActivity::class.java)
            StartActivity.position = 0
            startActivity(intent)
        }
        else if(!StartActivity.workoutExercise[StartActivity.position].timeCheck){
            intent = Intent(applicationContext, RepeatViewerActivity::class.java)
            startActivity(intent)
        }
        else if(StartActivity.workoutExercise[StartActivity.position].timeCheck){
            intent = Intent(applicationContext, TimeViewerActivity::class.java)
            startActivity(intent)
        }
        close = true
        finish()
    }

    override fun onBackPressed() {
        super.onBackPressed()
        close = true
    }
}
