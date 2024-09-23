package com.vegasega.movievista.presensation.ui.navigation.screenDestinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.vegasega.movievista.presensation.ui.navigation.MovieVistaNavigationDestination
import com.vegasega.movievista.presensation.searchScreen.SearchRoute

//import com.maximillianleonov.MovieVista.core.model.MediaType

object SearchDestination :
    MovieVistaNavigationDestination {
    override val route = "search_route"
    override val destination = "search_destination"
}

fun NavGraphBuilder.searchGraph(
//    onNavigateToListDestination: (com.maximillianleonov.MovieVista.core.model.MediaType.Common) -> Unit,
//    onNavigateToDetailsDestination: (com.maximillianleonov.MovieVista.core.model.MediaType.Details) -> Unit
) = composable(route = SearchDestination.route) {
    SearchRoute(
//        onSeeAllClick = onNavigateToListDestination,
//        onMovieClick = { onNavigateToDetailsDestination(MediaType.Details.Movie(it)) },
//        onTvShowClick = { onNavigateToDetailsDestination(MediaType.Details.TvShow(it)) }
    )
}
