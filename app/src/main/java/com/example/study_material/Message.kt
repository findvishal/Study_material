package com.example.study_material

import androidx.annotation.DrawableRes

data class Message(
    val name:String,
    @DrawableRes val ProfileImage: Int,
    @DrawableRes val sign: Int
)


