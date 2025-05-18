package com.example.izhcity_lab4.ui

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.izhcity_lab4.R
import androidx.navigation.fragment.findNavController

class CategoryFragment : Fragment(R.layout.fragment_category) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val args: CategoryFragmentArgs by navArgs()
        val categoryTitle = args.categoryName

        val recommendations = when (categoryTitle) {
            "Кофейни" -> listOf(
                "Литературная кофейня Чашка",
                "Tasty Coffee",
                "Blanche"
            )
            "Рестораны" -> listOf(
                "Каре",
                "Brauplatz",
                "Panorama"
            )
            "Парки" -> listOf(
                "Динополис",
                "Парк Горького",
                "Тишино"
            )
            "ТЦ" -> listOf(
                "Тройка",
                "Пассаж",
                "Три кита"
            )
            else -> listOf("Нет рекомендаций")
        }


        view.findViewById<TextView>(R.id.category_title).text = categoryTitle
        val listView = view.findViewById<ListView>(R.id.recommendation_list)
        listView.adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, recommendations)

        listView.setOnItemClickListener { _, _, position, _ ->
            val action = CategoryFragmentDirections.actionCategoryToDetail(recommendations[position])
            findNavController().navigate(action)
        }
    }
}