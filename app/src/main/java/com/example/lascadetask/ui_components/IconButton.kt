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
import androidx.compose.ui.unit.dp

@Composable
fun MyIconButton() {
    IconButton(
        onClick = { },
        modifier = Modifier
            .size(48.dp)
            .clip(CircleShape)
            .background(Color(0x2B2C2FB2))
    ) {
        Icon(
            imageVector = Icons.Default.MoreVert,
            contentDescription = "MoreButton",
            tint = Color.White
        )
    }
}
