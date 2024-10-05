package com.vegasega.movievista.presensation.detailScreen

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.vegasega.movievista.theme.MovieVistaTheme


@Composable
internal fun DetailRoute(

) {
    DetailScreen(

    )
}

@Composable
fun DetailScreen(
) {
    Text(
        text = "DetailScreen",
        style = MovieVistaTheme.typography.semiBold.h1,
        color = MovieVistaTheme.colors.whiteGrey
    )
}