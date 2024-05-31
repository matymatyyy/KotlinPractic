package com.example.projectoparaelfinal.View

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun FourthScren(NavControll: NavHostController) {
    Column(verticalArrangement = Arrangement.SpaceBetween, horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
        .fillMaxSize()
        .background(Color.White)) {
        Column() {
            Spacer(modifier = Modifier.padding(30.dp))
            Text(text = "!Hola de nuevo¡", color = Color.Blue,fontSize = 50.sp)
            Text(text = "Felicidades", color = Color.Blue,fontSize = 20.sp)
            Text(text = "Usted a logeado correctamente", color = Color.Blue,fontSize = 20.sp)
            Spacer(modifier = Modifier.padding(10.dp))
        }
            Spacer(modifier = Modifier.padding(10.dp))
        }
    }
