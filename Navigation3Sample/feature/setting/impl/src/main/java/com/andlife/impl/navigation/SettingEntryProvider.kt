package com.andlife.feature.setting.impl.navigation

import androidx.compose.material3.Text
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavKey
import com.andlife.api.SettingNavKey

fun EntryProviderScope<NavKey>. settingEntryProvider() {
    entry<SettingNavKey> {
        Text("Setting")
    }
}