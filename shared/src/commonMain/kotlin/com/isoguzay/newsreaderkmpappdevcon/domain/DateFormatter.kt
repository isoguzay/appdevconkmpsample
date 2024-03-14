package com.isoguzay.newsreaderkmpappdevcon.domain

internal expect object DateFormatter {
    fun getStringTime(timeInSeconds: Long): String
}