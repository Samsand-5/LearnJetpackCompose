package com.example.learnjetpackcompose.ui.theme

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


data class Publisher (
    val name: String,
    @DrawableRes val image: Int,
    val job: String
    )


@Composable
fun MyCustomCard(
    modifier: Modifier=Modifier,
    @DrawableRes image: Int,
    title: String,
    text: String,
    publisher: Publisher
) {

    Card(
        modifier = modifier,
        shape = MaterialTheme.shapes.medium,
        backgroundColor = mutedBlack
    ) {
        Column {
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                painter = painterResource(id = image),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
            
            Column(modifier = Modifier.padding(vertical = 20.dp, horizontal = 15.dp)) {

                Text(
                    text = title,
                    color = Color.White,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Medium
                )
                
                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = text,
                    color = Color.White.copy(alpha = 0.7f),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium
                )

                Spacer(modifier = Modifier.height(30.dp))
                
                Row {
                   Image(
                       modifier = Modifier
                           .size(42.dp)
                           .clip(CircleShape),
                       painter = painterResource(id = publisher.image),
                       contentDescription = null
                   )
                    
                    Spacer(modifier = Modifier.width(10.dp))

                    val annotatedString = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = Color.White,
                                fontSize = 18.sp
                            )
                        ) {
                            append(publisher.name)
                        }

                        append("\n")

                        withStyle(
                            style = SpanStyle(
                                color = Color.White.copy(alpha = 0.7f),
                                fontSize = 16.sp
                            )
                        ) {
                            append(publisher.job)
                        }
                    }
                    Text(text = annotatedString)
                }
            }
        }
    }

}