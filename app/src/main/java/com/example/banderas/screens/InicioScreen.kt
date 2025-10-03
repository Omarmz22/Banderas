package com.example.banderas.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.banderas.R

@Composable
@Preview
fun InicioScreen(){
    ConstraintLayout (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ){
        val (rayaBlanca, rayaRoja, cuadroAzul, estrella) = createRefs()

        Box(
            modifier = Modifier
                .constrainAs(rayaBlanca){
                    top.linkTo(parent.top)
                    start.linkTo(cuadroAzul.end)
                    end.linkTo(parent.end)
                    height = Dimension.percent(0.5f)
                    width = Dimension.fillToConstraints
                }
                .background(Color.White)
        )
        Box(
            modifier = Modifier
                .constrainAs(rayaRoja){
                    top.linkTo(rayaBlanca.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    bottom.linkTo(parent.bottom)
                    width = Dimension.percent(1f)
                    height = Dimension.percent(0.5f)
                }
                .background(Color.Red)
        )

        Box(
            modifier = Modifier
                .constrainAs(cuadroAzul){
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    end.linkTo(rayaBlanca.start)
                    width = Dimension.percent(0.40f)
                    height = Dimension.percent(0.5f)
                }
                .background(Color.Blue)
        )

        Box(
            modifier = Modifier
                .size(30.dp)
                .background(Color.White, shape = CircleShape)
                .constrainAs(estrella){
                    start.linkTo(cuadroAzul.start)
                    end.linkTo(cuadroAzul.end)
                    top.linkTo(cuadroAzul.top)
                    bottom.linkTo(cuadroAzul.bottom)

                }

        )
    }
}


