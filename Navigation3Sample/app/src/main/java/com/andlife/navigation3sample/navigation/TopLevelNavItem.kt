package com.andlife.navigation3sample.navigation

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.Article
import androidx.compose.material.icons.automirrored.rounded.Article
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.rounded.Favorite
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.ui.graphics.vector.ImageVector
import com.andlife.api.ArticlesNavKey
import com.andlife.api.FavoriteNavKey
import com.andlife.api.SettingNavKey
import com.andlife.navigation3sample.R

data class TopLevelNavItem(
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    @StringRes val iconTextId: Int,
    @StringRes val titleTextId: Int
)

val ARTICLES = TopLevelNavItem(
    selectedIcon = Icons.AutoMirrored.Rounded.Article,
    unselectedIcon = Icons.AutoMirrored.Outlined.Article,
    iconTextId = R.string.articles,
    titleTextId = R.string.articles
)

val FAVORITE = TopLevelNavItem(
    selectedIcon = Icons.Rounded.Favorite,
    unselectedIcon = Icons.Outlined.Favorite,
    iconTextId = R.string.favorite,
    titleTextId = R.string.favorite
)

val SETTING = TopLevelNavItem(
    selectedIcon = Icons.Rounded.Settings,
    unselectedIcon = Icons.Outlined.Settings,
    iconTextId = R.string.setting,
    titleTextId = R.string.setting
)

val TOP_LEVEL_NAV_ITEMS = mapOf(
    ArticlesNavKey to ARTICLES,
    FavoriteNavKey to FAVORITE,
    SettingNavKey to SETTING
)