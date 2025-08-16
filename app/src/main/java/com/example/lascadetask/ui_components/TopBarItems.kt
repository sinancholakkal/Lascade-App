package com.example.lascadetask.ui_components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.lascadetask.R

@Composable
fun TopBarItems() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 30.dp, start = 14.dp, end = 14.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        ImgButtonFun(width = 87.dp, height = 46.dp, resId = R.drawable.img)
        Row(
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            ImgButtonFun(width = 90.dp, height = 90.dp, resId = R.drawable.img_1)
            ImgButtonFun(width = 90.dp, height = 90.dp, resId = R.drawable.img_2)
        }
    }
}

