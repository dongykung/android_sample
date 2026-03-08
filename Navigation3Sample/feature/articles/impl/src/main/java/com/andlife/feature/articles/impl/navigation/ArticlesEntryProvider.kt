package com.andlife.feature.articles.impl.navigation

import androidx.compose.material3.Text
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavKey
import com.andlife.feature.articles.api.ArticlesNavKey

fun EntryProviderScope<NavKey>.articlesEntryProvider() {
    entry<ArticlesNavKey> {
        Text("Articles")
    }
}
