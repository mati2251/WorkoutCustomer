package com.mateusz.workoutcustomer.database

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.mateusz.workoutcustomer.R


class WorkoutAdapter(context: Context) : RecyclerView.Adapter<WorkoutAdapter.WorkoutViewHolder>(){
    private var mInflater = LayoutInflater.from(context)
    lateinit var mWorkout : List<Workout>

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): WorkoutViewHolder {
        var itemView = mInflater.inflate(R.layout.workout_item, parent,false)
        return WorkoutViewHolder(itemView, this )
    }

    override fun onBindViewHolder(holder : WorkoutViewHolder, positon: Int) {
        var currentStinrg = mWorkout[positon].title
        holder.mWorkoutTitile.text=currentStinrg
        currentStinrg = mWorkout[positon].description
        holder.mWorkoutDescripton.text = currentStinrg
    }

    override fun getItemCount(): Int {
        if(::mWorkout.isInitialized){
            return mWorkout.size
        }
        else{
            return 0
        }
    }

    inner class WorkoutViewHolder (viewItem : View, workoutAdapter : WorkoutAdapter) : RecyclerView.ViewHolder(viewItem){
        var mAdapter: WorkoutAdapter = workoutAdapter
        var mWorkoutTitile : TextView = viewItem.findViewById(R.id.workout_title)
        var mWorkoutDescripton : TextView = viewItem.findViewById(R.id.workout_description)
    }

    fun setList(list: List<Workout>){
        mWorkout = list
        this.notifyDataSetChanged()
    }

}