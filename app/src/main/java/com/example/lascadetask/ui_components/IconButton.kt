package com.example.lascadetask.ui_components

import android.provider.CalendarContract.Colors
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun MyIconButton(size:Dp=48.dp, icon: ImageVector,onClick:()->Unit ={},bgColor:Color = Color.DarkGray.copy(alpha =0.5f),iColor: Color=Color.White ) {
    IconButton(
        onClick = onClick,
        modifier = Modifier
            .size(size)
            .clip(CircleShape)
            .background(color = bgColor)
    ) {
        Icon(
            imageVector = icon,
            contentDescription = "MoreButton",
            tint = iColor
        )
    }
}
