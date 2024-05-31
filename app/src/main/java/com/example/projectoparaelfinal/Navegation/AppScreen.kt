package com.example.projectoparaelfinal.Navegation

sealed class AppScreen(var Route:String){
    object FirstScrenn: AppScreen("First_Screen")
    object SecondScreen: AppScreen("Second_Screen")
    object  TreeScrenn: AppScreen("Tree_Screen")
    object  FourthScreen: AppScreen("Fourth_Screen")
}

