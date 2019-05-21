package com.mateusz.workoutcustomer.creator

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.View
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.Toast
import com.mateusz.workoutcustomer.R

/**
 * class ExerciseActivity is create new Exercise
 * @property radioGroup is group with two RadioButtons. First is Time. Second is Repeat. User choose button according from exercise
 * @property title is EditText where user put title new exercise
 * @property description is EditText where user put description new exercise
 * @property instruction is EditText where user put instruction new exercise
 * @property TITLE is address title new exercise where new intent put data. And where next activity can find data from this activity
 * @property DESCRIPTION is address description new exercise where new intent put data. And where next activity can find data from this activity
 * @property INSTRUCTION is address instruction new exercise where new intent put data. And where next activity can find data from this activity
 * @author Mateusz Karłowski
 */

class ExerciseActivity : AppCompatActivity() {

    lateinit var radioGroup: RadioGroup
    lateinit var title: EditText
    lateinit var description: EditText
    lateinit var instruction: EditText

    /**
     * it finds layout elements and stores to variable
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise)
        radioGroup = findViewById(R.id.radio_group)
        title = findViewById(R.id.exercise_title_edit_text)
        description = findViewById(R.id.exercise_description_edit_text)
        instruction = findViewById(R.id.exercise_instruction_edit_text)
        supportActionBar?.hide()
    }

    /**
     * It checks EditText is empty. If yes show statement. But if EditText is not empty. It create new Intent, put data and start new activity
     */

    fun nextExercise(view: View) {
        if (!(title.text.toString() == "")) {
            val nextIntent: Intent = if (radioGroup.checkedRadioButtonId == R.id.radio_button_repeat) {
                Intent(this, RepeatActivity::class.java)
            } else {
                Intent(this, TimeActivity::class.java)
            }
            nextIntent.putExtra(TITLE, title.text.toString())
            nextIntent.putExtra(INSTRUCTION, instruction.text.toString())
            nextIntent.putExtra(DESCRIPTION, description.text.toString())
            nextIntent.putExtra(SetTitleActivity.ID, intent.getIntExtra(SetTitleActivity.ID, 0))
            startActivity(nextIntent)
            finish()
        } else if (title.text.toString().length > 30 || description.text.toString().length > 50) {
            val toast =
                Toast.makeText(applicationContext, "Insert shorter description or title please", Toast.LENGTH_SHORT)
            toast.show()
        } else {
            val toast = Toast.makeText(applicationContext, "Insert data please", Toast.LENGTH_SHORT)
            toast.show()
        }
    }

    /**
     * It shows dialog with message "Are you sure you want to exit?"
     * This dialog have two options
     * YES retreat
     * NO do nothing
     */

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
        const val TITLE: String = "com.mateusz.workoutcustomer.etitle"
        const val DESCRIPTION: String = "com.mateusz.workoutcustomer.description"
        const val INSTRUCTION: String = "com.mateusz.workoutcustomer.instrucuton"
    }

}
