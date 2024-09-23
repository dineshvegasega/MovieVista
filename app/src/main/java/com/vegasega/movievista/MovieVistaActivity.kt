package com.vegasega.movievista

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.core.view.WindowCompat
import androidx.navigation.compose.rememberNavController
import com.vegasega.movievista.presensation.MovieVistaApp
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MovieVistaActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            MovieVistaApp()
        }
    }
}

