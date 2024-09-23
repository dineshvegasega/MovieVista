package com.vegasega.movievista.presensation

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
import com.vegasega.movievista.presensation.ui.navigation.MovieVistaDestination
import com.vegasega.movievista.presensation.ui.navigation.MovieVistaNavigationDestination
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch


@Composable
fun rememberCinemaxAppState(
//    systemUiController: SystemUiController = rememberSystemUiController(),
    snackbarHostState: SnackbarHostState = remember { SnackbarHostState() },
    coroutineScope: CoroutineScope = rememberCoroutineScope(),
    navController: NavHostController = rememberNavController(),
    startDestination: MovieVistaDestination = MovieVistaDestination.Home
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
class MovieVistaAppState(
    val snackbarHostState: SnackbarHostState,
    val coroutineScope: CoroutineScope,
    val navController: NavHostController,
    val startDestination: MovieVistaDestination
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

    val currentTopLevelDestination: MovieVistaDestination
        @Composable get() {
            topLevelDestinations.firstOrNull { it.route == currentDestination?.route }
                ?.let { _currentTopLevelDestination = it }
            return _currentTopLevelDestination
        }

    val shouldShowBottomBar: Boolean
        @Composable get() = currentDestination?.route == currentTopLevelDestination.route


    val topLevelDestinations = MovieVistaDestination.entries.toTypedArray()

    private var _currentTopLevelDestination by mutableStateOf(startDestination)

    private val snackbarMessages = MutableStateFlow<List<String>>(emptyList())

    fun navigate(destination: MovieVistaNavigationDestination, route: String? = null) =
        with(navController) {
            if (destination is MovieVistaDestination) {
                navigate(route ?: destination.route) {
                    // Pop up to the start destination of the graph to
                    // avoid building up a large stack of destinations
                    // on the back stack as users select items.
                    popUpTo(graph.findStartDestination().id) {
                        saveState = true
                    }
                    // Avoid multiple copies of the same destination when
                    // reselecting the same item.
                    launchSingleTop = true
                    // Restore state when reselecting a previously selected item.
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
