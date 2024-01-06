package com.example.learnjetpackcompose.ui.theme

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


data class Publisher (
    val name: String,

        )
@Composable
fun MyCustomCard(
    modifier: Modifier=Modifier,
    @DrawableRes image: Int,
    title: String,
    text: String,
) {
    
}