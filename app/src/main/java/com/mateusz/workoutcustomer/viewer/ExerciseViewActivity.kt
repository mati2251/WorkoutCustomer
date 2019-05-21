package com.mateusz.workoutcustomer.viewer

import android.annotation.SuppressLint
import android.graphics.PorterDuff
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.text.InputType.TYPE_CLASS_NUMBER
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.mateusz.workoutcustomer.R
import com.mateusz.workoutcustomer.menu.MainActivity

/**
 * This shows data about selected exercise
 * @property id is current exercise id
 * @author Mateusz Karłowski
 */

class ExerciseViewActivity : AppCompatActivity() {

    var id: Int = 0

    /**
     * It finds exercise by id in database. And show data about this exercise on TextView.
     */

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise_view)
        var exercise = MainActivity.workoutViewModel.findExerciseById(intent.getIntExtra(ExerciseAdapter.ID, 0))
        var title: TextView = findViewById(R.id.exerciseTitle)
        title.text = exercise.title
        title.setOnLongClickListener{
            var alert : AlertDialog.Builder = AlertDialog.Builder(this)
            alert.setTitle("Enter new exercise title")
            var editText : EditText = EditText(applicationContext)
            alert.setView(editText)
            editText.background.clearColorFilter()
            editText.background.setColorFilter(R.color.primary_material_dark, PorterDuff.Mode.SRC_IN)
            alert.setPositiveButton("OK"){ dialog, which ->
                when {
                    editText.text.toString() == "" -> {
                        val toast =
                            Toast.makeText(applicationContext, "Insert data please", Toast.LENGTH_SHORT)
                        toast.show()
                    }
                    editText.text.toString().length > 30 -> {
                        val toast =
                            Toast.makeText(applicationContext, "Insert shorter data please", Toast.LENGTH_SHORT)
                        toast.show()
                    }
                    else -> {
                        MainActivity.workoutViewModel.updateExerciseTitle(id, editText.text.toString())
                        title.text = editText.text.toString()
                    }
                }
            }
            alert.setNegativeButton("Cancel", null)
            alert.show()
            return@setOnLongClickListener true
        }
        var description : TextView = findViewById(R.id.descriptionExercise)
        description.text = exercise.description
        description.setOnLongClickListener{
            var alert : AlertDialog.Builder = AlertDialog.Builder(this)
            alert.setTitle("Enter new exercise description")
            var editText : EditText = EditText(applicationContext)
            alert.setView(editText)
            editText.background.clearColorFilter()
            editText.background.setColorFilter(R.color.primary_material_dark, PorterDuff.Mode.SRC_IN)
            alert.setPositiveButton("OK"){ dialog, which ->
                when {
                    editText.text.toString() == "" -> {
                        val toast =
                            Toast.makeText(applicationContext, "Insert data please", Toast.LENGTH_SHORT)
                        toast.show()
                    }
                    editText.text.toString().length > 30 -> {
                        val toast =
                            Toast.makeText(applicationContext, "Insert shorter data please", Toast.LENGTH_SHORT)
                        toast.show()
                    }
                    else -> {
                        MainActivity.workoutViewModel.updateExerciseDescription(id, editText.text.toString())
                        description.text = editText.text.toString()
                    }
                }
            }
            alert.setNegativeButton("Cancel", null)
            alert.show()
            return@setOnLongClickListener true
        }
        var instruction : TextView = findViewById(R.id.instructionExercise)
        instruction.text = exercise.instruction
        instruction.setOnLongClickListener{
            var alert : AlertDialog.Builder = AlertDialog.Builder(this)
            alert.setTitle("Enter new exercise instruction")
            var editText : EditText = EditText(applicationContext)
            alert.setView(editText)
            editText.background.clearColorFilter()
            editText.background.setColorFilter(R.color.primary_material_dark, PorterDuff.Mode.SRC_IN)
            alert.setPositiveButton("OK"){ dialog, which ->
                when {
                    editText.text.toString() == "" -> {
                        val toast =
                            Toast.makeText(applicationContext, "Insert data please", Toast.LENGTH_SHORT)
                        toast.show()
                    }
                    else -> {
                        MainActivity.workoutViewModel.updateExerciseInstruction(id, editText.text.toString())
                        instruction.text = editText.text.toString()
                    }
                }
            }
            alert.setNegativeButton("Cancel", null)
            alert.show()
            return@setOnLongClickListener true
        }
        var series : TextView = findViewById(R.id.seriesExercise)
        series.text = exercise.series.toString()
        series.setOnLongClickListener{
            var alert : AlertDialog.Builder = AlertDialog.Builder(this)
            alert.setTitle("Enter new number series")
            var editText : EditText = EditText(applicationContext)
            alert.setView(editText)
            editText.inputType = TYPE_CLASS_NUMBER
            editText.background.clearColorFilter()
            editText.background.setColorFilter(R.color.primary_material_dark, PorterDuff.Mode.SRC_IN)
            alert.setPositiveButton("OK"){ dialog, which ->
                when {
                    editText.text.toString() == "" -> {
                        val toast =
                            Toast.makeText(applicationContext, "Insert data please", Toast.LENGTH_SHORT)
                        toast.show()
                    }
                    editText.text.toString().length > 30 -> {
                        val toast =
                            Toast.makeText(applicationContext, "Insert shorter data please", Toast.LENGTH_SHORT)
                        toast.show()
                    }
                    else -> {
                        MainActivity.workoutViewModel.updateExerciseSeries(id, editText.text.toString().toInt())
                        series.text = editText.text.toString()
                    }
                }
            }
            alert.setNegativeButton("Cancel", null)
            alert.show()
            return@setOnLongClickListener true
        }
        var timeOrRepat : TextView = findViewById(R.id.timeOrRepeatOutput)
        if (exercise.timeCheck) {
            var tmp2: TextView = findViewById(R.id.timeOrRepeat)
            tmp2.text = "Time: "
            timeOrRepat.text = "${exercise.time} ${exercise.timeFormat}"
            timeOrRepat.setOnLongClickListener{
                var alert : AlertDialog.Builder = AlertDialog.Builder(this)
                alert.setTitle("Enter new time")
                var editText : EditText = EditText(applicationContext)
                alert.setView(editText)
                editText.background.clearColorFilter()
                editText.inputType = TYPE_CLASS_NUMBER
                editText.background.setColorFilter(R.color.primary_material_dark, PorterDuff.Mode.SRC_IN)
                alert.setPositiveButton("OK"){ dialog, which ->
                    when {
                        editText.text.toString() == "" -> {
                            val toast =
                                Toast.makeText(applicationContext, "Insert data please", Toast.LENGTH_SHORT)
                            toast.show()
                        }
                        editText.text.toString().length > 30 -> {
                            val toast =
                                Toast.makeText(applicationContext, "Insert shorter data please", Toast.LENGTH_SHORT)
                            toast.show()
                        }
                        else -> {
                            MainActivity.workoutViewModel.updateExerciseTime(id, editText.text.toString().toInt())
                            timeOrRepat.text = editText.text.toString() + " " + exercise.timeFormat
                        }
                    }
                }
                alert.setNegativeButton("Cancel", null)
                alert.show()
                return@setOnLongClickListener true
            }
        } else {
            var tmp2: TextView = findViewById(R.id.timeOrRepeat)
            tmp2.text = "Repeat: "
            timeOrRepat.text = exercise.repeat.toString()
            timeOrRepat.setOnLongClickListener{
                var alert : AlertDialog.Builder = AlertDialog.Builder(this)
                alert.setTitle("Enter new repeat number")
                var editText : EditText = EditText(applicationContext)
                alert.setView(editText)
                editText.background.clearColorFilter()
                editText.inputType = TYPE_CLASS_NUMBER
                editText.background.setColorFilter(R.color.primary_material_dark, PorterDuff.Mode.SRC_IN)
                alert.setPositiveButton("OK"){ dialog, which ->
                    when {
                        editText.text.toString() == "" -> {
                            val toast =
                                Toast.makeText(applicationContext, "Insert data please", Toast.LENGTH_SHORT)
                            toast.show()
                        }
                        editText.text.toString().length > 30 -> {
                            val toast =
                                Toast.makeText(applicationContext, "Insert shorter data please", Toast.LENGTH_SHORT)
                            toast.show()
                        }
                        else -> {
                            MainActivity.workoutViewModel.updateExerciseRepeat(id, editText.text.toString().toInt())
                            timeOrRepat.text = editText.text.toString()
                        }
                    }
                }
                alert.setNegativeButton("Cancel", null)
                alert.show()
                return@setOnLongClickListener true
            }
        }
        var pause : TextView = findViewById(R.id.pauseExercise)
        pause.text = "${exercise.pause} ${exercise.pauseFormat}"
        pause.setOnLongClickListener{
            var alert : AlertDialog.Builder = AlertDialog.Builder(this)
            alert.setTitle("Enter new pause")
            var editText : EditText = EditText(applicationContext)
            alert.setView(editText)
            editText.background.clearColorFilter()
            editText.inputType = TYPE_CLASS_NUMBER
            editText.background.setColorFilter(R.color.primary_material_dark, PorterDuff.Mode.SRC_IN)
            alert.setPositiveButton("OK"){ dialog, which ->
                when {
                    editText.text.toString() == "" -> {
                        val toast =
                            Toast.makeText(applicationContext, "Insert data please", Toast.LENGTH_SHORT)
                        toast.show()
                    }
                    editText.text.toString().length > 30 -> {
                        val toast =
                            Toast.makeText(applicationContext, "Insert shorter data please", Toast.LENGTH_SHORT)
                        toast.show()
                    }
                    else -> {
                        MainActivity.workoutViewModel.updateExercisePause(id, editText.text.toString().toInt())
                        pause.text = editText.text.toString() + " " + exercise.pauseFormat
                    }
                }
            }
            alert.setNegativeButton("Cancel", null)
            alert.show()
            return@setOnLongClickListener true
        }
        id = exercise.id
        supportActionBar?.hide()
    }

    /**
     * This function delete Exercise by ID
     */

    fun deleteExercise(view: View) {
        MainActivity.workoutViewModel.deleteExerciseById(id)
    }
}
