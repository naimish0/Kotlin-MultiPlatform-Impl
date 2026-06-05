package com.example.firstkmmproject

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.UIKitViewController

@Composable
actual fun NativeButton(onclick: () -> Unit, modifier: Modifier) {
    val factory = LocalNativeViewFactory.current
    UIKitViewController(
        modifier = modifier,
        factory = {
            factory.createButtonView("IOS button", onclick)
        }
    )
}