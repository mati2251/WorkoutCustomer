package com.mateusz.workoutcustomer.creator

import android.arch.lifecycle.Observer
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

class RepeatActivity : AppCompatActivity() {

    lateinit var series : EditText
    lateinit var repeat : EditText
    lateinit var pause : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_repeat)
        series = findViewById(R.id.series_repeat)
        repeat = findViewById(R.id.repeat)
        pause = findViewById(R.id.pause_repeat)
    }

    fun addExerciseRepeat (view : View){
        add()
        var nextIntent : Intent = Intent(this, ExerciseActivity::class.java)
        nextIntent.putExtra(SetTitleActivity.ID, intent.getIntExtra(SetTitleActivity.ID, 0))
        startActivity(nextIntent)
        finish()
    }

    fun finishRepeat (view : View){
        if(series.text.toString() == "" || repeat.text.toString() == "" || pause.text.toString() == "" )
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
        var id : Int = 0
        MainActivity.workoutViewModel.allExercise.observe(this, Observer {
                words -> words?.let { id = it.size }
        })
        MainActivity.workoutViewModel.insert(
            Exercise(
                id
                , intent.getIntExtra(SetTitleActivity.ID, 0 ),
                intent.getStringExtra(ExerciseActivity.TITLE),
                intent.getStringExtra(ExerciseActivity.DESCRIPTION),
                intent.getStringExtra(ExerciseActivity.INSTRUCTION),
                series.text.toString().toInt(),
                false,
                0,
                "s",
                repeat.text.toString().toInt(),
                pause.text.toString().toInt(),
                "s"
            ))
    }
}
