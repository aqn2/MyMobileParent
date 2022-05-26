package com.example.learningnavigation.ui

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Instructions(
    val name : String,
    val instructions: String
) : Parcelable