package com.vegasega.movievista.navigation

import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.navigation.NavDestination
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
//import com.google.accompanist.systemuicontroller.SystemUiController
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch


@Composable
fun rememberMovieVistaAppState(
//    systemUiController: SystemUiController = rememberSystemUiController(),
    snackbarHostState: SnackbarHostState = remember { SnackbarHostState() },
    coroutineScope: CoroutineScope = rememberCoroutineScope(),
    navController: NavHostController = rememberNavController(),
    startDestination: TopLevelDestination = TopLevelDestination.Home
) = remember(
//    systemUiController,
    snackbarHostState,
    coroutineScope,
    navController,
    startDestination
) {
    MovieVistaAppState(
//        systemUiController = systemUiController,
        snackbarHostState = snackbarHostState,
        coroutineScope = coroutineScope,
        navController = navController,
        startDestination = startDestination
    )
}


@Stable
class MovieVistaAppState (
//    val systemUiController: SystemUiController,
    val snackbarHostState: SnackbarHostState,
    val coroutineScope: CoroutineScope,
    val navController: NavHostController,
    val startDestination: TopLevelDestination
) {
    init {
        coroutineScope.launch {
            snackbarMessages.collect { messages ->
                if (messages.isNotEmpty()) {
                    val message = messages.first()
                    snackbarHostState.showSnackbar(message = message)
                    snackbarMessages.update { messageList ->
                        messageList.filterNot { it == message }
                    }
                }
            }
        }
    }



    val currentDestination: NavDestination?
        @Composable get() = navController.currentBackStackEntryAsState().value?.destination

    val currentTopLevelDestination: TopLevelDestination
        @Composable get() {
            topLevelDestinations.firstOrNull { it.route == currentDestination?.route }
                ?.let { _currentTopLevelDestination = it }
            return _currentTopLevelDestination
        }

    val shouldShowBottomBar: Boolean
        @Composable get() = currentDestination?.route == currentTopLevelDestination.route
//        @Composable get() {
////            currentDestination?.route == currentTopLevelDestination.route
//            val currentDestination = currentDestination
//            return currentDestination?.route in topLevelDestinations.map { it.route }
//        }


    val topLevelDestinations = TopLevelDestination.entries.toTypedArray()

    private var _currentTopLevelDestination by mutableStateOf(startDestination)

    private val snackbarMessages = MutableStateFlow<List<String>>(emptyList())

    fun navigate(destination: MovieVistaNavigationDestination, route: String? = null) =
        with(navController) {
            if (destination is TopLevelDestination) {
                navigate(route ?: destination.route) {
                    popUpTo(graph.findStartDestination().id) {
                        saveState = true
                    }
                    launchSingleTop = true
                    restoreState = true
                }
            } else {
                navigate(route ?: destination.route)
            }
        }

    fun onBackClick() = navController.popBackStack()

//    fun setSystemBarsColor(color: Color) = systemUiController.setSystemBarsColor(color = color)

    fun showMessage(message: String) = snackbarMessages.update { it + message }


    }