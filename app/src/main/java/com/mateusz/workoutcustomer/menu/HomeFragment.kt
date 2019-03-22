package com.mateusz.workoutcustomer.menu

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.mateusz.workoutcustomer.database.WorkoutAdapter
import com.mateusz.workoutcustomer.database.WorkoutViewModel


class HomeFragment() : Fragment() {
    lateinit var workoutAdapter : WorkoutAdapter
    lateinit var fab : FloatingActionButton


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var recyclerView : RecyclerView = RecyclerView(requireContext())
        recyclerView.layoutManager = LinearLayoutManager(context)
        MainActivity.workoutViewModel = ViewModelProviders.of(this).get(WorkoutViewModel::class.java)
        workoutAdapter = WorkoutAdapter(this.requireContext())
        MainActivity.workoutViewModel.allWorkout.observe(this, Observer {
                words -> words?.let { workoutAdapter.setList(it) }
        })
        recyclerView.adapter = workoutAdapter
        return recyclerView
    }
}