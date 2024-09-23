package com.vegasega.movievista.presensation.ui.navigation.screenDestinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.vegasega.movievista.presensation.homeScreen.HomeRoute
import com.vegasega.movievista.presensation.ui.navigation.MovieVistaNavigationDestination


object HomeDestination : MovieVistaNavigationDestination {
    override val route = "home_route"
    override val destination = "home_destination"
}


fun NavGraphBuilder.homeGraph(
//    onNavigateToListDestination: (com.maximillianleonov.MovieVista.core.model.MediaType.Common) -> Unit,
//    onNavigateToDetailsDestination: (com.maximillianleonov.MovieVista.core.model.MediaType.Details) -> Unit
) = composable(route = HomeDestination.route) {
    HomeRoute(
//        onSeeAllClick = onNavigateToListDestination,
//        onMovieClick = { onNavigateToDetailsDestination(MediaType.Details.Movie(it)) },
//        onTvShowClick = { onNavigateToDetailsDestination(MediaType.Details.TvShow(it)) }
    )
}
