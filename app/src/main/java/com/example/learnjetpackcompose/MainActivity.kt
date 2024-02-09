@file:OptIn(ExperimentalMaterialApi::class, ExperimentalMaterial3Api::class)

package com.example.learnjetpackcompose

import android.annotation.SuppressLint
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.*
import androidx.compose.animation.core.*
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
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
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import androidx.compose.material3.Button
import com.example.learnjetpackcompose.ui.theme.LearnJetpackComposeTheme
import androidx.compose.material3.ButtonDefaults
import com.example.learnjetpackcompose.ui.theme.MyCustomCard
import com.example.learnjetpackcompose.ui.theme.Publisher
import androidx.compose.runtime.getValue
import androidx.compose.material3.DismissDirection
import androidx.compose.material3.DismissValue
import androidx.compose.material3.ExperimentalMaterial3Api
import kotlinx.coroutines.delay
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.material3.OutlinedTextField
import androidx.compose.ui.draw.scale
import com.example.learnjetpackcompose.ui.theme.ComposablePreviewTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import kotlin.random.Random

class MainActivity : ComponentActivity() {

    /* val viewModel by lazy {
        ViewModelProvider(this).get(MyViewModel::class.java)
    } */
    @OptIn(ExperimentalTextApi::class, ExperimentalAnimationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnJetpackComposeTheme() {

                // val state = viewModel.state.value
                //   LearnJetpackComposeTheme() {

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

                /* Box(modifier = Modifier.fillMaxSize().background(Color.Black), contentAlignment = Alignment.Center){
                    
                    Text(text = stringResource(id = R.string.learn_jetpack_compose).plus("").repeat(20),
                    maxLines = 3,
                    overflow = TextOverflow.Ellipsis)
                    
                    Text(
                        text = "Learn Jetpack Compose",
                        color = Color.Magenta,
                        fontSize = 32.sp,
                        textDecoration = TextDecoration.Underline,
                        textAlign = TextAlign.Start,
                        modifier = Modifier.fillMaxWidth()
                    )
                    }   */

                /*  Box(modifier = Modifier.fillMaxSize().background(Color.Black), contentAlignment = Alignment.Center){
                    val annotatedString = buildAnnotatedString {
                        blueGradientText("Learn")
                        append("\n\n")
                        pinkGradientText("Jetpack")
                        append("\n\n")
                        blueGradientText("Compose")
                    }
                    Text(text = annotatedString)
                } */

                /*
                //making post card
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Black.copy(0.8f)),
                    contentAlignment = Alignment.Center
                ) {
                    MyCustomCard(
                        modifier = Modifier.fillMaxSize(fraction = 0.8f),
                        image = R.drawable.couple,
                        title = "Travelling Together",
                        text = "Always ready to explore and enjoy the beauty of mountains to breadth fresh air and detox toxicity" +
                                "You don't climb mountains without a team, you don't climb mountains without being fit, you don't climb mountains without being prepared and you don't climb mountains without balancing the risks and rewards. And you never climb a mountain on accident—it has to be intentional"
                        ,
                        publisher = Publisher(
                            name = "Soumyodip Sutradhar",
                            job = "UI & UX Designer",
                            image = R.drawable.soumyodipsutradhar
                        )
                    )
                } */

                /*  Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {

                    Button(
                        modifier = Modifier
                            .height(50.dp)
                            .width(140.dp),
                        shape = RoundedCornerShape(topStart = 10.dp, topEnd = 10.dp),
                        enabled = true,
                        elevation = ButtonDefaults.buttonElevation(
                            defaultElevation = 30.dp
                        ),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFF2D4356),
                            contentColor = Color.Green,
                            disabledContainerColor = Color.LightGray,
                            disabledContentColor = Color.White
                        ),
                        onClick = {  }
                    ) {
                        Icon(painter = painterResource(id = R.drawable.ic_android_icon), contentDescription = null )
                        Text(text = "Click")
                    }
                } */


                /*
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {

                    var text by remember {
                        mutableStateOf("")
                    }

                    var isPasswordVisible by remember {
                        mutableStateOf(false)
                    }

                    var focusRequester = remember {
                        FocusRequester()
                    }

                    androidx.compose.material3.OutlinedTextField(
                        value = text,
                        onValueChange = {text = it },
                        leadingIcon = {
                            Icon(painter = painterResource(id = R.drawable.ic_android_icon), contentDescription = null )
                        },
                        trailingIcon = {
                            TextButton(onClick = { isPasswordVisible = !isPasswordVisible }) {
                                Text(text = if(isPasswordVisible) "Hide" else "Show")
                            }
                        },
                        colors = TextFieldDefaults.textFieldColors(
                          /*  cursorColor = Color.Red,
                            backgroundColor = Color.Transparent */
                        ),
                        singleLine = true,
                        placeholder = {
                            Text(text = "password")
                        },
                        visualTransformation = if(isPasswordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                        keyboardOptions = KeyboardOptions(
                            autoCorrect = false,
                            keyboardType = KeyboardType.NumberPassword,
                            imeAction = ImeAction.Go
                        ),
                        keyboardActions = KeyboardActions(
                            onGo = {
                                Log.e("test", "OnGo Click")
                            }
                        ),
                        modifier = Modifier.focusRequester(focusRequester)
                    )
                   Button(onClick = { focusRequester.requestFocus() }) {
                        Text(text = "Request Focus")
                    }
                } */
                //   }

