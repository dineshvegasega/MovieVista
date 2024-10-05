package com.vegasega.movievista.presensation.detailScreen

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.vegasega.movievista.navigation.MovieVistaNavigationDestination

object DetailDestination : MovieVistaNavigationDestination {
    override val route = "detail_route"
    override val destination = "detail_destination"
}


fun NavGraphBuilder.detailGraph(

) = composable(route = DetailDestination.route) {
    DetailRoute(

    )
}