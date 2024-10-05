package com.vegasega.movievista.presensation.registerScreen

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.vegasega.movievista.theme.MovieVistaTheme


@Composable
internal fun RegisterRoute(
    onHome: () -> Unit,
) {
    RegisterScreen(
        onHome = onHome
    )
}


@Composable
fun RegisterScreen(
    onHome :() -> Unit
) {
    Text(
        text = "RegisterScreen",
        style = MovieVistaTheme.typography.semiBold.h1,
        color = MovieVistaTheme.colors.whiteGrey
    )
}