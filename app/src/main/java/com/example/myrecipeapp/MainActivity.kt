package com.example.myrecipeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myrecipeapp.ui.theme.MyRecipeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column() {
                //This is how I add text
                Text(text = "WAZZAM")
                //This is how I add space
                Spacer(modifier = Modifier.padding(top = 20.dp))
                //This is how I add a button
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "click here")
                }
            }
        }
    }

    @Preview
    @Composable
    fun homeAi() {
        Column() {
            //This is how I add text
            Text(text = "WAZZAM")
            //This is how I add space
            Spacer(modifier = Modifier.padding(top = 20.dp))
            //This is how I add a button
            Button(onClick = { /*TODO*/ }) {
                Text(text = "click here")
            }
        }
    }
}

