package com.example.lascadetask.ui_components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lascadetask.R

@Composable
fun DeleteRouteSheet(currentSheet: MutableState<Int>){
    Column (
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .height(262.dp)
            .background(Color(0xFF000000))
            .padding(16.dp),

        ){
        Row (
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ){

            MyIconButton(icon = Icons.Default.Close, bgColor = Color.White, iColor = Color.Black, onClick = {
                currentSheet.value =2
            })
            Spacer(Modifier.width(12.dp))
            Text("Delete route", color = Color.White, fontSize = 16.sp, fontWeight = FontWeight.Bold)
        }
            Image(
                painter = painterResource(id = R.drawable.img_3),
                contentDescription = "Delete",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(80.dp),
                alignment = Alignment.Center,
                contentScale = ContentScale.FillWidth
            )
        Box (
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ){
            MyElevatedButton(
                text = "Delete",
                bgColor = Color(0xFFEB4E4E),
                width = 336.dp,
                tSize = 18.sp,
                onClick = {
                    currentSheet.value =1
                }
            )
        }

    }
}