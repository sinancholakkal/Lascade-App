package com.example.lascadetask.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomSheetScaffold
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SheetValue
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.material3.rememberStandardBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.lascadetask.R
import com.example.lascadetask.ui_components.DeleteRouteSheet
import com.example.lascadetask.ui_components.FirstSheetContent
import com.example.lascadetask.ui_components.RouterSettingsSheetContent
import com.example.lascadetask.ui_components.TopBarItems

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    val sheetState = rememberStandardBottomSheetState(
        initialValue = SheetValue.Expanded,
        skipHiddenState = true
    )                       
    val currentSheet = remember { mutableIntStateOf(1) }
    //BottomSheet-----
    BottomSheetScaffold(
        sheetContent = {
            when(currentSheet.value){
                1-> FirstSheetContent(currentSheet)
                2-> RouterSettingsSheetContent(currentSheet)
                3-> DeleteRouteSheet(currentSheet)
            }
        },
        sheetPeekHeight = 170.dp,
        sheetContainerColor = Color(0xFF000000),
        sheetShape = RectangleShape,
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



