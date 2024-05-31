package com.example.projectoparaelfinal.Navegation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.projectoparaelfinal.View.FistScreen
import com.example.projectoparaelfinal.View.FourthScren
import com.example.projectoparaelfinal.View.SecondScreen
import com.example.projectoparaelfinal.View.TreeScreen
import com.example.projectoparaelfinal.ViewModel.MyViewModel

@Composable
fun NavControler(){
    var NavControll= rememberNavController()
    var viewModel : MyViewModel = viewModel()
    NavHost(navController = NavControll, startDestination = AppScreen.FirstScrenn.Route){
        composable(AppScreen.FirstScrenn.Route){
            FistScreen(NavControll,viewModel)
        }
        composable(AppScreen.SecondScreen.Route){
            SecondScreen(NavControll,viewModel)
        }
        composable(AppScreen.TreeScrenn.Route){
            TreeScreen(NavControll,viewModel)
        }
        composable(AppScreen.FourthScreen.Route){
            FourthScren(NavControll)
        }
    }
}