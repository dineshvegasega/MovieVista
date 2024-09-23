package com.vegasega.movievista.presensation.ui.navigation.screenDestinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.vegasega.movievista.presensation.ui.navigation.MovieVistaNavigationDestination
import com.vegasega.movievista.presensation.wishlistScreen.WishlistRoute

//import com.maximillianleonov.MovieVista.core.model.MediaType

object WishlistDestination :
    MovieVistaNavigationDestination {
    override val route = "wishlist_route"
    override val destination = "wishlist_destination"
}

fun NavGraphBuilder.wishlistGraph(
//    onNavigateToDetailsDestination: (com.maximillianleonov.MovieVista.core.model.MediaType.Details) -> Unit
) = composable(route = WishlistDestination.route) {
    WishlistRoute(
//        onMovieClick = { onNavigateToDetailsDestination(MediaType.Details.Movie(it)) },
//        onTvShowClick = { onNavigateToDetailsDestination(MediaType.Details.TvShow(it)) }
    )
}
