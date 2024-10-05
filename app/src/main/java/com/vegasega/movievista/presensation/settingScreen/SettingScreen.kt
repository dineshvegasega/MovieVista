package com.vegasega.movievista.presensation.settingScreen

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.vegasega.movievista.theme.MovieVistaTheme

@Composable
internal fun SettingRoute(

) {
    SettingScreen(

    )
}


@Composable
fun SettingScreen() {
    Text(
        text = "SettingScreen",
        style = MovieVistaTheme.typography.semiBold.h1,
        color = MovieVistaTheme.colors.whiteGrey
    )
}