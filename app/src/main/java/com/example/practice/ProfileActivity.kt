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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
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
            ProfileBody()
        }
    }
}

@Composable
fun ProfileBody() {
    Scaffold {
        padding ->
        Column(
            modifier = Modifier.fillMaxSize()
                .background(color = Color.White)
                .padding(padding)
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth().padding(horizontal = 8.dp)
            ) {
                Icon(
                    painter = painterResource(R.drawable.baseline_arrow_back_ios_24),
                    contentDescription = null
                )
                Text("Instagram", style = TextStyle(fontWeight = FontWeight.ExtraBold), fontSize = 20.sp)
                Icon(
                    painter = painterResource(R.drawable.baseline_more_vert_24),
                    contentDescription = null
                )
            }
            Row(
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth().padding(16.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.img),
                    contentDescription = null,
                    modifier = Modifier.height(100.dp).width(100.dp).clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text("1K", style = TextStyle(fontWeight = FontWeight.ExtraBold))
                    Text("Posts", style = TextStyle(fontWeight = FontWeight.ExtraBold))
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text("3M", style = TextStyle(fontWeight = FontWeight.ExtraBold))
                    Text("Followers", style = TextStyle(fontWeight = FontWeight.ExtraBold))
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text("275", style = TextStyle(fontWeight = FontWeight.ExtraBold))
                    Text("Following", style = TextStyle(fontWeight = FontWeight.ExtraBold))
                }
            }
            Column(
                modifier = Modifier.padding(top = 15.dp, start = 20.dp)
            ) {
                Text(
                    "Username", style = TextStyle(fontWeight = FontWeight.ExtraBold, fontSize = 15.sp),
                )
                Text("Love and Peace things I never got.\nError 404 : Bio not found\nNot a secret, just not your business.\nShe lives the poetry she cannot write ", style = TextStyle(fontWeight = FontWeight.SemiBold))

            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp, start = 16.dp, end = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Button(
                    onClick = { },
                    shape = RoundedCornerShape(5.dp),
                    modifier = Modifier.weight(1f)
                ) {
                    Text("Follow")
                }
                Button(
                    onClick = { },
                    shape = RoundedCornerShape(5.dp),
                    modifier = Modifier.weight(1f)
                ) {
                    Text("Message")
                }
                Button(
                    onClick = { },
                    shape = RoundedCornerShape(5.dp),
                    modifier = Modifier.weight(0.5f)
                ) {
                    Icon(
                        painter = painterResource(R.drawable.ic_launcher_foreground),
                        contentDescription = null
                    )
                }
            }
            Row(
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth().padding(top = 15.dp)
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally)
                {
                    Image(
                        painter = painterResource(R.drawable.img),
                        contentDescription = null,
                        modifier = Modifier.height(65.dp).width(65.dp).clip(CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    Text("Cat1", style = TextStyle(fontWeight = FontWeight.ExtraBold))

                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(
                        painter = painterResource(R.drawable.img),
                        contentDescription = null,
                        modifier = Modifier.height(65.dp).width(65.dp).clip(CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    Text("Cat2", style = TextStyle(fontWeight = FontWeight.ExtraBold))

                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(
                        painter = painterResource(R.drawable.img),
                        contentDescription = null,
                        modifier = Modifier.height(65.dp).width(65.dp).clip(CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    Text("Cat3", style = TextStyle(fontWeight = FontWeight.ExtraBold))

                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(
                        painter = painterResource(R.drawable.img),
                        contentDescription = null,
                        modifier = Modifier.height(65.dp).width(65.dp).clip(CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    Text("Cat4", style = TextStyle(fontWeight = FontWeight.ExtraBold))

                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(
                        painter = painterResource(R.drawable.img),
                        contentDescription = null,
                        modifier = Modifier.height(65.dp).width(65.dp).clip(CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    Text("Cat5", style = TextStyle(fontWeight = FontWeight.ExtraBold))

                }
            }
            Row {
                Column {
                    Card(
                        modifier = Modifier
                            .height(height = 200.dp)
                            .width(width = 300.dp),
                        shape = RoundedCornerShape(5.dp),
                        colors = CardDefaults.cardColors(containerColor = Color.White),
                        elevation = CardDefaults.cardElevation(10.dp)
                    ) {
                        Text(text = "Card Content")
                    }
                }

            }

        }

    }

}

@Preview
@Composable
fun ProfileBodyPreview() {
    ProfileBody()


}