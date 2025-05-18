package com.example.izhcity_lab4.ui

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.example.izhcity_lab4.R

class HomeFragment : Fragment(R.layout.fragment_home) {
    private lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = findNavController()

        val listView = view.findViewById<ListView>(R.id.category_list)
        val categories = listOf("Кофейни", "Рестораны", "Парки", "ТЦ")
        listView.adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, categories)

        listView.setOnItemClickListener { _, _, position, _ ->
            val action = HomeFragmentDirections.actionHomeToCategory(categories[position])
            navController.navigate(action)
        }
    }
}