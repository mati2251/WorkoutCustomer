
package com.mateusz.workoutcustomer.viewer

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.mateusz.workoutcustomer.R
import com.mateusz.workoutcustomer.creator.SetTitleActivity
import com.mateusz.workoutcustomer.database.Exercise

class ExerciseAdapter(context: Context) : RecyclerView.Adapter<ExerciseAdapter.ExerciseViewHolder>() {

    private var mInflater = LayoutInflater.from(context)
    lateinit var mExercise: List<Exercise>

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ExerciseViewHolder {
        var itemView = mInflater.inflate(R.layout.exercise_item, parent, false)
        return ExerciseViewHolder(itemView, this)
    }

    override fun onBindViewHolder(holder: ExerciseViewHolder, position: Int) {
        var currentString = mExercise[position].title
        holder.mExerciseTitle.text = currentString
        currentString = mExercise[position].description
        holder.mExerciseDescription.text = currentString
    }

    override fun getItemCount(): Int {
        if(::mExercise.isInitialized){
            return mExercise.size
        }
        else{
            return 0
        }
    }

    inner class ExerciseViewHolder(viewItem: View, exerciseAdapter: ExerciseAdapter) : RecyclerView.ViewHolder(viewItem) {
        var exerciseAdapter = exerciseAdapter
        var mExerciseTitle : TextView = viewItem.findViewById(R.id.exercise_title)
        var mExerciseDescription : TextView = viewItem.findViewById(R.id.exercise_desctiption)
    }

    fun setList(list: List<Exercise>){
        var tmp : ArrayList<Exercise> = ArrayList()
        list.forEach{
            if(it.workoutId == ViewActivity.workoutId){
                tmp.add(it)
            }

        }
        mExercise = tmp
        this.notifyDataSetChanged()
    }

}