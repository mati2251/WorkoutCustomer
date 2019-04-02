package com.mateusz.workoutcustomer.viewer

import android.content.Intent
import android .support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView
import com.mateusz.workoutcustomer.menu.MainActivity
import com.mateusz.workoutcustomer.R
import com.mateusz.workoutcustomer.database.Exercise


class StartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        workoutExercise.clear()
        var title : TextView = findViewById(R.id.title_workout_start)
        var id = intent.getIntExtra(ViewActivity.WORKOUTID,0)
        var workout = MainActivity.workoutViewModel.findWorkoutById(id)
        title.text = workout.title
        var time : TextView = findViewById(R.id.time)
        for (i in 0..((MainActivity.workoutViewModel.allExercise.value?.size?.minus(1)) ?: 0)){
            if(MainActivity.workoutViewModel.allExercise.value?.get(i)?.workoutId == workout.id){
                workoutExercise.add(MainActivity.workoutViewModel.allExercise.value?.get(i)!!)
            }
        }
        object : CountDownTimer(2500, 500) {

            override fun onTick(millisUntilFinished: Long) {
                time.text = "${millisUntilFinished/500}"
            }

            override fun onFinish() {
                var intent: Intent
                if(!workoutExercise[0].timeCheck){
                    intent = Intent(applicationContext, RepeatViewerActivity::class.java)
                    startActivity(intent)
                }
                else if(workoutExercise[0].timeCheck){
                    intent = Intent(applicationContext, TimeViewerActivity::class.java)
                    startActivity(intent)
                }
                finish()
            }
        }.start()

    }

    companion object {
        var workoutExercise : ArrayList<Exercise> = ArrayList()
        var position : Int = 0
        var series : Int = 0
    }
}