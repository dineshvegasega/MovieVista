package com.vegasega.movievista.presensation.splashScreen

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.vegasega.movievista.navigation.MovieVistaNavigationDestination


object SplashDestination : MovieVistaNavigationDestination {
    override val route = "splash_route"
    override val destination = "splash_destination"
}


fun NavGraphBuilder.splashGraph(
    onNavigateToLoginDestination: () -> Unit,
) = composable(route = SplashDestination.route) {
    SplashRoute(
        onLogin = onNavigateToLoginDestination,
    )
}