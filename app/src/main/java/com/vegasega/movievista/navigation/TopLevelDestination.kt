package com.vegasega.movievista.navigation
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.vegasega.movievista.R
import com.vegasega.movievista.presensation.favoriteScreen.FavoriteDestination
import com.vegasega.movievista.presensation.homeScreen.HomeDestination
import com.vegasega.movievista.presensation.searchScreen.SearchDestination
import com.vegasega.movievista.presensation.settingScreen.SettingDestination

enum class TopLevelDestination(
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
    Favorite(
        route = FavoriteDestination.route,
        destination = FavoriteDestination.destination,
        iconResourceId = R.drawable.ic_wishlist,
        textResourceId = R.string.favorite
    ),
    Settings(
        route = SettingDestination.route,
        destination = SettingDestination.destination,
        iconResourceId = R.drawable.ic_settings,
        textResourceId = R.string.settings
    )
}
