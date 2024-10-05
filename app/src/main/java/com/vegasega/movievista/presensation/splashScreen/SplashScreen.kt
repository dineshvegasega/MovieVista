package com.vegasega.movievista.presensation.splashScreen

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandHorizontally
import androidx.compose.animation.shrinkHorizontally
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.vegasega.movievista.R
import com.vegasega.movievista.navigation.MovieVistaAppState
import com.vegasega.movievista.navigation.rememberMovieVistaAppState
import com.vegasega.movievista.presensation.homeScreen.HomeScreen
import kotlinx.coroutines.delay


@Composable
internal fun SplashRoute(
//    navController: NavHostController,
    onLogin: () -> Unit,
) {
    SplashScreen(
        onLogin = onLogin
    )
}


@Composable
fun SplashScreen(
    appState: MovieVistaAppState = rememberMovieVistaAppState(),
    onLogin: () -> Unit,
) {
//    var visible by remember { mutableStateOf(false) }

//    onLogin = onLogin()
//    LaunchedEffect(key1 = true) {
//        onLogin = onLogin
//    }

//    appState.shouldShowBottomBar = false

    LaunchedEffect(key1 = true) {

        delay(500)
//        visible = true
//        delay(2000)
//        visible = false
        delay(1000)
//        navController.popBackStack()
//        navController.navigate(Screen.Main.route)

        onLogin()
    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        AnimatedVisibility(
            visible = true,
            enter = expandHorizontally { 20 },
            exit = shrinkHorizontally(
                animationSpec = tween(),
                shrinkTowards = Alignment.End,
            )
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Image(
                    modifier = Modifier.size(150.dp, 150.dp),
                    painter = painterResource(id = R.drawable.ic_splash),
                    contentDescription = "",
                )

                Spacer(modifier = Modifier.padding(0.dp, 10.dp))

                Text(
                    text = stringResource(id = R.string.app_name),
                    color = MaterialTheme.colors.onPrimary,
                    style = TextStyle(
                        fontSize = 30.sp,
                        fontFamily = FontFamily.Serif,
                        textAlign = TextAlign.Center,
                    ),
                )
            }
        }
    }
}