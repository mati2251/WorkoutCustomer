package com.mateusz.workoutcustomer.menu

import android.content.Context
import android.content.Intent
import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.mateusz.workoutcustomer.R
import com.mateusz.workoutcustomer.database.Workout
import com.mateusz.workoutcustomer.viewer.ViewActivity

/**
 * class WorkoutAdapter extends from RecycleView.Adapter and it is for RecycleView
 *  @property mWorkout is list Workout
 *  @see Workout
 *  @property id stores id clicked item
 *  @property ID is string which stores id address. This address is for intent can put ID. This property is companion object because ViewActivity must have address for read data
 *  @author Mateusz Karłowski
 */

class WorkoutAdapter(context: Context) : RecyclerView.Adapter<WorkoutAdapter.WorkoutViewHolder>(){
    private var mInflater = LayoutInflater.from(context)
    private lateinit var mWorkout : List<Workout>
    private lateinit var cardView : CardView
    var id : Int = 0

    /**
     * onCreateViewHolder find CardView in layout and return items look like R.layout.workout_item with data
     */

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): WorkoutViewHolder {
        val itemView = mInflater.inflate(R.layout.workout_item, parent,false)
        cardView = itemView.findViewById(R.id.cardView)
        return WorkoutViewHolder(itemView, this )
    }

    /**
     * onBindViewHolder set data from mWorkout to item
     */

    override fun onBindViewHolder(holder : WorkoutViewHolder, positon: Int) {
        var currentStinrg = mWorkout[positon].title
        holder.mWorkoutTitle.text=currentStinrg
        currentStinrg = mWorkout[positon].description
        holder.mWorkoutDescription.text = currentStinrg
        holder.id = mWorkout[positon].id

    }

    /**
     * @return how many item
     */

    override fun getItemCount(): Int {
        return if(::mWorkout.isInitialized){
            mWorkout.size
        } else{
            0
        }
    }

    /**
     * class WorkoutViewHolder set onClick card listener and find layout item in R.layout.workout_item
     * @property id is workout id
     * @property mWorkoutTitle is TextView with workout Title, Its id is R.id.workout_title
     * @property mWorkoutDescription is TextView with workout Description. Its id is R.id.workout_description
     * @constructor sets OnClick as OnClickListener
     */

    inner class WorkoutViewHolder (viewItem : View, workoutAdapter : WorkoutAdapter) : RecyclerView.ViewHolder(viewItem), View.OnClickListener{
        var mAdapter: WorkoutAdapter = workoutAdapter
        var id : Int = this@WorkoutAdapter.id
        var mWorkoutTitle : TextView = viewItem.findViewById(R.id.workout_title)
        var mWorkoutDescription : TextView = viewItem.findViewById(R.id.workout_description)

        init{
            viewItem.setOnClickListener(this)
        }

        /**
         * onClick starts new Intent and put ID to this Intent
         */

        override fun onClick(view: View){
            var intentView = Intent(itemView.context , ViewActivity::class.java)
            intentView.putExtra(ID, id)
            itemView.context.startActivity(intentView)
        }


    }

    /**
     * function setList set new List with new Data
     *  @property list is list with workout
     */

    fun setList(list: List<Workout>) {
        mWorkout = list
        this.notifyDataSetChanged()
    }

    companion object {
        var ID : String = "com.mateusz.workoutcustomre.menu.id"
    }
}