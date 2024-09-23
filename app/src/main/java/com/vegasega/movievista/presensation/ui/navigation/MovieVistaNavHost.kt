package com.vegasega.movievista.presensation.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.vegasega.movievista.presensation.ui.navigation.screenDestinations.detailsGraph
import com.vegasega.movievista.presensation.ui.navigation.screenDestinations.homeGraph
import com.vegasega.movievista.presensation.ui.navigation.screenDestinations.searchGraph
import com.vegasega.movievista.presensation.ui.navigation.screenDestinations.settingGraph
import com.vegasega.movievista.presensation.ui.navigation.screenDestinations.wishlistGraph

@Composable
fun MovieVistaNavHost (
    navController: NavHostController,
    startDestination: MovieVistaNavigationDestination,
    onNavigateToDestination: (MovieVistaNavigationDestination, String) -> Unit,
    onBackClick: () -> Unit,
    onShowMessage: (String) -> Unit,
//    onSetSystemBarsColorTransparent: () -> Unit,
//    onResetSystemBarsColor: () -> Unit,
    modifier: Modifier = Modifier
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination.route
    ) {
        homeGraph(
//            onNavigateToListDestination = {
//                onNavigateToDestination(ListDestination, ListDestination.createNavigationRoute(it))
//            },
//            onNavigateToDetailsDestination = {
//                onNavigateToDestination(
//                    DetailsDestination,
//                    DetailsDestination.createNavigationRoute(it)
//                )
//            }
        )
        searchGraph(
//            onNavigateToListDestination = {
//                onNavigateToDestination(ListDestination, ListDestination.createNavigationRoute(it))
//            },
//            onNavigateToDetailsDestination = {
//                onNavigateToDestination(
//                    DetailsDestination,
//                    DetailsDestination.createNavigationRoute(it)
//                )
//            }
        )
        wishlistGraph(
//            onNavigateToDetailsDestination = {
//                onNavigateToDestination(
//                    DetailsDestination,
//                    DetailsDestination.createNavigationRoute(it)
//                )
//            }
        )

        settingGraph(
//            onNavigateToDetailsDestination = {
//                onNavigateToDestination(
//                    DetailsDestination,
//                    DetailsDestination.createNavigationRoute(it)
//                )
//            }
        )

        detailsGraph(
//            onBackButtonClick = onBackClick,
//            onShowMessage = onShowMessage,
//            onSetSystemBarsColorTransparent = onSetSystemBarsColorTransparent,
//            onResetSystemBarsColor = onResetSystemBarsColor
        )
    }
}