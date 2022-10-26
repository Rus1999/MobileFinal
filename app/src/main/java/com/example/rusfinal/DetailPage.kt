package com.example.rusfinal

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import java.lang.reflect.Modifier

@Composable
fun DetailPage(navController: NavController){

    Column(modifier = androidx.compose.ui.Modifier
        .fillMaxWidth()
    ) {
        Column(){
            Image(
                painter = painterResource(R.drawable.arrow),
                contentDescription = "back",
                modifier = androidx.compose.ui.Modifier
                    .padding(0.dp, 0.dp, 170.dp, 0.dp)
                    .width(21.dp)
                    .height(21.dp)
                    .clickable { navController.navigate("ListPage")}
            )
        }
        Column(){
            Text(text = "I love ANDROID KOTLIN TOO MUCH", fontSize = 24.sp)
        }
    }
}