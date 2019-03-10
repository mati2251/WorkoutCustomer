package com.mateusz.workoutcustomer

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout
import java.util.*
import android.widget.Toast



class HomeFragment() : Fragment() {
    var recyclerView: RecyclerView? = null
    lateinit var workoutAdapter : WorkoutAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var list : LinkedList<String> = LinkedList()
        for(i in 0..5){
            list.add("Workout $i")
        }
        var recyclerView : RecyclerView = RecyclerView(requireContext())
        recyclerView.layoutManager = LinearLayoutManager(context)
        workoutAdapter = WorkoutAdapter(this.requireContext(), list)
        recyclerView.adapter = workoutAdapter
        return recyclerView
    }
}