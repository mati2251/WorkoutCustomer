package com.mateusz.workoutcustomer.viewer

import android.annotation.SuppressLint
import android.arch.lifecycle.Observer
import android.content.Intent
import android.graphics.PorterDuff
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.mateusz.workoutcustomer.R
import com.mateusz.workoutcustomer.creator.ExerciseActivity
import com.mateusz.workoutcustomer.creator.SetTitleActivity
import com.mateusz.workoutcustomer.database.Workout
import com.mateusz.workoutcustomer.menu.MainActivity
import com.mateusz.workoutcustomer.menu.WorkoutAdapter

/**
 * This class is main viewer workout
 * @property exerciseAdapter is object ExerciseAdapter for RecycleView
 * @see exerciseAdapter
 * @property id is workout current id
 * @property WORKOUTID is address where intent put data about id and where activity get data.
 * @author Mateusz Karłowski
 */

class ViewActivity : AppCompatActivity() {
    lateinit var exerciseAdapter: ExerciseAdapter
    var id: Int = 0

    /**
     * It gets id from intent. Next find workout by id in database. And print about workout info on TextView.
     * It gets all exercise this workout and set in Adapter. Last recycleView set  adapter
     */

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)
        id = intent.getIntExtra(WorkoutAdapter.ID, 0)
        val workout: Workout = MainActivity.workoutViewModel.findWorkoutById(id)
        val title: TextView = findViewById(R.id.workout_title_view_activity)
        /**
         * Set Long Listener. Listener open dialog window with editText. And you can change in dialog window workout title
         */
        title.setOnLongClickListener{
            var alert : AlertDialog.Builder = AlertDialog.Builder(this)
            alert.setTitle("Enter new workout title")
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
                        MainActivity.workoutViewModel.updateWorkoutTitle(id, editText.text.toString())
                        title.text = editText.text.toString()
                    }
                }
            }
            alert.setNegativeButton("Cancel", null)
            alert.show()
            return@setOnLongClickListener true
        }
        /**
         * Set Long Listener. Listener open dialog window with editText. And you can change in dialog window workout description
         */
        val description: TextView = findViewById(R.id.workout_description_view_activity)
        description.setOnLongClickListener{
            var alert : AlertDialog.Builder = AlertDialog.Builder(this)
            alert.setTitle("Enter new workout description")
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
                        MainActivity.workoutViewModel.updateWorkoutDescription(id, editText.text.toString())
                        description.text = editText.text.toString()
                    }
                }
            }
            alert.setNegativeButton("Cancel", null)
            alert.show()
            return@setOnLongClickListener true
        }
        title.text = workout.title
        description.text = workout.description
        exerciseAdapter = ExerciseAdapter(applicationContext)
        val recyclerView: RecyclerView = findViewById(R.id.recycle_view_exercise)
        workoutId = workout.id
        recyclerView.layoutManager = LinearLayoutManager(applicationContext)
        MainActivity.workoutViewModel.allExercise.observe(this, Observer { exercise ->
            exercise?.let { exerciseAdapter.setList(it) }
        })
        recyclerView.adapter = exerciseAdapter
        supportActionBar?.hide()
    }

    /**
     * It starts current workout. And check if workout have exercise
     */

    fun start(view: View) {
        if (exerciseAdapter.mExercise.isNotEmpty()) {
            var startInetnt = Intent(this, StartActivity::class.java)
            startInetnt.putExtra(WORKOUTID, id)
            startActivity(startInetnt)
        } else {
            val toast =
                Toast.makeText(applicationContext, "You can't start workout without exercise", Toast.LENGTH_SHORT)
            toast.show()
        }
    }

    /**
     * Delete Workout and Finish activity
     */

    fun deleteWorkout(view: View) {
        MainActivity.workoutViewModel.deleteById(id)
        finish()
    }

    /**
     * Start creator new Exercise
     */

    fun newExercise(view: View) {
        var nextIntent = Intent(this, ExerciseActivity::class.java)
        nextIntent.putExtra(SetTitleActivity.ID, id)
        startActivity(nextIntent)
    }

    companion object {
        const val WORKOUTID: String = "com.mateusz.workoutcustomer.workoutid"
        var workoutId: Int = 0
    }
}
