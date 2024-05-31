package com.example.projectoparaelfinal.View

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.projectoparaelfinal.Navegation.AppScreen
import com.example.projectoparaelfinal.R
import com.example.projectoparaelfinal.ViewModel.MyViewModel

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FistScreen(NavControll: NavHostController, viewModel: MyViewModel) {

    Scaffold() {
        Fondo()
        FistBody(NavControll,viewModel)
    }
}

@Composable
fun FistBody(NavControll: NavHostController, viewModel: MyViewModel) {
    Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxSize()) {
        PersonaSet()
        Text(text = "Atencion Virtual inmediata por medio", color = Color.White)
        Text(text = "de nuestra Clinica Virtual", color = Color.White)
        Spacer(modifier = Modifier.padding(10.dp))
        Button(onClick = { NavControll.navigate(AppScreen.SecondScreen.Route) }, modifier=Modifier.size(300.dp,50.dp), colors = ButtonDefaults.buttonColors(Color(136,220,101))) {
            Text(text = "Iniciar Sesion", color=Color.White)
        }
        Spacer(modifier = Modifier.padding(5.dp))
        Button(onClick = { NavControll.navigate(AppScreen.TreeScrenn.Route) }, modifier = Modifier.size(300.dp,50.dp), colors = ButtonDefaults.buttonColors(Color(135,206,250))) {
            Text(text = "Registrarme", color=Color.White)
        }
    }
}

@Composable
fun Fondo(){
    Image(painter = painterResource(id = R.drawable.fondo), contentDescription = null, modifier = Modifier.fillMaxSize(), contentScale = ContentScale.FillBounds)
}

@Composable
fun PersonaSet(){
    Image(painter = painterResource(id = R.drawable.personasentada), contentDescription = null, modifier = Modifier.size(200.dp, 200.dp))
}

