package com.vegasega.movievista.ui

import android.annotation.SuppressLint
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.vegasega.movievista.theme.MovieVistaTheme
import com.vegasega.movievista.navigation.MovieVistaAppState
import com.vegasega.movievista.navigation.MovieVistaBottomBar
import com.vegasega.movievista.navigation.MovieVistaNavHost
import com.vegasega.movievista.navigation.rememberMovieVistaAppState
import com.vegasega.movievista.presensation.splashScreen.SplashDestination
import com.vegasega.movievista.ui.components.MovieVistaSnackbarHost

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MovieVistaApp(
    appState: MovieVistaAppState = rememberMovieVistaAppState(),
    systemBarsColor: Color = MovieVistaTheme.colors.primaryDark
) {
//    LaunchedEffect(systemBarsColor) { appState.setSystemBarsColor(systemBarsColor) }
    MovieVistaTheme {
        Scaffold(
            bottomBar = {
                AnimatedVisibility(
                    visible = appState.shouldShowBottomBar,
                    enter = BottomBarEnterTransition,
                    exit = BottomBarExitTransition
                ){
                    BottomAppBar { MovieVistaBottomBar(
                        destinations = appState.topLevelDestinations,
                        currentDestination = appState.currentTopLevelDestination,
                        onNavigateToDestination = appState::navigate
                    ) }
                }
            },
            snackbarHost = {
                MovieVistaSnackbarHost(
                    modifier = Modifier.windowInsetsPadding(
                        if (appState.shouldShowBottomBar) {
                            WindowInsets.safeDrawing.only(WindowInsetsSides.Horizontal)
                        } else {
                            WindowInsets.safeDrawing
                        }
                    ),
                    snackbarHostState = appState.snackbarHostState
                )
            },
            contentWindowInsets = WindowInsets(
                left = 0.dp,
                top = 0.dp,
                right = 0.dp,
                bottom = 0.dp
            )
        ) {innerPadding ->
//            NavigationScreens(navController = navController)
            MovieVistaNavHost(
                modifier = Modifier
                    .padding(paddingValues = innerPadding)
                    .consumeWindowInsets(paddingValues = innerPadding),
                navController = appState.navController,
                startDestination = SplashDestination,
                onNavigateToDestination = appState::navigate,
                onBackClick = appState::onBackClick,
                onShowMessage = { message -> appState.showMessage(message) },
            )
        }
    }
}

private val BottomBarEnterTransition = fadeIn() + expandVertically(expandFrom = Alignment.Top)
private val BottomBarExitTransition = shrinkVertically(shrinkTowards = Alignment.Top) + fadeOut()