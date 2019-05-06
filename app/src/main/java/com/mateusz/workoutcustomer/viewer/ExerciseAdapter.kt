
package com.mateusz.workoutcustomer.viewer

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.mateusz.workoutcustomer.R
import com.mateusz.workoutcustomer.database.Exercise

class ExerciseAdapter(context: Context) : RecyclerView.Adapter<ExerciseAdapter.ExerciseViewHolder>() {

    private var mInflater = LayoutInflater.from(context)
    lateinit var mExercise: List<Exercise>
    var id : Int = 0

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ExerciseViewHolder {
        val itemView = mInflater.inflate(R.layout.exercise_item, parent, false)
        return ExerciseViewHolder(itemView, this)
    }

    override fun onBindViewHolder(holder: ExerciseViewHolder, position: Int) {
        var currentString = mExercise[position].title
        holder.mExerciseTitle.text = currentString
        currentString = mExercise[position].description
        holder.mExerciseDescription.text = currentString
        if(mExercise[position].timeCheck) {
            when(mExercise[position].timeFormat){
                "seconds" -> currentString = "sec"
                else -> currentString = "min"
            }
            holder.mExerciseDetails.text = "Series: ${mExercise[position].series} Time: ${mExercise[position].time} $currentString"
        }
        else{
            holder.mExerciseDetails.text = "Series: ${mExercise[position].series} Repeat: ${mExercise[position].repeat}"
        }
        when(mExercise[position].timeFormat){
            "seconds" -> currentString = "sec"
            else -> currentString = "min"
        }
        holder.mExerciseDetails.text = "${holder.mExerciseDetails.text} Pause: ${mExercise[position].pause} $currentString"
        holder.id = mExercise[position].id
    }

    override fun getItemCount(): Int {
        return if(::mExercise.isInitialized){
            mExercise.size
        } else{
            0
        }
    }

    inner class ExerciseViewHolder(viewItem: View, exerciseAdapter: ExerciseAdapter) : RecyclerView.ViewHolder(viewItem), View.OnClickListener {
        var exerciseAdapter = exerciseAdapter
        var mExerciseTitle : TextView = viewItem.findViewById(R.id.exercise_title)
        var mExerciseDescription : TextView = viewItem.findViewById(R.id.exercise_desctiption)
        var mExerciseDetails : TextView = viewItem.findViewById(R.id.detailsExercise)
        var id : Int = this@ExerciseAdapter.id
        init{
            viewItem.setOnClickListener(this)
        }

        override fun onClick(view: View){
            var intentView : Intent = Intent(itemView.context , ExerciseViewActivity::class.java)
            intentView.putExtra(ID, id)
            itemView.context.startActivity(intentView)
        }
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

    companion object{
        const val ID = "com.mateusz.workoutcustomer.ExerciseId"
    }

}