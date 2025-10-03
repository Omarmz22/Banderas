package com.example.banderas.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.banderas.R

@Composable
@Preview
fun InicioScreen() {
    ConstraintLayout(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
    )
    {
        val(circuloRojo) = createRefs()

        Box(
            modifier = Modifier
                .size(150.dp)
                .background(Color(0xFFBC002D), shape = CircleShape)
                .constrainAs(circuloRojo) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                }
        )
    }

}


