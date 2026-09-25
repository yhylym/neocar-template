package com.neocar.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NeoCarShell()
        }
    }
}

@Composable
fun NeoCarShell() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF0A0E14))
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "NEO·CAR",
            color = Color(0xFF00E5FF),
            fontSize = 32.sp
        )
        Text(
            text = "车主本地事务终端  V0.1",
            color = Color(0xFF7C4DFF),
            fontSize = 14.sp
        )
        Text(
            text = "模板构建成功",
            color = Color(0xFFC8D3E0),
            fontSize = 12.sp
        )
    }
}
