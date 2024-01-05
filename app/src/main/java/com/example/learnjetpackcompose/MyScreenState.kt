package com.example.learnjetpackcompose

data class MyScreenState(
    val text: String,
    val namesList: List<String> = emptyList()
)
