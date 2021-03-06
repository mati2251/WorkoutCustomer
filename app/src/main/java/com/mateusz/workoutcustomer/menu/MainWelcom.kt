package com.mateusz.workoutcustomer.menu

import android.arch.lifecycle.ViewModelProviders
import android.arch.persistence.room.Room
import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.mateusz.workoutcustomer.R
import com.mateusz.workoutcustomer.database.Exercise
import com.mateusz.workoutcustomer.database.ExerciseDatabase
import com.mateusz.workoutcustomer.database.WorkoutViewModel

/**
 * MainActivity is splash screen
 * It shows  on 0.7 seconds layout activity_welcom and switch to MenuActivity
 * @author Mateusz Karłowski
 *
 * @property workoutViewModel is object class WorkoutViewModel
 * @see WorkoutViewModel
 */


class MainActivity : AppCompatActivity() {

    /**
     * onCreate create WorkoutViewModel and ready other data in database.
     * The second task onCreate is stop splash screen on 7 seconds
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcom)
        supportActionBar?.hide()
        workoutViewModel = ViewModelProviders.of(this).get(WorkoutViewModel::class.java)
        Handler().postDelayed({
            val homeIntent = Intent(this@MainActivity, MenuActivity::class.java)
            startActivity(homeIntent)
            finish()
        }, 700)
    }

    companion object {
        lateinit var workoutViewModel: WorkoutViewModel
    }
}
