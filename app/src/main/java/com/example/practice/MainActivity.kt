package com.example.practice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practice.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainBody()
        }
    }
}

@Composable
fun MainBody() {
    Column(
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Alignment.CenterVertically as Arrangement.Vertical,
        modifier = Modifier.height(100.dp).width(width = 100.dp)
            .fillMaxSize().background(color = colorResource(R.color.pixelred))

    ) {
        val shadow = Shadow(
            color = colorResource(R.color.charcoal_black),
            offset = Offset(5f, 5f),
            blurRadius = 5f
        )
        Text(
            text = "Pixelated",
            style = TextStyle(
                fontSize = 20.sp,
                color = colorResource(R.color.ashy_gray),
                shadow = shadow
            )
        )
        Text(
            text = "Kissess",
            style = TextStyle(
                fontSize = 20.sp,
                fontStyle = FontStyle.Normal,
                color = colorResource(R.color.ashy_gray),
                shadow = shadow
            )
        )
        Image(painter = painterResource(id=R.drawable.img), contentDescription = null, modifier = Modifier.size(300.dp))
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MainBody()
}