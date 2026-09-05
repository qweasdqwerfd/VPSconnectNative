package com.example.vpsconnect.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.vpsconnect.presentation.screens.ContainersScreen

@Composable
fun NavGraph(modifier: Modifier = Modifier) {
    val navController = rememberNavController()

    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = Container
    ) {
        composable<Container> { ContainersScreen() }
    }

}
