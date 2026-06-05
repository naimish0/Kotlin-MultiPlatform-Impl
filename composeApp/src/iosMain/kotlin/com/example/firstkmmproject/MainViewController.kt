package com.example.firstkmmproject

import NativeViewFactory
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.window.ComposeUIViewController


val LocalNativeViewFactory = staticCompositionLocalOf<NativeViewFactory> {
    error("NO View factory Provided")
}
fun MainViewController(nativeViewFactory: NativeViewFactory) = ComposeUIViewController {
    CompositionLocalProvider(LocalNativeViewFactory provides nativeViewFactory) {
        App(remember {  BatteryManager() } )
    }
}