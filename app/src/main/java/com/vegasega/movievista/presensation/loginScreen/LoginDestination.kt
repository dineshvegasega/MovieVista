package com.vegasega.movievista.presensation.loginScreen

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.vegasega.movievista.navigation.MovieVistaNavigationDestination


object LoginDestination : MovieVistaNavigationDestination {
    override val route = "login_route"
    override val destination = "login_destination"
}


fun NavGraphBuilder.loginGraph(
    onNavigateToRegisterDestination: () -> Unit,
) = composable(route = LoginDestination.route) {
    LoginRoute(
        onRegister = onNavigateToRegisterDestination,
    )
}