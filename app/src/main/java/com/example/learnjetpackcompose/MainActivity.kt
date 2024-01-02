package com.example.learnjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.learnjetpackcompose.ui.theme.LearnJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
//            greeting(name = "World")
//            Button(onClick = { println("click") }, content = {
//              Text(text = "button")
//            })
//            Icon(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = null, tint = Color.Black )
//            Image(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = null)
//            TextField(value = "", onValueChange ={}, label = {
//                Text(text = "lable")
//            })
            FloatingActionButton(onClick = { println("click") }) {
                Icon(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = null )
            }
        }
    }
}

@Composable
fun greeting(name: String){
    Text(text = "Welcome to jetpack $name", color = Color.Red, fontSize = 22.sp, fontWeight = FontWeight.Bold)
}
