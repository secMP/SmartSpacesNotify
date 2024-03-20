package com.example.smartspacesnotify

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.smartspacesnotify.ui.theme.SmartSpacesNotifyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SmartSpacesNotifyTheme {
                Surface (
                    modifier = Modifier
                        .fillMaxSize()
                ){
                    Nav()
                }

            }
        }
    }
}






