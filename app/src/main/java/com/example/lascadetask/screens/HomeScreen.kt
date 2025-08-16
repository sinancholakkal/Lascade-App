package com.example.lascadetask.screens

import android.provider.CalendarContract.Colors
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lascadetask.R
import com.example.lascadetask.ui_components.MyIconButton
import com.example.lascadetask.ui_components.TopBarItems

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    val sheetState = rememberStandardBottomSheetState(
        initialValue = SheetValue.Expanded,
        skipHiddenState = true
    )

    BottomSheetScaffold(
        sheetContent = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .background(Color(0xFF000000))
                    .padding(16.dp),
                verticalArrangement = Arrangement.Top
            ) {
                Row (
                    horizontalArrangement = Arrangement.spacedBy(8.dp), // small gap
                    verticalAlignment = Alignment.CenterVertically
                ){
                    MyIconButton()
                    Column (
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Text("Kochi - Los Angels",
                            color = Color.White,

                            fontSize = 16.sp
                            )
                        Text("2 Points",
                            color =Color.Gray,

                            fontSize = 12.sp
                        )
                    }
                }
            }
        },
        sheetPeekHeight = 200.dp,
        sheetContainerColor = Color(0xFF000000),
        scaffoldState = rememberBottomSheetScaffoldState(bottomSheetState = sheetState)
    ) { paddingValues ->
        Box(modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)) {

            Image(
                painter = painterResource(id = R.drawable.map_image),
                contentDescription = "Map Image",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )

            TopBarItems()
        }
    }
}


