package com.vegasega.movievista.presensation.homeScreen

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.vegasega.movievista.theme.MovieVistaTheme


@Composable
internal fun HomeRoute(

) {
    HomeScreen(

    )
}

@Composable
fun HomeScreen() {
    Text(
        text = "HomeScreen",
        style = MovieVistaTheme.typography.semiBold.h1,
        color = MovieVistaTheme.colors.whiteGrey
    )
}