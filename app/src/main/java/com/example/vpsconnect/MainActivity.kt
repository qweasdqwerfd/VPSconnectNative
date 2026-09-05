package com.example.vpsconnect

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.vpsconnect.presentation.navigation.NavGraph
import com.example.vpsconnect.utils.VPSConnectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            VPSConnectTheme {

                Scaffold(modifier = Modifier) { innerPadding ->
                    NavGraph(modifier = Modifier.padding(innerPadding))
                }

            }
        }
    }
}