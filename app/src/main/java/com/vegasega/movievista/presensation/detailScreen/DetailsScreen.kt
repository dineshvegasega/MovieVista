package com.vegasega.movievista.presensation.detailScreen

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable



@Composable
internal fun DetailsRoute(
//    onBackButtonClick: () -> Unit,
//    onShowMessage: (String) -> Unit,
//    onSetSystemBarsColorTransparent: () -> Unit,
//    onResetSystemBarsColor: () -> Unit,
//    modifier: Modifier = Modifier,
//    viewModel: DetailsViewModel = hiltViewModel()
) {
//    val uiState by viewModel.uiState.collectAsStateWithLifecycle()
    DetailsScreen(
//        uiState = uiState,
//        onShowMessage = onShowMessage,
//        onRefresh = { viewModel.onEvent(DetailsEvent.Refresh) },
//        onBackButtonClick = onBackButtonClick,
//        onWishlistMovieClick = { viewModel.onEvent(DetailsEvent.WishlistMovie) },
//        onWishlistTvShowClick = { viewModel.onEvent(DetailsEvent.WishlistTvShow) },
//        onRetry = { viewModel.onEvent(DetailsEvent.Retry) },
//        onOfflineModeClick = { viewModel.onEvent(DetailsEvent.ClearError) },
//        onUserMessageDismiss = { viewModel.onEvent(DetailsEvent.ClearUserMessage) },
//        modifier = modifier
    )

//    DisposableEffect(onSetSystemBarsColorTransparent, onResetSystemBarsColor) {
//        onSetSystemBarsColorTransparent()
//        onDispose { onResetSystemBarsColor() }
//    }
}

@Composable
fun DetailsScreen() {
    Text(text = "DetailScreen")
}