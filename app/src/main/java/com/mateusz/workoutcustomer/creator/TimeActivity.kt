package com.mateusz.workoutcustomer.creator

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.mateusz.workoutcustomer.R
import com.mateusz.workoutcustomer.database.Exercise
import com.mateusz.workoutcustomer.menu.MainActivity
import com.mateusz.workoutcustomer.menu.MenuActivity

class TimeActivity : AppCompatActivity() {

    lateinit var series : EditText
    lateinit var time : EditText
    lateinit var pause : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time)
        series = findViewById(R.id.series_time)
        time = findViewById(R.id.time)
        pause = findViewById(R.id.pause_time)
    }

    fun addExercise (view : View){
        add()
        var nextIntent : Intent = Intent(this, ExerciseActivity::class.java)
        startActivity(nextIntent)
        finish()
    }

    fun finish (view : View){
        if(series.text.toString() == "" || time.text.toString() == "" || pause.text.toString() == "" )
        {
            val toast = Toast.makeText(applicationContext, "Insert data please", Toast.LENGTH_SHORT)
            toast.show()
        }
        else {
            add()
            var finishIntent: Intent = Intent(this, MenuActivity::class.java)
            startActivity(finishIntent)
            finish()
        }
    }

    fun add(){
        var id = MainActivity.workoutViewModel.allExercise.value?.size ?: 0
        MainActivity.workoutViewModel.insert(
            Exercise(
                id
                , intent.getIntExtra(SetTitleActivity.ID, 0 ),
                intent.getStringExtra(ExerciseActivity.TITLE),
                intent.getStringExtra(ExerciseActivity.DESCRIPTION),
                intent.getStringExtra(ExerciseActivity.INSTRUCTION),
                series.text.toString().toInt(),
                true,
                time.text.toString().toInt(),
                "s",
                0,
                pause.text.toString().toInt(),
                "s"
            ))
    }
}
