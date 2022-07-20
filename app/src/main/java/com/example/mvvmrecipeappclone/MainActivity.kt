package com.example.mvvmrecipeappclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
            .fillMaxWidth()
            .padding(0.dp)
    ) {
        Image(
            painter = painterResource(
                id = R.drawable.happy_meal_small
            ),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier.height(300.dp)
        )
        Column(
            modifier = Modifier.padding(16.dp),
        ) {
            Text(text = "Happy Meal")
            Spacer(modifier = Modifier.padding(top = 10.dp))
            Text(text = "800 Calories")
            Spacer(modifier = Modifier.padding(top = 10.dp))
            Text(text = "$5.99")
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