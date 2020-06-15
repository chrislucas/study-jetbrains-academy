package com.chattybot

import java.text.SimpleDateFormat
import java.util.*


const val CHATTY_NAME = "k0tic"

fun main(args: Array<String>) {
    val calendar = Calendar.getInstance()
    val formatDate = SimpleDateFormat("YYYY").format(calendar.time)

    println(String.format("Hello! My name is: %s\nI wes created in %s"
        , CHATTY_NAME, formatDate))
}