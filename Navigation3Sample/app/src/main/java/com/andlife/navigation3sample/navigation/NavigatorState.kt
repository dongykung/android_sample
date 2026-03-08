package com.andlife.navigation3sample.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.andlife.api.FavoriteNavKey
import com.andlife.navigator.Navigator
import com.andlife.navigator.rememberNavigationState

@Composable
fun rememberNavigator(): Navigator {
    val navigationState = rememberNavigationState(FavoriteNavKey, TOP_LEVEL_NAV_ITEMS.keys)

    return remember(navigationState) {
        Navigator(navigationState)
    }
}