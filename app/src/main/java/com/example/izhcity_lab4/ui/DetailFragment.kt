package com.example.izhcity_lab4.ui

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.izhcity_lab4.R

class DetailFragment : Fragment(R.layout.fragment_detail) {

    private val args: DetailFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val titleTextView = view.findViewById<TextView>(R.id.place_title)
        val descriptionTextView = view.findViewById<TextView>(R.id.place_description)
        val imageView = view.findViewById<ImageView>(R.id.place_image)

        val recommendation = args.recommendationName
        titleTextView.text = recommendation

        val (description, imageResId) = getDetailsForRecommendation(recommendation)

        descriptionTextView.text = description
        imageView.setImageResource(imageResId)
    }

    private fun getDetailsForRecommendation(name: String): Pair<String, Int> {
        return when (name) {
            "Литературная кофейня Чашка" -> Pair(
                "Уютное место с атмосферой творчества. Попробуйте их авторский раф.",
                R.drawable.chashka
            )
            "Tasty Coffee" -> Pair(
                "Современная кофейня с обжаркой собственного зерна. Отличный выбор фильтра.",
                R.drawable.tasty_coffee
            )
            "Blanche" -> Pair(
                "Скандинавская эстетика и десерты. Легендарный чизкейк.",
                R.drawable.blanche
            )
            "Каре" -> Pair("Европейская кухня и стильный интерьер.", R.drawable.kare)
            "Brauplatz" -> Pair("Пивной ресторан с немецким настроением и закусками.", R.drawable.brauplatz)
            "Panorama" -> Pair("Панорамный вид на город и вкусные стейки.", R.drawable.panorama)
            "Динополис" -> Pair("Парк с динозаврами — отлично подойдёт для детей.", R.drawable.dinopolis)
            "Парк Горького" -> Pair("Центральный городской парк. Аттракционы и природа.", R.drawable.gorky_park)
            "Тишино" -> Pair("Тихий районный парк с прудом и скамейками.", R.drawable.tishino)
            "Тройка" -> Pair("Крупный ТЦ с одеждой, кинотеатром и кафе.", R.drawable.troyka)
            "Пассаж" -> Pair("Брендовые магазины и гастрономия.", R.drawable.passage)
            "Три кита" -> Pair("Семейный торговый центр с фудкортом.", R.drawable.three_whales)
            else -> Pair("Информация о месте недоступна.", R.drawable.placeholder)
        }
    }
}
