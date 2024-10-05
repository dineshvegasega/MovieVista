package com.vegasega.movievista.presensation.settingScreen

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.vegasega.movievista.navigation.MovieVistaNavigationDestination


object SettingDestination : MovieVistaNavigationDestination {
    override val route = "setting_route"
    override val destination = "setting_destination"
}


fun NavGraphBuilder.settingGraph(

) = composable(route = SettingDestination.route) {
    SettingRoute(

    )
}