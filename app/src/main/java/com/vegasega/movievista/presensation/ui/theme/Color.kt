package com.vegasega.movievista.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

private val Dark = Color(0xFF1F1D2B)
private val Soft = Color(0xFF252836)
private val BlueAccent = Color(0xFF12CDD9)
private val Green = Color(0xFF22B07D)
private val Orange = Color(0xFFFF8700)
private val Red = Color(0xFFFB4141)
private val Black = Color(0xFF171725)
private val Grey = Color(0xFF92929D)
private val DarkGrey = Color(0xFF696974)
private val White = Color(0xFFFFFFFF)
private val WhiteGrey = Color(0xFFEBEBEF)
private val LineDark = Color(0xFFEAEAEA)

internal val DarkColorScheme = darkColorScheme(
    primary = Dark,
    secondary = Soft,
    background = Dark,
    surface = Dark
)

@Immutable
data class MovieVistaColors(
    val default: Color = Color.Unspecified,
    val primaryDark: Color = Dark,
    val primarySoft: Color = Soft,
    val primaryBlue: Color = BlueAccent,
    val secondaryGreen: Color = Green,
    val secondaryOrange: Color = Orange,
    val secondaryRed: Color = Red,
    val white: Color = White,
    val whiteGrey: Color = WhiteGrey,
    val black: Color = Black,
    val grey: Color = Grey,
    val darkGrey: Color = DarkGrey,
    val lineDark: Color = LineDark
)

internal val LocalMovieVistaColors = staticCompositionLocalOf { MovieVistaColors() }
