package com.example.mvvmrecipeappclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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
                ColumnLayoutCompose()
            }
        }
    }
}

@Composable
fun ColumnLayoutCompose() {
    Column(
        modifier = Modifier
            .background(color = Color(0xFFF2F2F2))
            .fillMaxSize()
            .padding(0.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Image(
            painter = painterResource(
                id = R.drawable.happy_meal_small
            ),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier.height(300.dp).fillMaxWidth()
        )
        Column(
            modifier = Modifier.padding(16.dp),
        ) {
            Text(
                text = "Happy Meal",
                style = TextStyle(
                    fontSize = 26.sp
                )
            )
            Spacer(modifier = Modifier.padding(top = 10.dp))
            Text(
                text = "800 Calories",
                style = TextStyle(
                    fontSize = 17.sp
                )
            )
            Spacer(modifier = Modifier.padding(top = 10.dp))
            Text(
                text = "$5.99",
                style = TextStyle(
                    color = Color(0xFF85bb65),
                    fontSize = 17.sp
                )
            )
        }
    }

}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MVVMRecipeAppCloneTheme {
        ColumnLayoutCompose()
    }
}