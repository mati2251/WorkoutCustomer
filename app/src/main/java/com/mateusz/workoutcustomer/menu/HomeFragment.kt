package com.mateusz.workoutcustomer.menu

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.mateusz.workoutcustomer.R
import com.mateusz.workoutcustomer.database.Workout
import com.mateusz.workoutcustomer.database.WorkoutAdapter
import com.mateusz.workoutcustomer.database.WorkoutViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.*



class HomeFragment() : Fragment() {
    lateinit var workoutAdapter : WorkoutAdapter
    private lateinit var workoutViewModel: WorkoutViewModel


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var recyclerView : RecyclerView = RecyclerView(requireContext())
        recyclerView.layoutManager = LinearLayoutManager(context)
        workoutAdapter = WorkoutAdapter(this.requireContext())
        workoutViewModel = ViewModelProviders.of(this).get(WorkoutViewModel::class.java)
        var workout = Workout(10,"lele", "kleklwe")
        workoutViewModel.insert(workout)
        //workoutAdapter.setList(workoutViewModel.allWords.value)
        recyclerView.adapter = workoutAdapter
        return recyclerView
    }
}