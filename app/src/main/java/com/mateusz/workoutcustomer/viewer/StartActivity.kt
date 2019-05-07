package com.mateusz.workoutcustomer.viewer

import android.content.Intent
import android.media.MediaPlayer
import android .support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.support.v7.app.AlertDialog
import android.widget.ProgressBar
import android.widget.TextView
import com.mateusz.workoutcustomer.menu.MainActivity
import com.mateusz.workoutcustomer.R
import com.mateusz.workoutcustomer.database.Exercise

/**
 * This class has workout all Exercise and counting down to start workout.
 * @author Mateusz Karłowski
 */

class StartActivity : AppCompatActivity() {

    var close : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        workoutExercise.clear()
        val title : TextView = findViewById(R.id.title_workout_start)
        val id = intent.getIntExtra(ViewActivity.WORKOUTID,0)
        val workout = MainActivity.workoutViewModel.findWorkoutById(id)
        title.text = workout.title
        val time : TextView = findViewById(R.id.time)
        val progressBar : ProgressBar = findViewById(R.id.progressBar)
        for (i in 0..((MainActivity.workoutViewModel.allExercise.value?.size?.minus(1)) ?: 0)){
            if(MainActivity.workoutViewModel.allExercise.value?.get(i)?.workoutId == workout.id){
                workoutExercise.add(MainActivity.workoutViewModel.allExercise.value?.get(i)!!)
            }
        }

        position = 0
        progressBar.progress = 0
        progressBar.max = 4500
        time.text = 5.toString()

        object : CountDownTimer(5000, 20) {

            override fun onTick(millisUntilFinished: Long) {
                if(!close) {
                    progressBar.progress = progressBar.progress + 20
                    if (progressBar.progress % 1000 == 0) {
                        time.text = (5 - (progressBar.progress / 1000)).toString()
                    }
                }
                else{
                    cancel()
                }
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
                progressBar.progress = progressBar.progress + 20
                var mediaPlayer: MediaPlayer? = MediaPlayer.create(applicationContext, R.raw.bell)
                mediaPlayer?.start()
                finish()
            }
        }.start()
        supportActionBar?.hide()
    }

    override fun onBackPressed() {
        AlertDialog.Builder(this)
            .setTitle("Cancel Workout")
            .setMessage("Are you sure you want to cancel workout?")
            .setPositiveButton("OK") { dialog, which ->
                super.onBackPressed()
                series = 0
                close = true
            }
            .setNegativeButton("CANCLE", null)
            .show()
    }

    companion object {
        var workoutExercise : ArrayList<Exercise> = ArrayList()
        var position : Int = 0
        var series : Int = 0
    }
}