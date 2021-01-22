/*
 * Copyright 2021 The Android Open Source Project
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

package com.example.compose.jetchat.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.luminance

enum class OverrideColor(
    val title: String,
    val color: Color,
    val onColor: Color = if (color.luminance() > 0.5) Color.Black else Color.White
) {
    NONE("Default", Color.Transparent),
    // TODO: use nicer colors
    BLUE("Blue", Color.Blue),
    YELLOW("Yellow", Color.Yellow),
    GREEN("Green", Color.Green)
}