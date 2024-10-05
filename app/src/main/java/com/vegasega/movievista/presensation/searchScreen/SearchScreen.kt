package com.vegasega.movievista.presensation.searchScreen

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.vegasega.movievista.theme.MovieVistaTheme


@Composable
internal fun SearchRoute(

) {
    SearchScreen(

    )
}


@Composable
fun SearchScreen(

) {
    Text(
        text = "SearchScreen",
        style = MovieVistaTheme.typography.semiBold.h1,
        color = MovieVistaTheme.colors.whiteGrey
    )
}