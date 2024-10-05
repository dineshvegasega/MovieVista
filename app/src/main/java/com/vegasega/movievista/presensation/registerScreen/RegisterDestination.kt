package com.vegasega.movievista.presensation.registerScreen

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.vegasega.movievista.navigation.MovieVistaNavigationDestination


object RegisterDestination : MovieVistaNavigationDestination {
    override val route = "register_route"
    override val destination = "register_destination"
}


fun NavGraphBuilder.registerGraph(
    onNavigateToHomeDestination: () -> Unit,
) = composable(route = RegisterDestination.route) {
    RegisterRoute(
        onHome = onNavigateToHomeDestination,
    )
}