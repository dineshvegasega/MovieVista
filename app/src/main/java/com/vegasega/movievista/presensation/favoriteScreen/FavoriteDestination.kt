package com.vegasega.movievista.presensation.favoriteScreen

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.vegasega.movievista.navigation.MovieVistaNavigationDestination


object FavoriteDestination : MovieVistaNavigationDestination {
    override val route = "favorite_route"
    override val destination = "favorite_destination"
}


fun NavGraphBuilder.favoriteGraph(

) = composable(route = FavoriteDestination.route) {
    FavoriteRoute(

    )
}