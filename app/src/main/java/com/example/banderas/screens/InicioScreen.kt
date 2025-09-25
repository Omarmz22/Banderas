package com.example.banderas.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
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
            .background(Color.Green)
    ) {
        Box(
            modifier = Modifier
                .size(300.dp)
                .drawWithCache {
                    val path = Path().apply {
                        moveTo(size.width / 2f, 0f) // Top center
                        lineTo(size.width, size.height / 2f) // Middle right
                        lineTo(size.width / 2f, size.height) // Bottom center
                        lineTo(0f, size.height / 2f) // Middle left
                        close()
                    }
                    onDrawBehind {
                        drawPath(path, color = Color.Yellow)
                    }
                }
        )
    }

}