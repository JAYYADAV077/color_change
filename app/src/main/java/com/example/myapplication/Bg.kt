package com.example.myapplication

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel

class Bg:ViewModel(){

    var backGroudColor by mutableStateOf(Color.Red)
    
    fun coloChange(){
        backGroudColor = Color.Green
    }

    fun coloChange2(){
        backGroudColor = Color.Red
    }


}
