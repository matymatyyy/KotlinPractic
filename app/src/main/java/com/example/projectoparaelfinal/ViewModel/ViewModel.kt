package com.example.projectoparaelfinal.ViewModel

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.navigation.Navigation
import com.example.projectoparaelfinal.Navegation.AppScreen
import com.example.projectoparaelfinal.Navegation.NavControler

class MyViewModel: ViewModel(){
    var Text1= mutableStateOf("")
    var Text2= mutableStateOf("")
    var user="maty"
    var contra="maty123"
    var Total= mutableStateOf("")
    var X1=false

    fun Verificar(){
        if (Text1.value == user && Text2.value == contra){
            Total.value="Login hecho"
            X1=true
        }
        else{
            X1=false
            Total.value= "Esta mal el usuario o contraseña mal"
        }

    }
}

