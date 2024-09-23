package com.vegasega.movievista.presensation.ui.navigation.screenDestinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.vegasega.movievista.presensation.ui.navigation.MovieVistaNavigationDestination
import com.vegasega.movievista.presensation.searchScreen.SearchRoute
import com.vegasega.movievista.presensation.settingScreen.SettingRoute

//import com.maximillianleonov.MovieVista.core.model.MediaType

object SettingDestination :
    MovieVistaNavigationDestination {
    override val route = "setting_route"
    override val destination = "setting_destination"
}

fun NavGraphBuilder.settingGraph(
//    onNavigateToListDestination: (com.maximillianleonov.MovieVista.core.model.MediaType.Common) -> Unit,
//    onNavigateToDetailsDestination: (com.maximillianleonov.MovieVista.core.model.MediaType.Details) -> Unit
) = composable(route = SettingDestination.route) {
    SettingRoute(
//        onSeeAllClick = onNavigateToListDestination,
//        onMovieClick = { onNavigateToDetailsDestination(MediaType.Details.Movie(it)) },
//        onTvShowClick = { onNavigateToDetailsDestination(MediaType.Details.TvShow(it)) }
    )
}