                /*
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = MaterialTheme.colorScheme.background),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    TestMe()
                } */

                // learning animations using jetpack compose

                /* Column(modifier = Modifier.fillMaxSize()) {
                    var isContentVisible by remember {
                        mutableStateOf(false)
                    }
                    Button(onClick = {
                        isContentVisible = !isContentVisible
                    }) {
                        Text(text = "show/hide")
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    AnimatedVisibility(
                        visible = isContentVisible,
                        enter = fadeIn() + slideInVertically(),
                        exit = fadeOut() + slideOutVertically()
                    ){
                        Box(modifier = Modifier
                            .size(200.dp)
                            .background(Color.Red)) {

                        }
                    }
               }  */

                //Animated size changes
                /*
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {

                    var isAllTextVisible by remember {
                        mutableStateOf(false)
                    }
                    Text(
                        text = "AAAAAAAAAAAAAAAAAAA EEEEEEEEEEEEEEEEEEEEEEEEE IIIIIIIIIIIIIIIIIIIIIII OOOOOOOOOOOOOOOOOOOOOO UUUUUUUUUUUUUU"
                            .repeat(2),
                        modifier = Modifier
                            .padding(5.dp)
                            .background(Color.LightGray)
                            .clickable {
                               isAllTextVisible = !isAllTextVisible
                            }.animateContentSize(

                               /* animationSpec = tween(
                                    durationMillis = 200,
                                    easing = LinearEasing
                                ) */

