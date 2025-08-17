package com.example.lascadetask.ui_components

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MyElevatedButton(tColor: Color = Color.Black, bgColor: Color = Color.White,text:String,onClick: () -> Unit = {},width:Dp = 104.dp,height:Dp = 60.dp,tSize: TextUnit= 14.sp) {
    ElevatedButton(
        modifier = Modifier
            .width(width)
            .height(height),
        onClick = onClick,
        colors = ButtonDefaults.elevatedButtonColors(
            containerColor = bgColor,
            contentColor = tColor
        ),

        ) {
        Text(text, fontWeight = FontWeight.Bold, fontSize = tSize)
    }
}