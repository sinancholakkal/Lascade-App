package com.example.lascadetask.ui_components

import android.graphics.drawable.Icon
import android.provider.CalendarContract.Colors
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun RouterSettingsSheetContent(currentSheet: MutableState<Int>){
    Column (
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .height(170.dp)
            .background(Color(0xFF000000))
            .padding(16.dp),

    ){
        Row (
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ){

            MyIconButton(icon = Icons.Default.Close, bgColor = Color.White, iColor = Color.Black, onClick = {
                currentSheet.value =1
            })
            Spacer(Modifier.width(12.dp))
            Text("Route settings", color = Color.White, fontSize = 16.sp, fontWeight = FontWeight.Bold)
        }
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            MyElevatedButton(text = "Delete", bgColor = Color.Red)
            MyElevatedButton(text = "Save", tColor = Color.White, bgColor = Color.DarkGray.copy(alpha =0.5f))
            MyElevatedButton(text = "Load", tColor = Color.White,  bgColor = Color.DarkGray.copy(alpha =0.5f))
        }
    }
}

