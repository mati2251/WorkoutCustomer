package com.mateusz.workoutcustomer.viewer

import android.content.Intent
import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.support.v7.app.AlertDialog
import android.view.View
import android.widget.TextView
import com.mateusz.workoutcustomer.R
import com.mateusz.workoutcustomer.database.Exercise
import kotlinx.android.synthetic.main.activity_start.*

/**
 * It see exercise with time
 * @property exercise is current exercise object
 * @property close is bool when is true this activity is finish
 * @property pause is address where intent put data and where activity get data. Address have information about pause
 * @property pauseFormat is address where intent put data and where activity get data. Address have information about pause format
 */

class TimeViewerActivity : AppCompatActivity() {

    lateinit var exercise: Exercise
    var close: Boolean = false

    /**
     * It gets current exercise. Adds one to series. Find layout elements and show data.
     * The last task this function is counting down time.
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_viewer)
        exercise = StartActivity.workoutExercise[StartActivity.position]
        StartActivity.series++
        var currentSeries: TextView = findViewById(R.id.currentSeries)
        currentSeries.text = "Current series: ${StartActivity.series}"
        if (StartActivity.series == exercise.series) {
            StartActivity.position++
            StartActivity.series = 0
        }
        var title: TextView = findViewById(R.id.title_time_viewer)
        var description: TextView = findViewById(R.id.description_time_viewer)
        var instruction: TextView = findViewById(R.id.instruction_time_viewer)
        var series: TextView = findViewById(R.id.series_time_viewer)
        title.text = exercise.title
        description.text = exercise.description
        instruction.text = exercise.instruction
        series.text = exercise.series.toString()
        var time: TextView = findViewById(R.id.time_viewer)
        var timeSeconds: Int = exercise.time
        if (exercise.timeFormat != "seconds") {
            timeSeconds *= 60
        }
        progressBar.max = timeSeconds
        progressBar.progress = timeSeconds
        object : CountDownTimer((timeSeconds * 1000).toLong(), 1000) {

            override fun onTick(millisUntilFinished: Long) {
                if (exercise.timeFormat == "seconds") {
                    time.text = "${millisUntilFinished / 1000} sec"
                } else {
                    time.text = "${(millisUntilFinished / 60000).toInt()} min ${millisUntilFinished / 1000 % 60} sec"
                }
                if (close) {
                    cancel()
                }
                progressBar.progress = progressBar.progress - 1
            }

            override fun onFinish() {
                var intent: Intent = Intent(applicationContext, PauseActivity::class.java)
                intent.putExtra(TimeViewerActivity.pause, exercise.pause)
                intent.putExtra(pauseFormat, exercise.pauseFormat)
                startActivity(intent)
                var mediaPlayer: MediaPlayer? = MediaPlayer.create(applicationContext, R.raw.bell)
                mediaPlayer?.start()
                finish()
            }
        }.start()
        supportActionBar?.hide()
    }

    /**
     * This function stops counting down across set close to true.
     * Next function creates new intent and start it
     */

    fun pause(view: View) {
        var intent: Intent = Intent(this, PauseActivity::class.java)
        intent.putExtra(pause, exercise.pause)
        intent.putExtra(pauseFormat, exercise.pauseFormat)
        startActivity(intent)
        close = true
        finish()
    }

    /**
     * This function displays dialog with message "Are you sure you want to cancel workout?"
     */

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
        const val pause = "com.mateusz.workoutcustomer.pause"
        const val pauseFormat = "com.mateusz.workoutcustomer.pauseFormat"
    }
}
