package com.example.banderas.screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview()
@Composable
fun BanderaCuba(){
    Box(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.fillMaxSize()) {
            Row(modifier = Modifier.weight(1f).fillMaxWidth().background(Color.Blue)) {}
            Row(modifier = Modifier.weight(1f).fillMaxWidth().background(Color.White)) {}
            Row(modifier = Modifier.weight(1f).fillMaxWidth().background(Color.Blue)) {}
            Row(modifier = Modifier.weight(1f).fillMaxWidth().background(Color.White)) {}
            Row(modifier = Modifier.weight(1f).fillMaxWidth().background(Color.Blue)) {}
        }

        Canvas(modifier = Modifier.fillMaxSize()) {
            val height = size.height
            val width = size.width

            val path = Path().apply {
                moveTo(0f, 0f)
                lineTo(width * 0.35f, height / 2)
                lineTo(0f, height)
                close()
            }
            drawPath(path, color = Color.Red)
        }
        Text(
            text = "★",
            color = Color.White,
            fontSize = 60.sp,
            modifier = Modifier
                .align(Alignment.CenterStart) // Alineada al centro a la izquierda
                .padding(start = 40.dp)
        )
    }
}