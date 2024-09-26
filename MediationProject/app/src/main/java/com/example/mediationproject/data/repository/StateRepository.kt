package com.example.mediationproject.data.repository

import com.example.mediationproject.R
import com.example.mediationproject.data.model.State

class StateRepository {
    val state_list  = arrayListOf(
        State(
            id_state = 1,
            title = "Как снять тревожность",
            text_state = "Краткое описание",
            link = "https://e.glavbukh.ru/1027713",
            image_state = R.drawable.removebg
        ),
        State(
            id_state = 1,
            title = "полный релакс",
            text_state = "Краткое описание",
            link = "https://www.fashiontime.ru/beauty/overviews/1326613.html",
            image_state = R.drawable.removebg2
        )
    )
}