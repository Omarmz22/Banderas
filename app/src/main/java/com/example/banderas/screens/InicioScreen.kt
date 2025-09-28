package com.example.banderas.screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun BnaderaBrazil(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Green),
        contentAlignment = Alignment.Center
    ) {
        Canvas(modifier = Modifier.size(300.dp)) {
            val canvasWidth = size.width
            val canvasHeight = size.height

            val path = Path().apply {
                moveTo(canvasWidth / 2, 0f)
                lineTo(canvasWidth, canvasHeight / 2f)
                lineTo(canvasWidth / 2, canvasHeight)
                lineTo(0f, canvasHeight / 2f)
                close()
            }
            drawPath(
                path = path,
                color = Color.Yellow
            )
            drawCircle(
                color = Color.Blue,
                radius = canvasWidth * 0.25f,
                center = Offset(canvasWidth / 2, canvasHeight / 2)
            )

        }
    }

}