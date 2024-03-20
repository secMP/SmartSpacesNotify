package com.example.smartspacesnotify

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Nav(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "HomeMenu"){
        composable(route = "HomeMenu"){
            HomeMenu(navController)
        }
        composable(route = "CameraAware"){
            CameraAware(navController)
        }
        composable(route = "SpeakerAware"){
            SpeakerAware(navController)
        }
    }

}