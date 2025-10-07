package com.example.banderas.screens
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun PixelArtComposable() {
    val pixelMatrix = arrayOf(
        arrayOf("#FFFFFF","#FFFFFF", "#FFFFFF", "#FFFFFF", "#000000", "#FFFFFF", "#FFFFFF", "#000000", "#FFFFFF", "#FFFFFF","#FFFFFF", "#FFFFFF", "#000000", "#FFFFFF", "#FFFFFF", "#000000", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF"),
        arrayOf("#FFFFFF","#FFFFFF", "#FFFFFF", "#FFFFFF", "#000000", "#FFFFFF", "#000000", "#FFFFFF", "#FFFFFF", "#FFFFFF","#FFFFFF", "#FFFFFF", "#FFFFFF", "#000000", "#FFFFFF", "#000000", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF"),
        arrayOf("#FFFFFF","#FFFFFF", "#FFFFFF", "#000000", "#FFFFFF", "#FFFFFF", "#000000", "#FFFFFF", "#FFFFFF", "#FFFFFF","#FFFFFF", "#FFFFFF", "#FFFFFF", "#000000", "#FFFFFF", "#FFFFFF", "#000000", "#FFFFFF", "#FFFFFF", "#FFFFFF"),
        arrayOf("#FFFFFF","#FFFFFF", "#FFFFFF", "#000000", "#FFFFFF", "#000000", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF","#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#000000", "#FFFFFF", "#000000", "#FFFFFF", "#FFFFFF", "#FFFFFF"),
        arrayOf("#FFFFFF","#FFFFFF", "#000000", "#000000", "#FFFFFF", "#000000", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF","#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#000000", "#FFFFFF", "#000000", "#000000", "#FFFFFF", "#FFFFFF"),
        arrayOf("#FFFFFF","#FFFFFF", "#000000", "#000000", "#FFFFFF", "#000000", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF","#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#000000", "#FFFFFF", "#000000", "#000000", "#FFFFFF", "#FFFFFF"),
        arrayOf("#FFFFFF","#FFFFFF", "#000000", "#000000", "#FFFFFF", "#FFFFFF", "#000000", "#000000", "#FFFFFF", "#000000","#000000", "#FFFFFF", "#000000", "#000000", "#FFFFFF", "#FFFFFF", "#000000", "#000000", "#FFFFFF", "#FFFFFF"),
        arrayOf("#FFFFFF","#FFFFFF", "#000000", "#000000", "#000000", "#000000", "#FFFFFF", "#000000", "#000000", "#000000","#000000", "#000000", "#000000", "#FFFFFF", "#000000", "#000000", "#000000", "#000000", "#FFFFFF", "#FFFFFF"),
        arrayOf("#FFFFFF","#FFFFFF", "#000000", "#000000", "#FFFFFF", "#FFFFFF", "#000000", "#FFFFFF", "#000000", "#000000","#000000", "#000000", "#FFFFFF", "#000000", "#FFFFFF", "#FFFFFF", "#000000", "#000000", "#FFFFFF", "#FFFFFF"),
        arrayOf("#FFFFFF","#FFFFFF", "#FFFFFF", "#FFFFFF", "#000000", "#000000", "#FFFFFF", "#000000", "#000000", "#000000","#000000", "#000000", "#000000", "#FFFFFF", "#000000", "#000000", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF"),
        arrayOf("#FFFFFF","#000000", "#FFFFFF", "#000000", "#FFFFFF", "#FFFFFF", "#000000", "#FFFFFF", "#000000", "#000000","#000000", "#000000", "#FFFFFF", "#000000", "#FFFFFF", "#FFFFFF", "#000000", "#FFFFFF", "#000000", "#FFFFFF"),
        arrayOf("#FFFFFF","#000000", "#000000", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#000000", "#FFFFFF", "#000000", "#000000","#000000", "#000000", "#FFFFFF", "#000000", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#000000", "#000000", "#FFFFFF"),
        arrayOf("#FFFFFF","#000000", "#000000", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#000000", "#FFFFFF", "#000000", "#000000","#000000", "#000000", "#FFFFFF", "#000000", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#000000", "#000000", "#FFFFFF"),
        arrayOf("#FFFFFF","#000000", "#000000", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#000000", "#FFFFFF", "#FFFFFF", "#000000","#000000", "#FFFFFF", "#FFFFFF", "#000000", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#000000", "#000000", "#FFFFFF"),
        arrayOf("#FFFFFF","#000000", "#000000", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#000000", "#FFFFFF", "#FFFFFF", "#000000","#000000", "#FFFFFF", "#FFFFFF", "#000000", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#000000", "#000000", "#FFFFFF"),
        arrayOf("#FFFFFF","#000000", "#000000", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#000000", "#FFFFFF", "#FFFFFF", "#FFFFFF","#FFFFFF", "#FFFFFF", "#FFFFFF", "#000000", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#000000", "#000000", "#FFFFFF"),
        arrayOf("#FFFFFF","#FFFFFF", "#000000", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#000000", "#FFFFFF", "#FFFFFF", "#FFFFFF","#FFFFFF", "#FFFFFF", "#FFFFFF", "#000000", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#000000", "#FFFFFF", "#FFFFFF"),
        arrayOf("#FFFFFF","#FFFFFF", "#000000", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#000000", "#000000", "#FFFFFF", "#FFFFFF","#FFFFFF", "#FFFFFF", "#000000", "#000000", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#000000", "#FFFFFF", "#FFFFFF"),
        arrayOf("#FFFFFF","#FFFFFF", "#FFFFFF", "#000000", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#000000", "#FFFFFF", "#FFFFFF","#FFFFFF", "#FFFFFF", "#000000", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#000000", "#FFFFFF", "#FFFFFF", "#FFFFFF"),
        arrayOf("#FFFFFF","#FFFFFF", "#FFFFFF", "#000000", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#000000", "#FFFFFF", "#FFFFFF","#FFFFFF", "#FFFFFF", "#000000", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#000000", "#FFFFFF", "#FFFFFF", "#FFFFFF"),
        arrayOf("#FFFFFF","#FFFFFF", "#FFFFFF", "#FFFFFF", "#000000", "#FFFFFF", "#FFFFFF", "#000000", "#FFFFFF", "#FFFFFF","#FFFFFF", "#FFFFFF", "#000000", "#FFFFFF", "#FFFFFF", "#000000", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF"),
        arrayOf("#FFFFFF","#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#000000", "#FFFFFF", "#FFFFFF","#FFFFFF", "#FFFFFF", "#000000", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF"),
        arrayOf("#FFFFFF","#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#000000", "#FFFFFF","#FFFFFF", "#000000", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF"),

    )

    Column {
        for (row in pixelMatrix) {
            Row {
                for (colorHex in row) {
                    var currentColor by remember { mutableStateOf(Color(android.graphics.Color.parseColor(colorHex))) }

                    Box(
                        modifier = Modifier
                            .size(20.dp)
                            .background(currentColor)
                            .border(1.dp, Color.Black)
                            .clickable {
                                currentColor = Color.Yellow
                            }
                    )
                }
            }
        }
    }
}