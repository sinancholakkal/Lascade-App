package com.example.lascadetask.ui_components

import android.provider.CalendarContract.Colors
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lascadetask.R

@Composable
fun StreetViewSheet(currentSheet: MutableState<Int>){
    var selectedIndex by remember { mutableStateOf(0) }

    val images = listOf(
        R.drawable.img_6,
        R.drawable.img_7,
        R.drawable.img_8
    )
    val streetsName = listOf("Classic","Blueprint","Night")
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .height(312.dp)
            .background(Color(0xFF000000))
            .padding(0.dp),
    ){
        Row (
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ){
            ImgButtonFun(resId = R.drawable.img_5, width = 24.dp, height = 24.dp)
            Spacer(modifier = Modifier.width(12.dp))
            Text("Map style", color = Color.White, fontSize = 22.sp)
        }
        Spacer(modifier = Modifier.height(5.dp))
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround

        ) {
            images.forEachIndexed { index, resId ->
                Column (
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Image(
                        painter = painterResource(id = resId),
                        contentDescription = "Image $index",
                        modifier = Modifier
                            .width(120.dp)
                            .height(100.dp)
                            .padding(8.dp)
                            .clip(RoundedCornerShape(26.dp))
                            .clickable {
                                selectedIndex = index
                            }
                            .then(
                                if (selectedIndex == index) Modifier.border(
                                    width = 2.dp,
                                    color = Color.Red,
                                    shape = RoundedCornerShape(26.dp)
                                ) else Modifier
                            ),
                        contentScale = ContentScale.Crop
                    )
                    Text(streetsName[index], color = Color(0xFFFFFFFF).copy(alpha = 0.6f))

                }

            }
        }
        Row (
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ){
            MyIconButton(icon = Icons.Default.Close, iColor = Color.White, bgColor = Color(
                0xFF776E6E
            ).copy(alpha = 0.6f), size = 56.dp)
            Spacer(modifier = Modifier.width(14.dp))
            MyElevatedButton(text = "Applay", width = 264.dp, bgColor = Color(0xFFB97FFF), tColor = Color.White, tSize = 18.sp, onClick = {
                currentSheet.value =1
            })
        }
    }
}