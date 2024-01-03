package com.example.learnjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
//                Text(text = "label")
//            })
//            FloatingActionButton(onClick = { println("click") }) {
//                Icon(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = null )
//              ExtendedFloatingActionButton(text = {
//                  Text(text = "welcome")
//              },
//                  onClick = { /*TODO*/ },
//                  icon = { //                     Icon(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = null )
//                  },
//                  backgroundColor = Color.Red
//            )
//            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
//                Text(text = "hello", modifier = Modifier.align(Alignment.TopCenter))
//                Text(text = "welcome",modifier = Modifier.align(Alignment.TopEnd))
//            }
//             Column(
//                 modifier = Modifier.fillMaxSize(),
//               verticalArrangement = Arrangement.Top,
//               horizontalAlignment = Alignment.CenterHorizontally,
//             ){
//               Text(text = "hello")
//               Text(text = "welcome")
//            }
              Row(
                  modifier = Modifier.fillMaxSize(),
                  horizontalArrangement = Arrangement.Center,
                  verticalAlignment = Alignment.Top
              ) {
                  Text(text = "hello")
                  Text(text = "welcome")
              }
            }
        }
    }

@Composable
fun greeting(name: String){
    Text(text = "Welcome to jetpack $name", color = Color.Red, fontSize = 22.sp, fontWeight = FontWeight.Bold)
}
