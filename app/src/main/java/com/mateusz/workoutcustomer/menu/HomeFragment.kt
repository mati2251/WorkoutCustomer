package com.mateusz.workoutcustomer.menu

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.*



class HomeFragment() : Fragment() {
    lateinit var workoutAdapter : WorkoutAdapter
    lateinit var fab : FloatingActionButton
    var list : LinkedList<String> = LinkedList()


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        for(i in 0..5){
            list.add("Workout $i")
        }
        var recyclerView : RecyclerView = RecyclerView(requireContext())
        recyclerView.layoutManager = LinearLayoutManager(context)
        workoutAdapter = WorkoutAdapter(this.requireContext(), list)
        recyclerView.adapter = workoutAdapter
        workoutAdapter.loadDB(this.requireContext())
        return recyclerView
    }
}