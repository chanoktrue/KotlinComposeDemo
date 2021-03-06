package com.trueddns.homenano.composedemo

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class Part3Activity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { 
            Column(
                modifier = Modifier
                    .background(Color.Green)
                    .fillMaxHeight(0.5f)
                    .fillMaxWidth()

                    .border(5.dp, Color.Magenta)
                    .padding(5.dp)

                    .border(5.dp, Color.Blue)
                    .padding(5.dp)

                    .border(10.dp, Color.Red)
                    .padding(10.dp)


            ) {
                Text(text = "Hello", modifier = Modifier
                    .clickable {
                        Log.e("text","test...")
                    }
                )
                Spacer(modifier = Modifier.height(50.dp))
                Text(text = "World")
            }
        }
    }
}