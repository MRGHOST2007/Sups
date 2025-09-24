package ir.mrghost.sups.model

import androidx.annotation.DrawableRes

data class Hero(
    val name: String,
    val description: String,
    @DrawableRes val picture: Int
)