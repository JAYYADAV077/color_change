package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun Ui(modifier: Modifier = Modifier,bg: Bg) {

    Column(modifier = Modifier.fillMaxSize().background(color = bg.backGroudColor), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Button(onClick = {bg.coloChange()}) {
                Text("Color Change")
        }

        Button(onClick = {bg.coloChange2()}) {
            Text("Color Change To Original")
        }
    }

}