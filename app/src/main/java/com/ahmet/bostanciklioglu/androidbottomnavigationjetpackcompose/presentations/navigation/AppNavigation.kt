package com.ahmet.bostanciklioglu.androidbottomnavigationjetpackcompose.presentations.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ahmet.bostanciklioglu.androidbottomnavigationjetpackcompose.presentations.home.HomeScreen
import com.ahmet.bostanciklioglu.androidbottomnavigationjetpackcompose.presentations.notifications.NotificationsScreen
import com.ahmet.bostanciklioglu.androidbottomnavigationjetpackcompose.presentations.settings.SettingsScreen


@Composable
fun AppNavigation(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            BottomNavigationBar(navController = navController)
        }
    ) { paddingValue ->
         NavHost(
             navController = navController,
             startDestination = BottomBarScreen.Home.route
         ) {
             composable(BottomBarScreen.Home.route) {
                 HomeScreen(
                     modifier = Modifier.padding(paddingValue)
                 )
             }
             composable(BottomBarScreen.Notifications.route) { NotificationsScreen() }
             composable(BottomBarScreen.Settings.route) { SettingsScreen() }
         }
    }
}

