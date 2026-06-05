package com.example.firstkmmproject

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
expect fun NativeButton(
    onclick: () -> Unit, modifier: Modifier
)