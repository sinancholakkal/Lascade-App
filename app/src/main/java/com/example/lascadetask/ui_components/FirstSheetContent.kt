package com.example.lascadetask.ui_components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Icon
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
 fun FirstSheetContent(currentSheet: MutableState<Int>) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(170.dp)
            .background(Color(0xFF000000))
            .padding(16.dp),

        verticalArrangement = Arrangement.SpaceBetween

    ) {
        //First row
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            //MoreVert icon button--------
            MyIconButton(icon = Icons.Default.MoreVert,
                onClick = {
                    currentSheet.value = 2
                }
            )
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    "Kochi - Los Angels",
                    color = Color.White,

                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(Modifier.height(5.dp))
                Text(
                    "2 Points",
                    color = Color.Gray,

                    fontSize = 12.sp
                )
            }
            //Add icon button
            MyIconButton(icon = Icons.Default.Add, onClick = {
                currentSheet.value = 6
            })
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .width(336.dp)
                .height(60.dp)

                .border(
                    width = 2.dp,                // border thickness
                    color = Color.Black,         // border color
                    shape = RoundedCornerShape(30.dp) // rounded corners
                )
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(30.dp) // same shape as border
                )

        ) {
            Row(
                modifier = Modifier
                    .padding(
                        horizontal = 22.dp
                    )
                    .fillMaxSize(),

                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    "Create video",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
                Icon(
                    imageVector = Icons.Default.ArrowForward,
                    contentDescription = "Forward button in bottomSheet",
                    tint = Color(0x1B1E244D),
                    modifier = Modifier.size(24.dp)
                )
            }
        }
    }
}
