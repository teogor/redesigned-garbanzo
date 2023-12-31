/*
 * Copyright 2023 teogor (Teodor Grigor)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.teogor.ceres.ui.designsystem

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults.SecondaryIndicator
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import dev.teogor.ceres.ui.theme.MaterialTheme

/**
 * Ceres tab. Wraps Material 3 [Tab] and shifts text label down.
 *
 * @param selected Whether this tab is selected or not.
 * @param onClick The callback to be invoked when this tab is selected.
 * @param modifier Modifier to be applied to the tab.
 * @param enabled Controls the enabled state of the tab. When `false`, this tab will not be
 * clickable and will appear disabled to accessibility services.
 * @param text The text label content.
 */
@Composable
fun CeresTab(
  selected: Boolean,
  onClick: () -> Unit,
  modifier: Modifier = Modifier,
  enabled: Boolean = true,
  text: @Composable () -> Unit,
) {
  Tab(
    selected = selected,
    onClick = onClick,
    modifier = modifier,
    enabled = enabled,
    text = {
      val style = MaterialTheme.typography.labelLarge.copy(
        textAlign = TextAlign.Center,
      )
      ProvideTextStyle(
        value = style,
        content = {
          Box(modifier = Modifier.padding(top = CeresTabDefaults.TabTopPadding)) {
            text()
          }
        },
      )
    },
  )
}

/**
 * Ceres tab row. Wraps Material 3 [TabRow].
 *
 * @param selectedTabIndex The index of the currently selected tab.
 * @param modifier Modifier to be applied to the tab row.
 * @param tabs The tabs inside this tab row. Typically this will be multiple [CeresTab]s. Each element
 * inside this lambda will be measured and placed evenly across the row, each taking up equal space.
 */
@Composable
fun CeresTabRow(
  selectedTabIndex: Int,
  modifier: Modifier = Modifier,
  containerColor: Color = Color.Transparent,
  tabs: @Composable () -> Unit,
) {
  TabRow(
    selectedTabIndex = selectedTabIndex,
    modifier = modifier,
    containerColor = containerColor,
    contentColor = MaterialTheme.colorScheme.onSurface,
    indicator = { tabPositions ->
      SecondaryIndicator(
        modifier = Modifier.tabIndicatorOffset(tabPositions[selectedTabIndex]),
        height = 2.dp,
        color = MaterialTheme.colorScheme.primary,
      )
    },
    tabs = tabs,
  )
}

object CeresTabDefaults {
  val TabTopPadding = 7.dp
}
