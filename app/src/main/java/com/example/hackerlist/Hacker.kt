package com.example.hackerlist.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Hacker(
    val name: String,
    val description: String,
    val imageResId: Int
) : Parcelable
