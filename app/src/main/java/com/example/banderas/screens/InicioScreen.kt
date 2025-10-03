package com.example.banderas.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
@Preview
fun InicioScreen() {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val(verde, blanco, rojo) = createRefs()

        val franjaWith = 0.33f

        androidx.compose.foundation.layout.Box(
            modifier = Modifier
                .constrainAs(verde){
                    start.linkTo(parent.start)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                }
                .fillMaxSize(franjaWith)
                .background(Color(0xFF006847))
        )

        androidx.compose.foundation.layout.Box(
            modifier = Modifier
                .constrainAs(blanco){
                    start.linkTo(verde.end)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                }
                .fillMaxSize(franjaWith)
                .background(Color.White)
        )

        androidx.compose.foundation.layout.Box(
            modifier = Modifier
                .constrainAs(rojo){
                    start.linkTo(blanco.end)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                }
                .fillMaxSize(franjaWith)
                .background(Color(0xFFCE1126))
        )

    }

}


