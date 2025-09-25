package com.example.banderas.screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview()
@Composable
fun Screenjapon(){
    Box(
    modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
    ){
        Canvas(modifier = Modifier.fillMaxSize()){
            val canvasWidth = size.width
            val canvasHeight = size.height
            val radius = minOf(canvasWidth, canvasHeight) /4

            drawCircle(
                color = Color.Red,
                radius = radius,
                center = Offset(x = canvasWidth /2, y = canvasHeight /2)
            )
        }
    }
}