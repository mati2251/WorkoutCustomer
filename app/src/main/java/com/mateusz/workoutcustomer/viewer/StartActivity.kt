package com.mateusz.workoutcustomer.viewer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView
import com.mateusz.workoutcustomer.menu.MainActivity
import com.mateusz.workoutcustomer.R




class StartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        var title : TextView = findViewById(R.id.title_workout_start)
        var id = intent.getIntExtra(ViewActivity.WORKOUTID,0)
        var workout = MainActivity.workoutViewModel.findWorkoutById(id)
        title.text = workout.title
        var time : TextView = findViewById(R.id.time)
        object : CountDownTimer(6000, 1000) {

            override fun onTick(millisUntilFinished: Long) {
                time.setText("${millisUntilFinished/1000}")
            }

            override fun onFinish() {
                time.setText("0")
            }
        }.start()


    }
}
