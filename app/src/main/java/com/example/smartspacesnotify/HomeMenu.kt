package com.example.smartspacesnotify

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController

@Composable
fun HomeMenu(
    navController: NavController,
    device: List<String> = listOf("Smart Camera", "Smart Speaker", "Smart Lights", "Smart Thermostat"),
    routeName: List<String> = listOf("CameraAware", "SpeakerAware", "LightAware", "ThermostatAware")
){
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        device.zip(routeName).forEach{p->
            Button(
                elevation = ButtonDefaults.buttonElevation(
                    defaultElevation = 6.dp
                ),
                onClick = { /*TODO*/
                navController.navigate(route = p.second)
            }) {
                Text(text = p.first)
            }
            Spacer(modifier = Modifier.height(25.dp))
        }
    }
}