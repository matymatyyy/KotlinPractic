package com.example.projectoparaelfinal.View

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.projectoparaelfinal.Navegation.AppScreen
import com.example.projectoparaelfinal.ViewModel.MyViewModel

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TreeScreen(NavControll: NavHostController, viewModel: MyViewModel) {
    Scaffold(topBar = { TopAppBar(colors = TopAppBarDefaults.largeTopAppBarColors(Color.White),title = { Icon(imageVector = Icons.Default.ArrowBack, contentDescription = null, tint = Color.Blue, modifier = Modifier.clickable { NavControll.popBackStack() }) }) }) {
        Spacer(modifier = Modifier.padding(10.dp))
        TreeBody(NavControll,viewModel)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TreeBody(NavControll: NavHostController, viewModel: MyViewModel) {
    var contex= LocalContext.current
    Column(verticalArrangement = Arrangement.SpaceBetween, horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
        .fillMaxSize()
        .background(Color.White)) {
        Column() {
            Spacer(modifier = Modifier.padding(30.dp))
            Text(text = "!Hola de nuevo¡", color = Color.Blue,fontSize = 50.sp)
            Text(text = "bienvenido , descubramos juntos como", color = Color.Blue,fontSize = 20.sp)
            Text(text = "vivir sano y saludable", color = Color.Blue,fontSize = 20.sp)
            Spacer(modifier = Modifier.padding(10.dp))
            OutlinedTextField(value = viewModel.Text1.value, onValueChange = {it->viewModel.Text1.value=it}, label = {Text(text = "Rut")}, modifier = Modifier.size(350.dp,70.dp))
            Spacer(modifier = Modifier.padding(10.dp))
        }
        Column() {
            Spacer(modifier = Modifier.padding(10.dp))
            Button(onClick = {
                Toast.makeText(contex,"???", Toast.LENGTH_SHORT).show()
            }, modifier=Modifier.size(300.dp,70.dp), colors = ButtonDefaults.buttonColors(Color(136,220,101))) {
                Text(text = "Registrarme", color = Color.White)
            }
            Spacer(modifier = Modifier.padding(5.dp))
            Button(onClick = { NavControll.navigate(AppScreen.SecondScreen.Route) }, modifier = Modifier.size(300.dp,70.dp), colors = ButtonDefaults.buttonColors(
                Color.White)) {
                Text(text = "Ya estoy registrado", color = Color.Blue)
            }
            Spacer(modifier = Modifier.padding(10.dp))
        }
    }
}