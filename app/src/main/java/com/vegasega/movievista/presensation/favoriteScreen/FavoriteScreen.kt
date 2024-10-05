package com.vegasega.movievista.presensation.favoriteScreen

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.vegasega.movievista.theme.MovieVistaTheme

@Composable
internal fun FavoriteRoute(

) {
    FavoriteScreen(

    )
}

@Composable
fun FavoriteScreen() {
    Text(
        text = "FavoriteScreen",
        style = MovieVistaTheme.typography.semiBold.h1,
        color = MovieVistaTheme.colors.whiteGrey
    )
}