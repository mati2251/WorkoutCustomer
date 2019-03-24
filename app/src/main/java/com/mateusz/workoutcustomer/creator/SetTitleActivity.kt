package com.mateusz.workoutcustomer.creator

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.mateusz.workoutcustomer.R
import com.mateusz.workoutcustomer.database.Workout
import com.mateusz.workoutcustomer.menu.MainActivity
import com.mateusz.workoutcustomer.menu.MenuActivity

class SetTitleActivity : AppCompatActivity() {

    lateinit var titleEditText : EditText
    lateinit var descriptionEditText : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_set_title)
        titleEditText = findViewById(R.id.title_edit_text_set_activity)
        descriptionEditText = findViewById(R.id.desription_edit_text_set_activity)
    }

    fun next(view : View){
        var workout = Workout(MainActivity.workoutViewModel.allWorkout.value!!.size+1,titleEditText.text.toString(),descriptionEditText.text.toString())
        MainActivity.workoutViewModel.insert(workout)
        var nextIntent = Intent(this, ExerciseActivity::class.java)
        startActivity(nextIntent)
    }
}