package com.mateusz.workoutcustomer

import android.content.Context
import android.support.design.widget.FloatingActionButton
import android.support.v4.app.FragmentActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import java.util.*


class WorkoutAdapter(context: Context, list: LinkedList<String>) : RecyclerView.Adapter<WorkoutAdapter.WorkoutViewHolder>(){
    private var mInflater = LayoutInflater.from(context)
    var mWordList : LinkedList<String> = list

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): WorkoutAdapter.WorkoutViewHolder {
        var itemView = mInflater.inflate( R.layout.workout_item, parent,false)
        return WorkoutViewHolder(itemView, this )
    }

    override fun onBindViewHolder(holder : WorkoutViewHolder, positon: Int) {
        var currentStinrg = mWordList.get(positon)
        holder.mWorkoutTitile.text=currentStinrg
    }

    override fun getItemCount(): Int {
        return mWordList.size
    }

    inner class WorkoutViewHolder (viewItem : View, workoutAdapter : WorkoutAdapter) : RecyclerView.ViewHolder(viewItem){
        var mAdapter: WorkoutAdapter = workoutAdapter
        var mWorkoutTitile : TextView = viewItem.findViewById(R.id.workout_title)
    }
}