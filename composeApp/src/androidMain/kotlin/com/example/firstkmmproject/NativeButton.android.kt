package com.example.firstkmmproject

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
actual fun NativeButton(onclick: () -> Unit, modifier: Modifier) {
    Button(onclick) {
        Text("Click")
    }
}