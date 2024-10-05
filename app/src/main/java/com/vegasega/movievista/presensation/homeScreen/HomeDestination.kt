package com.vegasega.movievista.presensation.homeScreen

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.vegasega.movievista.navigation.MovieVistaNavigationDestination

object HomeDestination : MovieVistaNavigationDestination {
    override val route = "home_route"
    override val destination = "home_destination"
}


fun NavGraphBuilder.homeGraph(

) = composable(route = HomeDestination.route) {
    HomeRoute(

    )
}