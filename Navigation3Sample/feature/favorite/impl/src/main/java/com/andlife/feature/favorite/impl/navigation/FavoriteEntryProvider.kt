package com.andlife.feature.favorite.impl.navigation

import androidx.compose.material3.Text
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavKey
import com.andlife.feature.favorite.api.FavoriteNavKey

fun EntryProviderScope<NavKey>.favoriteEntryProvider() {
    entry<FavoriteNavKey> {
        Text("Favorite")
    }
}
