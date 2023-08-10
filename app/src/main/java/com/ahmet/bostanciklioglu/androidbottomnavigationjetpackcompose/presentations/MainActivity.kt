package com.ahmet.bostanciklioglu.androidbottomnavigationjetpackcompose.presentations

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ahmet.bostanciklioglu.androidbottomnavigationjetpackcompose.presentations.home.HomeScreen
import com.ahmet.bostanciklioglu.androidbottomnavigationjetpackcompose.presentations.navigation.AppNavigation
import com.ahmet.bostanciklioglu.androidbottomnavigationjetpackcompose.presentations.navigation.BottomBarScreen
import com.ahmet.bostanciklioglu.androidbottomnavigationjetpackcompose.presentations.navigation.BottomNavigationBar
import com.ahmet.bostanciklioglu.androidbottomnavigationjetpackcompose.presentations.notifications.NotificationsScreen
import com.ahmet.bostanciklioglu.androidbottomnavigationjetpackcompose.presentations.settings.SettingsScreen
import com.ahmet.bostanciklioglu.androidbottomnavigationjetpackcompose.ui.theme.AndroidBottomNavigationJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidBottomNavigationJetpackComposeTheme {
                AppNavigation()
            }
        }
    }
}

