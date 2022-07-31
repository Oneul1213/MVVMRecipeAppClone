package com.example.mvvmrecipeappclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mvvmrecipeappclone.ui.theme.MVVMRecipeAppCloneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MVVMRecipeAppCloneTheme {
                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colors.background
//                ) {
//                    Greeting("Android")
//                }
                HappyMealLayoutCompose()
//                RowLayoutCompose()
            }
        }
    }
}

@Composable
fun RowLayoutCompose() {
    Column {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .border(border = BorderStroke(width = 1.dp, color = Color.Black)),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "ITEM1",
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Text(
                text = "ITEM2",
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
        }

        Spacer(modifier = Modifier.padding(20.dp))

        Row(
            modifier = Modifier
                .width(200.dp)
                .height(200.dp)
                .border(border = BorderStroke(width = 1.dp, color = Color.Black)),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "ITEM2",
                modifier = Modifier.align(Alignment.CenterVertically)
            )
        }
    }
}
@Composable
fun HappyMealLayoutCompose() {
    Column(
        modifier = Modifier
            .background(color = Color(0xFFF2F2F2))
            .fillMaxSize()
//            .padding(0.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Image(
            painter = painterResource(
                id = R.drawable.happy_meal_small
            ),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .height(300.dp)
                .fillMaxWidth()
        )
        Column(
            modifier = Modifier.padding(16.dp),
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Happy Meal",
                    style = TextStyle(
                        fontSize = 26.sp
                    )
                )
                Text(
                    text = "$5.99",
                    style = TextStyle(
                        color = Color(0xFF85bb65),
                        fontSize = 17.sp
                    ),
                    modifier = Modifier.align(Alignment.CenterVertically)
                )
            }
            Spacer(modifier = Modifier.padding(top = 10.dp))
            Text(
                text = "800 Calories",
                style = TextStyle(
                    fontSize = 17.sp
                )
            )
            Spacer(modifier = Modifier.padding(top = 10.dp))
            Button(
                onClick = {},
                modifier = Modifier.align(Alignment.CenterHorizontally)
            ) {
                Text(text = "ORDER NOW")
            }
        }
    }

}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MVVMRecipeAppCloneTheme {
        HappyMealLayoutCompose()
//        RowLayoutCompose()
    }
}