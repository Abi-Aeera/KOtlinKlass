package com.example.practice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FloatingActionButton
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class CardActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CaOdy()
        }
    }
}

data class Info(val title: String, val subtitle1: String, val subtitle2: String?, val color: Color, val date: String?)

@Composable
fun CaOdy() {
    val items = listOf(
        Info("Dribbble", "Paidxxx", "********", colorResource(id = R.color.card_orange), null),
        Info("HJM", "173****8838", null, colorResource(id = R.color.card_blue), null),
        Info("Tom", "Room 601, Building 8, Zhongnan Century City, No.8, Taoyuan Road...", "130****3920", colorResource(id = R.color.card_green), null),
        Info("1882 **** **** 8695", "ICBC", "Debit Card", colorResource(id = R.color.card_purple), "12/19"),
        Info("Young", "This is the story of me and them, very...", null, colorResource(id = R.color.card_brown), null)
    )

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /* Handle FAB click */ },
                containerColor = colorResource(id = R.color.light_green),
                contentColor = Color.White,
                shape = CircleShape
            ) {
                Icon(Icons.Filled.Add, contentDescription = "Add")
            }
        }
    ) {
            paddingValues ->
        Column(modifier = Modifier.padding(paddingValues).background(colorResource(id = R.color.light_green))) {
            Row(
                modifier = Modifier.fillMaxWidth().padding(16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "Card", fontSize = 24.sp, fontWeight = FontWeight.Bold, color = Color.White)
                Image(
                    painter = painterResource(id = R.drawable.img),
                    contentDescription = "Profile",
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape)
                )
            }

            LazyColumn(modifier = Modifier.padding(horizontal = 16.dp)) {
                items(items) { item ->
                    InfoCard(item)
                    Spacer(modifier = Modifier.height(16.dp))
                }
            }
        }
    }
}

@Composable
fun InfoCard(info: Info) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = info.color)
    ) {
        Box(modifier = Modifier.padding(16.dp)) {
            Column {
                Text(text = info.title, color = Color.White, fontWeight = FontWeight.Bold, fontSize = 18.sp)
                Text(text = info.subtitle1, color = Color.White.copy(alpha = 0.7f))
                info.subtitle2?.let {
                    Text(text = it, color = Color.White.copy(alpha = 0.7f))
                }
            }
            info.date?.let {
                Text(
                    text = it,
                    color = Color.White.copy(alpha = 0.7f),
                    modifier = Modifier.align(Alignment.BottomEnd)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Cardpreview() {
    CaOdy()
}