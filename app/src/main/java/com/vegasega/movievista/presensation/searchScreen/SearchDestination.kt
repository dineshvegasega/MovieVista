package com.vegasega.movievista.presensation.searchScreen

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.vegasega.movievista.navigation.MovieVistaNavigationDestination


object SearchDestination : MovieVistaNavigationDestination {
    override val route = "search_route"
    override val destination = "search_destination"
}


fun NavGraphBuilder.searchGraph(

) = composable(route = SearchDestination.route) {
    SearchRoute(

    )
}