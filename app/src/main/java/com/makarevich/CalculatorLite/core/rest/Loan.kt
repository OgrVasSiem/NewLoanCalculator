package com.makarevich.CalculatorLite.core.rest

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Loan(
    val name: String,
    val icon: String,
    val currency: String,
    val rating: Float,
    val rateFrom: Float,
    val sumTo: Int,
    val termTo: Int,
    val termFrom: Int,
    val url: String,
) : Parcelable