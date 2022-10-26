package com.example.rusfinal

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Nav(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "ListPage"){
        composable(route = "ListPage"){
            ListPage(navController = navController)
        }
        composable(route = "DetailPage"){
            DetailPage(navController = navController)
        }
    }
}