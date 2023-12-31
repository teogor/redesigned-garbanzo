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

package dev.teogor.ceres.firebase.crashlytics

import androidx.compose.runtime.Composable
import com.google.firebase.crashlytics.FirebaseCrashlytics
import javax.inject.Inject

/**
 * Implementation of `AnalyticsHelper` which logs events to a Firebase backend.
 */
class FirebaseCrashlyticsHelper @Inject constructor(
  private val firebaseCrashlytics: FirebaseCrashlytics,
) : CrashlyticsHelper {
  override var crashInfoLegacy: CrashInfoLegacy? = null

  override fun logEvent(event: CrashlyticsEvent) {
    // firebaseCrashlytics.logEvent(event.type) {
    //   for (extra in event.extras) {
    //     // Truncate parameter keys and values according to firebase maximum length values.
    //     param(
    //       key = extra.key.take(40),
    //       value = extra.value.take(100),
    //     )
    //   }
    // }
  }

  @Composable
  override fun SetCrash(it: CrashInfoLegacy) {
    crashInfoLegacy = it
  }
}
