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
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class Spotify1 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SpotifyBody()

        }
    }
}

@Composable
fun SpotifyBody() {
    Scaffold { padding->
        Column (
            modifier = Modifier.fillMaxSize().background(color = Color.Black).padding(padding)
        ){
            Row(
                horizontalArrangement =Arrangement.SpaceBetween ,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth().padding(top = 60.dp)
            ) {
                Text("Recently played", style = TextStyle(fontWeight = FontWeight.ExtraBold), fontSize = 20.sp,
                    color=Color.White)
                Icon(
                    painter = painterResource(R.drawable.img),

                    contentDescription = null


                )
                Icon(
                    painter = painterResource(R.drawable.img),
                    contentDescription = null

                )
                Icon(
                    painter = painterResource(R.drawable.img),
                    contentDescription = null

                )

            }
            Row(
                horizontalArrangement =Arrangement.SpaceAround ,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth().padding(top = 15.dp)
            ){
                Column (horizontalAlignment = Alignment.CenterHorizontally)

                {
                    Image(
                        painter = painterResource(R.drawable.img),
                        contentDescription = null,
                        modifier = Modifier.height(110.dp).width(110.dp).clip(CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    Text("Dana Dal Rey",style = TextStyle(fontWeight = FontWeight.ExtraBold, color = Color.White))

                }
                Column (horizontalAlignment = Alignment.CenterHorizontally)

                {
                    Image(
                        painter = painterResource(R.drawable.img),
                        contentDescription = null,
                        modifier = Modifier.height(110.dp).width(110.dp).clip(CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    Text("Black Guy",style = TextStyle(fontWeight = FontWeight.ExtraBold, color = Color.White))

                }
            }
            Row(
//                horizontalArrangement =Arrangement.SpaceAround ,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth().padding(top = 20.dp, start =15.dp)
            ){
                Column{
                    Image(
                        painter = painterResource(R.drawable.img),
                        contentDescription = null,
                        modifier = Modifier.height(80.dp).width(80.dp).clip(RectangleShape),
                        contentScale = ContentScale.Crop
                    )
                }

                Column (horizontalAlignment = Alignment.Start){
                    Text("#SPOTIFYWRAPPED",style = TextStyle(fontWeight = FontWeight.Normal, color = Color.White))
                    Text("Your 2021 in Review",style = TextStyle(fontWeight = FontWeight.ExtraBold, color = Color.White, fontSize = 25.sp))

                }



            }
            Row(
                horizontalArrangement =Arrangement.SpaceEvenly ,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth().padding(top = 20.dp).padding(bottom = 20.dp)
            ){
                Column (horizontalAlignment = Alignment.Start)

                {
                    Image(
                        painter = painterResource(R.drawable.img),
                        contentDescription = null,
                        modifier = Modifier.height(150.dp).width(150.dp).clip(RectangleShape),
                        contentScale = ContentScale.Crop
                    )
                    Text("Your Top Songs 2021",style = TextStyle(fontWeight = FontWeight.ExtraBold, color = Color.White))

                }
                Column (horizontalAlignment = Alignment.Start)

                {
                    Image(
                        painter = painterResource(R.drawable.img),
                        contentDescription = null,
                        modifier = Modifier.height(150.dp).width(150.dp).clip(RectangleShape),
                        contentScale = ContentScale.Crop
                    )
                    Text("Your Artists Revealed",style = TextStyle(fontWeight = FontWeight.ExtraBold, color = Color.White))

                }
            }
            Text("Editor's picks",style = TextStyle(fontWeight = FontWeight.ExtraBold, color = Color.White, fontSize = 25.sp))
            Row(
                horizontalArrangement =Arrangement.SpaceEvenly ,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth().padding(top = 15.dp)
            ){
                Column (horizontalAlignment = Alignment.Start)

                {
                    Image(
                        painter = painterResource(R.drawable.img),
                        contentDescription = null,
                        modifier = Modifier.height(150.dp).width(150.dp).clip(RectangleShape),
                        contentScale = ContentScale.Crop
                    )
                    Text("Ed Sheeran,Big Sean.",style = TextStyle(fontWeight = FontWeight.Normal, color = Color.White,fontSize = 15.sp))
                    Text("Juice WRLD, Post Malone",style = TextStyle(fontWeight = FontWeight.Normal, color = Color.White,fontSize = 15.sp))

                }
                Column (horizontalAlignment = Alignment.Start)

                {
                    Image(
                        painter = painterResource(R.drawable.img),
                        contentDescription = null,
                        modifier = Modifier.height(150.dp).width(150.dp).clip(RectangleShape),
                        contentScale = ContentScale.Crop
                    )
                    Text("Mitski, Tame Impala",style = TextStyle(fontWeight = FontWeight.Normal, color = Color.White, fontSize = 15.sp))
                    Text("Glass Animals, Charli XCX",style = TextStyle(fontWeight = FontWeight.Normal, color = Color.White,fontSize = 15.sp))

                }
            }



        }

    }

}

@Preview
@Composable
fun SpotifyPreview() {
    SpotifyBody()

}