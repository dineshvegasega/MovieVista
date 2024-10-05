package com.vegasega.movievista.theme

import androidx.compose.foundation.LocalIndication
import androidx.compose.material.ripple.LocalRippleTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable

@Composable
fun MovieVistaTheme(
    colorScheme: ColorScheme = DarkColorScheme,
    shapes: Shapes = Shapes,
    typography: Typography = Typography,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = colorScheme,
        shapes = shapes,
        typography = typography
    ) { ProvideMovieVistaThemeDependencies(content = content) }
}

@Composable
private fun ProvideMovieVistaThemeDependencies(content: @Composable () -> Unit) {
    CompositionLocalProvider(
        LocalMovieVistaColors provides MovieVistaColors(),
        LocalMovieVistaShapes provides MovieVistaShapes(),
        LocalMovieVistaTypography provides MovieVistaTypography(),
        LocalMovieVistaSpacing provides MovieVistaSpacing(),
//        LocalIndication provides rememberMovieVistaRipple(),
//        LocalRippleTheme provides MovieVistaRippleTheme
    ) {
        ProvideTextStyle(value = MovieVistaTheme.typography.regular.h4, content = content)
    }
}



object MovieVistaTheme {
    val colors: MovieVistaColors
        @Composable
        @ReadOnlyComposable
        get() = LocalMovieVistaColors.current

    val shapes: MovieVistaShapes
        @Composable
        @ReadOnlyComposable
        get() = LocalMovieVistaShapes.current

    val typography: MovieVistaTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalMovieVistaTypography.current

    val spacing: MovieVistaSpacing
        @Composable
        @ReadOnlyComposable
        get() = LocalMovieVistaSpacing.current
}
