package com.example.mediationproject.data.repository

import com.example.mediationproject.R
import com.example.mediationproject.data.model.Feel

class FeelRepository {
    val list = arrayListOf(
        Feel(1, R.drawable.calmmood, name_feel = "Спокойным"),
        Feel(1, R.drawable.relaxmood, name_feel = "Расслабленным"),
        Feel(1, R.drawable.focusmood, name_feel = "Сщсредоточеным"),
        Feel(1, R.drawable.anxious, name_feel = "Взловнованым")
    )
}