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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
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
fun SaveRouteSheet(currentSheet: MutableState<Int>){
    Column (
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .height(262.dp)
            .background(Color(0xFF000000))
            .padding(16.dp),

        ){
        //Back button-----------
        Row (
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ){

            MyIconButton(icon = Icons.Default.ArrowBack, bgColor = Color.White, iColor = Color.Black, onClick = {
                currentSheet.value =2
            })
            Spacer(Modifier.width(12.dp))
            Text("Save route", color = Color.White, fontSize = 16.sp, fontWeight = FontWeight.Bold)
        }
        //TextField=============
        TextField(
            value = "",
            onValueChange = {  },
            label = { Text("  Enter route name") },
            shape = RoundedCornerShape(30.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp),
            colors = TextFieldDefaults.colors(
                focusedContainerColor =Color.DarkGray.copy(alpha =0.5f),
                unfocusedContainerColor = Color.DarkGray.copy(alpha =0.5f),
                focusedIndicatorColor = Color.DarkGray.copy(alpha =0.5f),
               unfocusedIndicatorColor = Color.DarkGray.copy(alpha =0.5f)
            ),
            singleLine = true
        )
        //Save elevated button-------
        Box (
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ){
            MyElevatedButton(text = "Save", bgColor = Color(0xFFB97FFF),
                width = 400.dp,
                tSize = 18.sp,
                onClick = {
                    //currentSheet.value = 1
                    currentSheet.value = 8
                }
            )
        }

    }
}