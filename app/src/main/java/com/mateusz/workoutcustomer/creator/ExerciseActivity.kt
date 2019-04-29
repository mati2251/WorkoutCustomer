package com.mateusz.workoutcustomer.creator

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.View
import android.widget.EditText
import android.widget.RadioGroup
import com.mateusz.workoutcustomer.R

class ExerciseActivity : AppCompatActivity() {

    lateinit var radioGroup : RadioGroup
    lateinit var title : EditText
    lateinit var description: EditText
    lateinit var instruction: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise)
        radioGroup = findViewById(R.id.radio_group)
        title = findViewById(R.id.exercise_title_edit_text)
        description = findViewById(R.id.exercise_description_edit_text)
        instruction = findViewById(R.id.exercise_instruction_edit_text)
        supportActionBar?.hide()
    }

    fun nextExercise(view : View){
        var nextIntent : Intent
        if (radioGroup.checkedRadioButtonId == R.id.radio_button_repeat){
            nextIntent = Intent(this, RepeatActivity::class.java)
        }
        else {
            nextIntent = Intent(this, TimeActivity::class.java)
        }
        nextIntent.putExtra(TITLE, title.text.toString())
        nextIntent.putExtra(INSTRUCTION, instruction.text.toString())
        nextIntent.putExtra(DESCRIPTION, description.text.toString())
        nextIntent.putExtra(SetTitleActivity.ID, intent.getIntExtra(SetTitleActivity.ID, 0))
        startActivity(nextIntent)
        finish()
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

    companion object {
        const val TITLE : String = "com.mateusz.workoutcustomer.etitle"
        const val DESCRIPTION : String = "com.mateusz.workoutcustomer.description"
        const val INSTRUCTION : String = "com.mateusz.workoutcustomer.instrucuton"
    }

}
