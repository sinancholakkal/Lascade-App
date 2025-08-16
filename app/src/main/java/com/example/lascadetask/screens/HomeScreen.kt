package com.example.lascadetask.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.lascadetask.R
import com.example.lascadetask.ui_components.ImgButtonFun
import com.example.lascadetask.ui_components.TopBarItems

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen (){

        Image(
            painter = painterResource(id = R.drawable.map_image),
            contentDescription = "Map Image",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
    TopBarItems()
}

