package com.example.lascadetask.ui_components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.RadioButtonColors
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.ui.draw.scale
import com.example.lascadetask.ui_components.MyElevatedButton

@Composable
fun SingleSelectList() {
    val options = listOf("Kochi - Los Angels", "Dubai trip", "Kochi - Los Angels")
    var selectedIndex by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(0.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        options.forEachIndexed { index, label ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(30.dp))
                    .background(Color(0xFF2C2C2C))
                    .clickable { selectedIndex = index }
                    .padding(horizontal = 16.dp, vertical = 20.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = label,
                    color = Color.White,
                    fontSize = 16.sp
                )

                Box(
                    modifier = Modifier
                        .size(24.dp)
                        .scale(1.3f),
                    contentAlignment = Alignment.Center
                ) {
                    if (selectedIndex == index) {
                        Box(
                            modifier = Modifier.size(24.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = Icons.Default.CheckCircle,
                                contentDescription = null,
                                tint = Color.Black,
                                modifier = Modifier.size(24.dp)
                            )
                            Icon(
                                imageVector = Icons.Default.Check,
                                contentDescription = "Tick",
                                tint = Color.White,
                                modifier = Modifier.size(14.dp)
                            )
                        }

                    } else {
                        RadioButton(
                            selected = false,
                            onClick = { selectedIndex = index },
                            modifier = Modifier.scale(1.1f),
                            colors = RadioButtonDefaults.colors(
                                selectedColor = Color(0xFFBB86FC),
                                unselectedColor = Color.Black,
                                disabledSelectedColor = Color.Black,
                                disabledUnselectedColor = Color.Black
                            )
                        )
                    }
                }
            }
        }


    }
}
