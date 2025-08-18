package com.example.lascadetask.ui_components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun ImgButtonFun(
    resId: Int,
    width: Dp,
    height: Dp,
    ps: Dp = 0.dp,
    pe: Dp = 0.dp,
    pt: Dp = 0.dp,
    pb: Dp = 0.dp,
    onClick: () -> Unit ={}
) {
    Image(
        painter = painterResource(id = resId),
        contentDescription = "",
        modifier = Modifier
            .size(width = width, height = height)
            .padding(start = ps, end = pe, top = pt, bottom = pb)
            .clickable { onClick() }
    )
}
