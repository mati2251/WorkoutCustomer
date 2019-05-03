package com.mateusz.workoutcustomer.creator

import android.arch.lifecycle.Observer
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.View
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import com.mateusz.workoutcustomer.R
import com.mateusz.workoutcustomer.database.Exercise
import com.mateusz.workoutcustomer.menu.MainActivity
import com.mateusz.workoutcustomer.menu.MenuActivity

class TimeActivity : AppCompatActivity() {

    lateinit var series : EditText
    lateinit var time : EditText
    lateinit var pause : EditText
    lateinit var spinner: Spinner
    lateinit var spinnerPause: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time)
        series = findViewById(R.id.series_time)
        time = findViewById(R.id.time)
        pause = findViewById(R.id.pause_time)
        spinner = findViewById(R.id.timeMenu)
        ArrayAdapter.createFromResource(
            this,
            R.array.time_formats,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
        }
        spinnerPause = findViewById(R.id.pauseMenu)
        ArrayAdapter.createFromResource(
            this,
            R.array.time_formats,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerPause.adapter = adapter
        }
        supportActionBar?.hide()
    }

    fun addExercise (view : View){
        if(series.text.toString() == "" || time.text.toString() == "" || pause.text.toString() == "" )
        {
            val toast = Toast.makeText(applicationContext, "Insert data please", Toast.LENGTH_SHORT)
            toast.show()
        }
        else if(series.text.toString().toInt() > 99 ||
            (time.text.toString().toInt() > 6000 && spinner.selectedItem == "seconds" ) ||
            (time.text.toString().toInt() > 99 && spinner.selectedItem == "minutes" ) ||
            (pause.text.toString().toInt() > 6000 && spinnerPause.selectedItem == "seconds") ||
            (pause.text.toString().toInt() > 99 && spinnerPause.selectedItem == "minutes" )){
            val toast = Toast.makeText(applicationContext, "Insert smaller data please", Toast.LENGTH_SHORT)
            toast.show()
        }
        else {
            add()
            var nextIntent: Intent = Intent(this, ExerciseActivity::class.java)
            nextIntent.putExtra(SetTitleActivity.ID, intent.getIntExtra(SetTitleActivity.ID, 0))
            startActivity(nextIntent)
            finish()
        }
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
                true,
                time.text.toString().toInt(),
                spinner.selectedItem.toString(),
                0,
                pause.text.toString().toInt(),
                spinnerPause.selectedItem.toString()
            ))
    }

    override fun onBackPressed() {
        AlertDialog.Builder(this)
            .setTitle("Create Exercise")
            .setMessage("Are you sure you want to not save this exercise?")
            .setPositiveButton("YES") { dialog, which ->
                super.onBackPressed()
            }
            .setNegativeButton("NO", null)
            .show()
    }
}
