package com.example.task_beginner_dicoding.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Hacker(
    val name: String,
    val description: String,
    val mainImage: Int,
    val achievements: String,
    val biography: String,
    val additionalImages: List<Int>
) : Parcelable
