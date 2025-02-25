package com.example.recyclerviewtest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.rv)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = PostAdapter(getSampleData())

        return view
    }

    private fun getSampleData(): List<String> {
        return listOf("Post 1", "Post 2", "Post 3", "Post 4", "Post 5")
    }
}

