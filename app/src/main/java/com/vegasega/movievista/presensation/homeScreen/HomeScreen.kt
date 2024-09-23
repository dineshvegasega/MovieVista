package com.vegasega.movievista.presensation.homeScreen

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable


@Composable
internal fun HomeRoute(
//    onSeeAllClick: (com.maximillianleonov.MovieVista.core.model.MediaType.Common) -> Unit,
//    onMovieClick: (Int) -> Unit,
//    onTvShowClick: (Int) -> Unit,
//    modifier: Modifier = Modifier,
//    viewModel: HomeViewModel = hiltViewModel()
) {
//    val uiState by viewModel.uiState.collectAsStateWithLifecycle()
    HomeScreen(
//        uiState = uiState,
//        onSeeAllClick = onSeeAllClick,
//        onMovieClick = onMovieClick,
//        onTvShowClick = onTvShowClick,
//        onRefresh = { viewModel.onEvent(HomeEvent.Refresh) },
//        onRetry = { viewModel.onEvent(HomeEvent.Retry) },
//        onOfflineModeClick = { viewModel.onEvent(HomeEvent.ClearError) },
//        modifier = modifier
    )
}



@Composable
fun HomeScreen() {
    Text(text = "HomeScreen")
}