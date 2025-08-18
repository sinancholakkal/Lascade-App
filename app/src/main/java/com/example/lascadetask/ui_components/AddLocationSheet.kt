package com.example.lascadetask.ui_components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lascadetask.R
import com.example.lascadetask.Repo.LocationModel

@Composable
fun AddLocationSheet(currentSheet: MutableState<Int>){
    var modelList = listOf(
        LocationModel(location = "New York", landMark = "London, United kingdom"),
        LocationModel(location = "Heathrow LHR", landMark = "London, United kingdom"),
        LocationModel(location = "Stansted STN", landMark = "London, United kingdom"),
        LocationModel(location = "Heathrow LHR", landMark = "London, United kingdom"),

    )
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .height(800.dp)
            .background(Color(0xFF000000))
            .padding(0.dp),

        ) {
        Text("Add location", color = Color.White, fontSize = 22.sp, fontWeight = FontWeight.Bold)
        Spacer(Modifier.height(20.dp))
        //TextField--
        TextField(
            value = "",
            onValueChange = {  },
            label = { Text("Enter Point") },
            shape = RoundedCornerShape(30.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .border(2.dp, Color(0xFFB7B7B7), RoundedCornerShape(30.dp)),
            colors = TextFieldDefaults.colors(
                focusedContainerColor =Color.DarkGray.copy(alpha =0.5f),
                unfocusedContainerColor = Color.DarkGray.copy(alpha =0.5f),
                focusedIndicatorColor = Color.DarkGray.copy(alpha =0.5f),
                unfocusedIndicatorColor = Color.DarkGray.copy(alpha =0.5f)
            ),
            singleLine = true,
            leadingIcon = {
                ImgButtonFun(resId = R.drawable.img_4, height = 30.dp, width = 30.dp)
            }

        )
        Spacer(modifier = Modifier.height(10.dp))
        androidx.compose.foundation.lazy.LazyColumn {
            items(modelList.size) { index ->
                val item = modelList[index]
                Column (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                        .clickable {
                            currentSheet.value = 1
                        },
                    horizontalAlignment = Alignment.Start
                ){
                    Text(item.location, color = Color.White, fontSize = 20.sp, fontWeight = FontWeight.Bold)
                    Spacer(modifier = Modifier.height(13.dp))
                    Text(item.landMark, color = Color(0xFFFFFFFF).copy(alpha = 0.6f), fontSize = 16.sp)
                }
            }
        }


    }
}