package com.isoguzay.newsreaderkmpappdevcon

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform