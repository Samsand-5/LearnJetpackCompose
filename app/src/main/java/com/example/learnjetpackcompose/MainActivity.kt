package com.example.learnjetpackcompose

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learnjetpackcompose.ui.theme.LearnJetpackComposeTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            LearnJetpackComposeTheme() {

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

//              Row(
//                  modifier = Modifier.fillMaxSize(),
//                  horizontalArrangement = Arrangement.Center,
//                  verticalAlignment = Alignment.Top
//              ) {
//                  Text(text = "hello")
//                  Text(text = "welcome")
//              }

/*                Box(
                    Modifier
                        .padding(start = 10.dp, end = 10.dp, top = 10.dp)
                        .fillMaxHeight(0.5f)
                        .fillMaxWidth()
                        .background(color = Color.Red, shape = RectangleShape)) */

             /*   Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center ){
                    
                 /*   Box(
                        modifier = Modifier
                            .size(100.dp)
                            .clip(RoundedCornerShape(10.dp))
                            .border(width = 3.dp, shape = RoundedCornerShape(10.dp), color = Color.Red)
                            .background(Color.Green))  */

                 /*   Box(modifier = Modifier
                        .width(100.dp)
                        .height(100.dp)
                        .clip(RoundedCornerShape(10.dp))
                        .background(Color.Cyan)
                        .clickable {
                                   Log.d("test","Click")
                        },
                    contentAlignment = Alignment.Center){
                        Text(text = "Press Me", color = Color.White)
                    }  */

                    
                } */

 /*               Row(modifier = Modifier.fillMaxWidth()){

                    Box(modifier = Modifier
                        .background(Color.Red)
                        .height(100.dp)
                        .weight(1f))

                    Spacer(modifier = Modifier.width(5.dp))

                    Box(modifier = Modifier
                        .background(Color.Red)
                        .height(100.dp)
                        .weight(1f))

                }  */

               /* Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){

                    var textState by remember{
                        mutableStateOf("")
                    }

                    TextField(value = textState,
                        onValueChange = {
                            textState = it
                    },
                    modifier = Modifier.fillMaxWidth())
                    
                }  */

                // statesLess understanding
               /* Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){

                    var textState by remember{
                        mutableStateOf("")
                    }
                    MyTextField(
                        textState,
                        onValueChanged = {
                            textState = it
                        }
                    )
               } */
            }
            }
        }
    }

//@Composable
//fun greeting(name: String){
//    Text(text = "Welcome to jetpack $name", color = Color.Red, fontSize = 22.sp, fontWeight = FontWeight.Bold)
//}

//Stateless function called from above
@Composable
fun MyTextField(
    textValue: String,
    onValueChanged: (String) -> Unit
) {

    TextField(
        value = textValue,
        onValueChange = {
            onValueChanged(it)
        },
        modifier = Modifier.fillMaxWidth()
    )
}