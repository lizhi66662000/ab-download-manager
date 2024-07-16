package com.abdownloadmanager.desktop.ui.util

import com.abdownloadmanager.desktop.ui.theme.myColors
import com.abdownloadmanager.desktop.ui.WithContentColor
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

@Composable
fun ScreenSurface(
    modifier: Modifier,
    background: Brush,
    contentColor: Color,
    content: @Composable () -> Unit,
) {
    Column(
        modifier
            .background(background)
    ) {
        WithContentColor(contentColor) {
            content()
        }
    }
}

@Composable
fun ScreenSurface(
    modifier: Modifier,
    background: Color,
    contentColor: Color = myColors.getContentColorFor(background),
    content: @Composable () -> Unit,
) {
    Column(
        modifier
            .background(background)
    ) {
        WithContentColor(contentColor) {
            content()
        }
    }
}