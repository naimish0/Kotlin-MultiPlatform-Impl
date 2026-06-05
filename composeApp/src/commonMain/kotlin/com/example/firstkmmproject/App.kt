package com.example.firstkmmproject

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.painterResource

import firstkmmproject.composeapp.generated.resources.Res
import firstkmmproject.composeapp.generated.resources.bill_invoice_ui_svgrepo_com_2
import firstkmmproject.composeapp.generated.resources.compose_multiplatform

@Composable
fun App(batteryManager: BatteryManager) {
    MaterialTheme {
        Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally)
        {
            var counter by remember {
                mutableStateOf(0)
            }
            Image(painterResource(Res.drawable.bill_invoice_ui_svgrepo_com_2), null)
            Spacer(Modifier.height(20.dp))
            Text("Battery Level: ${batteryManager.getBatteryLevel()}")
            Spacer(Modifier.height(10.dp))
            NativeButton(onclick = {
                counter++
            }, modifier = Modifier)
            Spacer(Modifier.height(10.dp))
            Text(counter.toString())
        }
    }
}