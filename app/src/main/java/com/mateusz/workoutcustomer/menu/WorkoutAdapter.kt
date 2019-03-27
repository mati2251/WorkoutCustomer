package com.mateusz.workoutcustomer.database

import android.content.Context
import android.content.Intent
import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.mateusz.workoutcustomer.R
import com.mateusz.workoutcustomer.viewer.ViewActivity


class WorkoutAdapter(context: Context) : RecyclerView.Adapter<WorkoutAdapter.WorkoutViewHolder>(){
    private var mInflater = LayoutInflater.from(context)
    lateinit var mWorkout : List<Workout>
    lateinit var cardView : CardView
    var id : Int = 0

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): WorkoutViewHolder {
        var itemView = mInflater.inflate(R.layout.workout_item, parent,false)
        cardView = itemView.findViewById(R.id.cardView)
        return WorkoutViewHolder(itemView, this )
    }

    override fun onBindViewHolder(holder : WorkoutViewHolder, positon: Int) {
        var currentStinrg = mWorkout[positon].title
        holder.mWorkoutTitile.text=currentStinrg
        currentStinrg = mWorkout[positon].description
        holder.mWorkoutDescripton.text = currentStinrg
        holder.id = mWorkout[positon].id

    }

    override fun getItemCount(): Int {
        if(::mWorkout.isInitialized){
            return mWorkout.size
        }
        else{
            return 0
        }
    }

    inner class WorkoutViewHolder (viewItem : View, workoutAdapter : WorkoutAdapter) : RecyclerView.ViewHolder(viewItem), View.OnClickListener{
        var mAdapter: WorkoutAdapter = workoutAdapter
        var id : Int = this@WorkoutAdapter.id
        var mWorkoutTitile : TextView = viewItem.findViewById(R.id.workout_title)
        var mWorkoutDescripton : TextView = viewItem.findViewById(R.id.workout_description)

        init{
            viewItem.setOnClickListener(this)
        }

        override fun onClick(view: View){
            var intentView : Intent = Intent(itemView.context , ViewActivity::class.java)
            intentView.putExtra(WorkoutAdapter.ID, id)
            itemView.context.startActivity(intentView)
        }


    }

    fun setList(list: List<Workout>){
        mWorkout = list
        this.notifyDataSetChanged()
    }

    companion object {
        var ID : String = "com.mateusz.workoutcustomre.menu.id"
    }
}