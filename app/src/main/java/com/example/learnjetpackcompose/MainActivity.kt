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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.*
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.example.learnjetpackcompose.ui.theme.LearnJetpackComposeTheme

class MainActivity : ComponentActivity() {

   /* val viewModel by lazy {
        ViewModelProvider(this).get(MyViewModel::class.java)
    } */
    @OptIn(ExperimentalTextApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{

           // val state = viewModel.state.value
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
                //Simple app to store name in list and show it

               /* Column(modifier = Modifier.fillMaxSize()){

                    LazyColumn(modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)) {
                        items(state.namesList.size){
                            Text(text = state.namesList[it])
                        }
                    }
                    
                    MyTextField(
                        textValue = state.text,
                        onValueChanged = {
                            viewModel.updateText(it)
                        },
                        onAddClick = {
                            viewModel.updateNamesList()
                            viewModel.updateText("")
                        }
                    )
               } */

                Box(modifier = Modifier.fillMaxSize().background(Color.Black), contentAlignment = Alignment.Center){
                    
                   /* Text(text = stringResource(id = R.string.learn_jetpack_compose).plus("").repeat(20),
                    maxLines = 3,
                    overflow = TextOverflow.Ellipsis) */
                    
                   /* Text(
                        text = "Learn Jetpack Compose",
                        color = Color.Magenta,
                        fontSize = 32.sp,
                        textDecoration = TextDecoration.Underline,
                        textAlign = TextAlign.Start,
                        modifier = Modifier.fillMaxWidth()
                    ) */

                    val annotatedString = buildAnnotatedString {
                        blueGradientText("Learn")
                        append("\n\n")
                        pinkGradientText("Jetpack")
                        append("\n\n")
                        blueGradientText("Compose")

                    }
                    
                    Text(text = annotatedString)
                    
                } 
                
                
            }
            }
        }

    @OptIn(ExperimentalTextApi::class)
    private fun AnnotatedString.Builder.blueGradientText(text: String) {
        withStyle(
            style = SpanStyle(
                brush = Brush.linearGradient(
                    colors = listOf(
                        Color(0xFF2788C7),
                        Color(0xFF00BB04)
                    )
                ),
                fontSize = 42.sp,
                fontWeight = FontWeight.Medium
            )
        ) {
            append(text)
        }
    }

    @OptIn(ExperimentalTextApi::class)
    private fun AnnotatedString.Builder.pinkGradientText(text: String) {
        withStyle(
            style = SpanStyle(
                brush = Brush.linearGradient(
                    colors = listOf(
                        Color(0xFFFF3BB5),
                        Color(0xFF00BB04)
                    )
                ),
                fontSize = 48.sp,
                fontWeight = FontWeight.Medium
            )
        ) {
            append(text)
        }
    }
}

//@Composable
//fun greeting(name: String){
//    Text(text = "Welcome to jetpack $name", color = Color.Red, fontSize = 22.sp, fontWeight = FontWeight.Bold)
//}

//Stateless function called from above

/*
@Composable
fun MyTextField(
    textValue: String,
    onValueChanged: (String) -> Unit,
    onAddClick: () -> Unit
) {

    TextField(
        value = textValue,
        onValueChange = {
            onValueChanged(it)
        },
        modifier = Modifier.fillMaxWidth(),
        trailingIcon = {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = null,
                modifier = Modifier.clickable { onAddClick() })
        }
    )
} */