package com.example.practice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class ProfileActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProfilePage()
        }
    }
}

@Composable
fun ProfilePage() {
    Scaffold {
        padding ->
        Column(
            modifier = Modifier.fillMaxSize().padding(paddingValues = padding).background(color = Color.White).fillMaxWidth()
        ) {
            Row(
                modifier = Modifier.fillMaxWidth().padding(16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Icon(
                    painter = painterResource(R.drawable.baseline_arrow_back_ios_24),
                    contentDescription = null
                )

                Icon(
                    painter = painterResource(R.drawable.baseline_more_vert_24),
                    contentDescription = null
                )
            }

            Column(modifier = Modifier.padding(horizontal = 16.dp)) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Image(
                        painter = painterResource(R.drawable.img),
                        contentDescription = null,
                        modifier = Modifier.size(100.dp).clip(CircleShape)
                    )
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "0", style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 18.sp))
                        Text(text = "Posts")
                    }
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "26", style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 18.sp))
                        Text(text = "Followers")
                    }
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "27", style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 18.sp))
                        Text(text = "Following")
                    }
                }

                Text(
                    text = "Abi_is_Lost",
                    style = TextStyle(fontWeight = FontWeight.Bold),
                    modifier = Modifier.padding(top = 9.dp)
                )
                Button(
                    onClick = { /* Do nothing for now */ },
                    modifier = Modifier.padding(top = 8.dp).width(width = 135.dp).height(height = 35.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = colorResource(id = R.color.grey)
                    )
                ) {
                    Text("@ abi_is_lost", color = colorResource(id = R.color.white))
                }
                Text(
                    text = "mi amore....",
                    style = TextStyle(fontWeight = FontWeight.Normal), modifier = Modifier.padding(top = 0.dp)

                )

            }
        }
    }
}

@Preview
@Composable
fun GreetingPreview2() {
    ProfilePage()
}