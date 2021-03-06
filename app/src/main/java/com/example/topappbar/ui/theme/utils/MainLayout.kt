package com.example.topappbar.ui.theme.utils

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.topappbar.R

@Preview
@Composable
fun MainLayout() {
    Column {
        ToolbarMs()
    }
}

@Composable
fun ToolbarMs() {
    TopAppBar(
        title = {
            Text(text = "App Toolbar", color = Color.White)},
        navigationIcon = {
            Icon(painter = painterResource(id = R.drawable.ic_menu), contentDescription = null, tint = Color.White)
        },
        backgroundColor = Color.Red,
    )

}