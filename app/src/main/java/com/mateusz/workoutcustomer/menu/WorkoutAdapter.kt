package com.mateusz.workoutcustomer.menu

import android.arch.persistence.room.Room
import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.mateusz.workoutcustomer.R
import com.mateusz.workoutcustomer.database.AppDatabase
import com.mateusz.workoutcustomer.database.Workout
import java.util.*


class WorkoutAdapter(context: Context, list: LinkedList<String>) : RecyclerView.Adapter<WorkoutAdapter.WorkoutViewHolder>(){
    private var mInflater = LayoutInflater.from(context)
    private var mWordList : LinkedList<String> = list
    private lateinit var mWorkout : List<Workout>

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): WorkoutViewHolder {
        var itemView = mInflater.inflate(R.layout.workout_item, parent,false)
        return WorkoutViewHolder(itemView, this )
    }

    override fun onBindViewHolder(holder : WorkoutViewHolder, positon: Int) {
        var currentStinrg = mWordList.get(positon)
        holder.mWorkoutTitile.text=currentStinrg
        holder.mWorkoutDescripton.text="Description"
    }

    override fun getItemCount(): Int {
        return mWordList.size
    }

    inner class WorkoutViewHolder (viewItem : View, workoutAdapter : WorkoutAdapter) : RecyclerView.ViewHolder(viewItem){
        var mAdapter: WorkoutAdapter = workoutAdapter
        var mWorkoutTitile : TextView = viewItem.findViewById(R.id.workout_title)
        var mWorkoutDescripton : TextView = viewItem.findViewById(R.id.workout_description)
    }

    fun addElement(){
        mWordList.add("clicked workout")
        this.notifyItemInserted(mWordList.size)

    }

    fun loadDB(context: Context){
        val db = Room.databaseBuilder(context,
            AppDatabase::class.java, "database-name"
        ).build()
        mWorkout = db.workoutDao().getAllWords()

    }

}