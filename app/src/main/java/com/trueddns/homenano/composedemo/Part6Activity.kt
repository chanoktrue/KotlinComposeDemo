package com.trueddns.homenano.composedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlin.random.Random

// State

class Part6Activity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Home()
        }
    }
}

@Preview
@Composable
private fun Home() {

    var color = remember {
        mutableStateOf(Color.Yellow)
    }

      Column(
          modifier = Modifier
              .fillMaxSize()
      ) {

          ColorBox(Modifier.fillMaxSize().weight(1f), updateColor = {
              color.value = it
          })

          Box(
              modifier = Modifier
                  .background(color.value)
                  .weight(1f)
                  .fillMaxSize()
          )

      }

}

@Composable
private fun ColorBox(modifier: Modifier, updateColor: (Color) -> Unit) {
    Box(
        modifier
            .background(Color.Green)
            .fillMaxSize()
            .clickable {
                updateColor(
                    Color(
                        Random.nextFloat(),
                        Random.nextFloat(),
                        Random.nextFloat(),
                        alpha = 1f
                    )
                )
            }
    )
}