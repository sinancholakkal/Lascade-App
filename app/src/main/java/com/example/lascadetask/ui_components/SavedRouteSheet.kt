package com.example.lascadetask.ui_components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.lascadetask.R
import kotlinx.coroutines.delay

@Composable
fun SavedRouteSheet(currentSheet: MutableState<Int>){
    LaunchedEffect(Unit) {
        delay(3000)
        currentSheet.value = 1
    }
    Column (
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .height(262.dp)
            .background(Color(0xFF000000))
            .padding(16.dp),
    ){
        Image(
            modifier = Modifier
                .width(250.dp)
                .height(40.dp),
            painter = painterResource(id = R.drawable.img_9),
            contentDescription = "My image"
        )
        Spacer(modifier = Modifier.height(22.dp))

    }
}