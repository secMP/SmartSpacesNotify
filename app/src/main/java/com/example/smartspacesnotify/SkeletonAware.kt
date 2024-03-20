package com.example.smartspacesnotify

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun SkeletonAware(
    navController: NavHostController,
    ciDevices: List<CiDeviceInfo>,
    smartDevice: String,
    modifier: Modifier = Modifier
    ){
        LazyColumn(
        ){
            itemsIndexed(
                items = ciDevices
            ){
                    index, c->
                ContentCard(index+1, c, smartDevice)
            }
        }
}
@Composable
fun ContentCard(index: Int, ciDevice: CiDeviceInfo, device: String, modifier: Modifier = Modifier){
    ElevatedCard (
        modifier = Modifier
            .padding(15.dp)
    ){
        /* Nested Coloumn*/
        Column {
            /* 1st Column: Creating the first Title Information*/
            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .background(MaterialTheme.colorScheme.onPrimaryContainer)
                ){
                Text(text = "$device Information: $index",
                    modifier = Modifier
                        .padding(top = 5.dp),
                    style= MaterialTheme.typography.titleSmall,
                    color = Color.White,
                )
            }
            /*2nd Coloumn: Container for Subject*/
            Column{
                Text(text = "Subject: ",
                    style= TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontStyle = FontStyle.Italic,
                        fontSize = 15.sp,
                    )
                )
                Text(text = ciDevice.subject,
                    style = MaterialTheme.typography.bodyMedium)
            }
            /*3rd Column: Container for Data Type*/
            Column{
                Text(text = "Data Type: ",
                    style= TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontStyle = FontStyle.Italic,
                        fontSize = 15.sp,
                    )
                )
                Text(text = ciDevice.typeData,
                    style = MaterialTheme.typography.bodyMedium)
            }
            /*4th Column: Container for Data Retention*/
            Column{
                Text(text = "Data Retention Time: ",
                    style= TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontStyle = FontStyle.Italic,
                        fontSize = 15.sp,
                    )
                )
                Text(text = ciDevice.retentionData,
                    style = MaterialTheme.typography.bodyMedium)
            }
            /*5th Column: Container for Data Storage*/
            Column{
                Text(text = "Receiver of the Data: ",
                    style= TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontStyle = FontStyle.Italic,
                        fontSize = 15.sp,
                    )
                )
                Text(text = ciDevice.receiver,
                    style = MaterialTheme.typography.bodyMedium)
            }
            /*6th Column: Container for Data Retention*/
            Column{
                Text(text = "Purpose for Data Sharing: ",
                    style= TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontStyle = FontStyle.Italic,
                        fontSize = 15.sp,
                    )
                )
                Text(text = ciDevice.purpose,
                    style = MaterialTheme.typography.bodyMedium)
            }

        }
    }
}