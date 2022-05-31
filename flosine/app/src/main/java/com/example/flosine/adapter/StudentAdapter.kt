package com.example.flosine.adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class StudentAdapter (private val student : MutableList<Student>)
    : RecyclerView.Adapter <StudentAdapter.ViewHolder> () {

    class ViewHolder( view: View) : RecyclerView.ViewHolder (view) {

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}