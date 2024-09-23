package com.vegasega.movievista.presensation.ui.navigation

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.vegasega.movievista.R
import com.vegasega.movievista.presensation.ui.navigation.screenDestinations.HomeDestination
import com.vegasega.movievista.presensation.ui.navigation.screenDestinations.SearchDestination
import com.vegasega.movievista.presensation.ui.navigation.screenDestinations.SettingDestination
import com.vegasega.movievista.presensation.ui.navigation.screenDestinations.WishlistDestination

enum class MovieVistaDestination(
    override val route: String,
    override val destination: String,
    @DrawableRes val iconResourceId: Int,
    @StringRes val textResourceId: Int
) : MovieVistaNavigationDestination {
    Home(
        route = HomeDestination.route,
        destination = HomeDestination.destination,
        iconResourceId = R.drawable.ic_home,
        textResourceId = R.string.home
    ),
    Search(
        route = SearchDestination.route,
        destination = SearchDestination.destination,
        iconResourceId = R.drawable.ic_search,
        textResourceId = R.string.search
    ),
    Wishlist(
        route = WishlistDestination.route,
        destination = WishlistDestination.destination,
        iconResourceId = R.drawable.ic_wishlist,
        textResourceId = R.string.wishlist
    ),
    Setting(
        route = SettingDestination.route,
        destination = SettingDestination.destination,
        iconResourceId = R.drawable.ic_settings,
        textResourceId = R.string.settings
    )
}