                                /*
                                  animationSpec = spring(
                                      dampingRatio = Spring.DampingRatioLowBouncy, stiffness = Spring.StiffnessMediumLow
                                  )
                                  */
                            ),
                        maxLines = if(isAllTextVisible) Int.MAX_VALUE else 2
                    )
                } */

                //AnimatedContent
                /*
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    var count by remember {
                        mutableStateOf(0)
                    }
                    Button(onClick = { count++ }) {
                        Text(text = "Add")
                    }
                    AnimatedContent(targetState = count, transitionSpec = {
                        fadeIn() with fadeOut()
                    }) {
                        Text(text = "Count $it")
                    }
                } */

                //Animate*AsState

                /*
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){

                    var scale by remember { mutableStateOf(1f) }
                    var color by remember { mutableStateOf(Color.Red) }
                    val animateScale by animateFloatAsState(targetValue = scale)
                    val animateColor by animateColorAsState(targetValue = color)

                    Box(modifier = Modifier
                        .size(100.dp)
                        .scale(animateScale)
                        .clip(CircleShape)
                        .background(animateColor)
                        .clickable {
                            scale += 0.1f
                            color = Color(
                                red = Random.nextInt(255),
                                blue = Random.nextInt(255),
                                green = Random.nextInt(255)
                            )
                        }
                    )
                }  */

                //learning animaTable
                /*
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){

                    val scale = remember { Animatable(1f) }
                    val alpha = remember { Animatable(1f) }
                    var color by remember { mutableStateOf(Color.Red) }
                    val animateColor by animateColorAsState(targetValue = color)
                    var scope = rememberCoroutineScope()
                    Box(modifier = Modifier
                        .size(100.dp)
                        .scale(scale.value)
                        .clip(CircleShape)
                        .background(animateColor.copy(alpha = alpha.value))
                        .clickable {

                            scope.launch {
                                launch {
                                    scale.animateTo(scale.value + 0.1f)
                                }
                                launch {
                                    alpha.animateTo(alpha.value + 0.1f)
                                }
                            }
                            color = Color(
                                red = Random.nextInt(255),
                                blue = Random.nextInt(255),
                                green = Random.nextInt(255)
                            )
                        }
                    )
                } */

                //Infinite Transitions

                /*
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){

                    val infiniteTransition = rememberInfiniteTransition()
                    val color = infiniteTransition.animateColor(
                        initialValue = Color.Red,
                        targetValue = Color.Green,
                        animationSpec = infiniteRepeatable(animation = tween(), repeatMode = RepeatMode.Reverse)
                    )
                    Box(modifier = Modifier
                        .size(100.dp)
                        .clip(CircleShape)
                        .background(color.value)
                    )
                }   */

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val programmingLanguages = remember {
                        mutableStateListOf(
                            "Kotlin",
                            "Java",
                            "C++",
                            "C#",
                            "JavaScript",
                        )
                    }

                    LazyColumn(
                        modifier = Modifier
                            .fillMaxSize()
                    ) {
                        items(
                            items = programmingLanguages,
                            key = { it }
                        ) { language ->
                            SwipeToDeleteContainer(
                                item = language,
                                onDelete = {
                                    programmingLanguages -= language
                                }
                            ) { language ->
                                Text(
                                    text = language,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .background(MaterialTheme.colorScheme.background)
                                        .padding(16.dp)
                                )
                            }
                        }
                    }
                }
            }
        }
    }

    @Composable
    fun <T> SwipeToDeleteContainer(
        item: T,
        onDelete: (T) -> Unit,
        animationDuration: Int = 500,
        content: @Composable (T) -> Unit
    ) {
        var isRemoved by remember {
            mutableStateOf(false)
        }
        val state = rememberDismissState(
            confirmValueChange = { value ->
                if (value == DismissValue.DismissedToStart) {
                    isRemoved = true
                    true
                } else {
                    false
                }
            }
        )

        LaunchedEffect(key1 = isRemoved) {
            if (isRemoved) {
                delay(animationDuration.toLong())
                onDelete(item)
            }
        }

        AnimatedVisibility(
            visible = !isRemoved,
            exit = shrinkVertically(
                animationSpec = tween(durationMillis = animationDuration),
                shrinkTowards = Alignment.Top
            ) + fadeOut()
        ) {
            SwipeToDismiss(
                state = state,
                background = {
                    DeleteBackground(swipeDismissState = state)
                },
                dismissContent = { content(item) },
                directions = setOf(androidx.compose.material.DismissDirection.EndToStart)
            )
        }
    }

    @Composable
    fun DeleteBackground(
        swipeDismissState: DismissState
    ) {
        val color =
            if (swipeDismissState.dismissDirection == androidx.compose.material.DismissDirection.EndToStart) {
                Color.Red
            } else {
                Color.Transparent
            }

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color)
                .padding(16.dp),
            contentAlignment = Alignment.CenterEnd
        ) {
            Icon(
                imageVector = Icons.Default.Delete,
                contentDescription = null,
                tint = Color.White
            )
        }
    }
}

  /*  @OptIn(ExperimentalTextApi::class)
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
    } */

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

/*
@Composable
fun TestMe(){
    val color = if (isSystemInDarkTheme()) Color.Black else Color.LightGray
    Box(
        modifier = Modifier
            .size(300.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(color = color),
        contentAlignment = Alignment.Center
    ){
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Test me",color = Color.White)
        }
    }
}

@Preview(name = "Light", showBackground = true, widthDp = 200, heightDp = 100)
@Preview(name = "Light", showBackground = true)
@Preview(name = "Night", uiMode = UI_MODE_NIGHT_YES, showBackground = true)
@Preview(name = "Night", uiMode = UI_MODE_NIGHT_YES, showBackground = true, widthDp = 200, heightDp = 100)
@Composable
fun TestMePreview(){
    TestMe()
}
*/