package com.mateusz.workoutcustomer.creator

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.mateusz.workoutcustomer.R
import com.mateusz.workoutcustomer.database.Workout
import com.mateusz.workoutcustomer.menu.MainActivity

class SetTitleActivity : AppCompatActivity() {

    lateinit var titleEditText : EditText
    lateinit var descriptionEditText : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_set_title)
        titleEditText = findViewById(R.id.title_edit_text_set_activity)
        descriptionEditText = findViewById(R.id.desription_edit_text_set_activity)
        exerciseNum = 0
        supportActionBar?.hide()
    }

    fun next(view: View){
        if(titleEditText.text.toString()==""|| descriptionEditText.text.toString()==""){
            val toast = Toast.makeText(applicationContext, "Insert data please", Toast.LENGTH_SHORT)
            toast.show()
        }
        else if(titleEditText.text.toString().length>30 || descriptionEditText.text.toString().length>50){
            val toast = Toast.makeText(applicationContext, "Insert shorter description or title please", Toast.LENGTH_SHORT)
            toast.show()
        }
        else{
            var id = MainActivity.workoutViewModel.allWorkout.value!!.size + 1
            var workout = Workout(id, titleEditText.text.toString(), descriptionEditText.text.toString())
            MainActivity.workoutViewModel.insert(workout)
            var nextIntent = Intent(this, ExerciseActivity::class.java)
            nextIntent.putExtra(ID, id)
            startActivity(nextIntent)
            finish()
        }
    }

    companion object {
        val ID : String = "com.mateusz.workoutcustomer.currentId"
        var exerciseNum : Int = 0
    }

    override fun onBackPressed() {
        AlertDialog.Builder(this)
            .setTitle("Create Workout")
            .setMessage("Are you sure you want to exit?")
            .setPositiveButton("YES") { dialog, which ->
                super.onBackPressed()
            }
            .setNegativeButton("NO", null)
            .show()
    }
}