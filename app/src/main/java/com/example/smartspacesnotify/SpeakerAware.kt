package com.example.smartspacesnotify

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun SpeakerAware(
    navController: NavHostController
    ){
        val  ciDevices: List<CiDeviceInfo> = listOf(
            CiDeviceInfo(
                "Everyone in the Room",
                "Blurred Video",
                "Data Stored Forever on the Cloud",
                "Facilities Management",
                "The blurred video is captured by the Facilities Management to observe the space utilization within the space." ),
            CiDeviceInfo(
                "Person Using the Camera",
                "Raw Video, Raw Audio",
                "Data Stored Ephemeral on the Cloud",
                "Service Provider",
                "The raw video and audio is required for video conferencing." ),
            CiDeviceInfo(
                "Everyone in the Room",
                "Raw Video",
                "Data Stored for 3 months on the Cloud",
                "Facilities Management, Organization Management, Law Enforcement",
                "The raw video is captured and shared with law enforcement agencies, organization and facilities for security purpose. The data is stored only for 3 months"
            )
        )
        Column (
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(text ="Information of Speaker in Office Kitchen")
            SkeletonAware(navController, ciDevices, "Smart Speaker")
        }

    }