/*
 * Copyright 2022 Afig Aliyev
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.vegasega.movievista.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.vegasega.movievista.presensation.detailScreen.detailGraph
import com.vegasega.movievista.presensation.favoriteScreen.favoriteGraph
import com.vegasega.movievista.presensation.homeScreen.HomeDestination
import com.vegasega.movievista.presensation.homeScreen.homeGraph
import com.vegasega.movievista.presensation.loginScreen.LoginDestination
import com.vegasega.movievista.presensation.loginScreen.loginGraph
import com.vegasega.movievista.presensation.registerScreen.RegisterDestination
import com.vegasega.movievista.presensation.registerScreen.registerGraph
import com.vegasega.movievista.presensation.searchScreen.searchGraph
import com.vegasega.movievista.presensation.settingScreen.settingGraph
import com.vegasega.movievista.presensation.splashScreen.splashGraph

@Composable
fun MovieVistaNavHost(
    navController: NavHostController,
    startDestination: MovieVistaNavigationDestination,
    onNavigateToDestination: (MovieVistaNavigationDestination, String) -> Unit,
    onBackClick: () -> Unit,
    onShowMessage: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination.route
    ) {
        splashGraph(
            onNavigateToLoginDestination = {
                navController.popBackStack()
                onNavigateToDestination(LoginDestination, LoginDestination.route)
            },
        )
        loginGraph(
            onNavigateToRegisterDestination = {
//                navController.popBackStack()
                onNavigateToDestination(LoginDestination, RegisterDestination.route)
            },
        )
        registerGraph(
            onNavigateToHomeDestination = {
                navController.popBackStack()
                onNavigateToDestination(LoginDestination, HomeDestination.route)
            },
        )
        homeGraph(
        )
        searchGraph(
        )
        favoriteGraph(
        )
        settingGraph()
        detailGraph(
        )

    }
}
