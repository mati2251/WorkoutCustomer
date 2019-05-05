package com.mateusz.workoutcustomer.viewer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.mateusz.workoutcustomer.R
import com.mateusz.workoutcustomer.menu.MainActivity
import org.w3c.dom.Text

class ExerciseViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise_view)
        var exercise = MainActivity.workoutViewModel.findExerciseById(intent.getIntExtra(ExerciseAdapter.ID, 0))
        var tmp : TextView = findViewById(R.id.exerciseTitle)
        tmp.text = exercise.title
        tmp = findViewById(R.id.descriptionExercise)
        tmp.text = exercise.description
        tmp = findViewById(R.id.instructionExercise)
        tmp.text = exercise.instruction
        tmp = findViewById(R.id.seriesExercise)
        tmp.text = exercise.series.toString()
        tmp = findViewById(R.id.timeOrRepeatOutput)
        if(exercise.timeCheck){
            var tmp2 : TextView = findViewById(R.id.timeOrRepeat)
            tmp2.text = "Time: "
            tmp.text = "${exercise.time} ${exercise.timeFormat}"
        }
        else{
            var tmp2 : TextView = findViewById(R.id.timeOrRepeat)
            tmp2.text = "Pause: "
            tmp.text = exercise.repeat.toString()
        }
        tmp = findViewById(R.id.pauseExercise)
        tmp.text = "${exercise.pause} ${exercise.pauseFormat}"
        supportActionBar?.hide()
    }
}
