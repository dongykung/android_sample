package com.andlife.navigation3sample.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.ui.NavDisplay
import com.andlife.impl.navigation.articlesEntryProvider
import com.andlife.impl.navigation.favoriteEntryProvider
import com.andlife.impl.navigation.settingEntryProvider
import com.andlife.navigation3sample.navigation.TOP_LEVEL_NAV_ITEMS
import com.andlife.navigator.Navigator
import com.andlife.navigator.toEntries

@Composable
fun SampleApp(
    navigator: Navigator
) {
    NavigationSuiteScaffold(
        navigationSuiteItems = {
            TOP_LEVEL_NAV_ITEMS.forEach { (key, item) ->
                val selected = key == navigator.state.currentTopLevelKey
                item(
                    selected = selected,
                    onClick = { navigator.navigate(key) },
                    icon = {
                        if (selected) {
                            Icon(
                                imageVector = item.selectedIcon,
                                contentDescription = stringResource(item.iconTextId)
                            )
                        } else {
                            Icon(
                                imageVector = item.unselectedIcon,
                                contentDescription = stringResource(item.iconTextId)
                            )
                        }
                    },
                    label = { Text(stringResource(item.titleTextId)) }
                )
            }
        }
    ) {
        Scaffold() {

            val entryProvider = entryProvider {
                articlesEntryProvider()
                favoriteEntryProvider()
                settingEntryProvider()
            }

            NavDisplay(
                modifier = Modifier.padding(it),
                entries = navigator.state.toEntries(entryProvider),
                onBack = navigator::onBack
            )
        }
    }
}