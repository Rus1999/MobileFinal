package com.example.rusfinal

import android.app.Fragment
import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.rusfinal.MainActivity


@Composable
fun ListPage(navController: NavController){

    Column(modifier = Modifier
        .verticalScroll(rememberScrollState())
    ){
        Column(modifier = Modifier
            .padding(0.dp, 20.dp)
            .fillMaxWidth()
            .background(Color.LightGray)
            .clickable {
                navController.navigate("DetailPage")}

        ){
            Text(modifier = Modifier
                .padding(20.dp),
                text = "63410040 WATTANACHAI MANEEKHAM")
        }
        Column(modifier = Modifier
            .padding(0.dp, 20.dp)
            .fillMaxWidth()
            .background(Color.LightGray)
            .clickable { navController.navigate("DetailPage") }
        ) {
            Text(modifier = Modifier
                .padding(20.dp),
                text = "63410043 CHETHAMAS PHAICHAN")
        }
        Column(modifier = Modifier
            .padding(0.dp, 20.dp)
            .fillMaxWidth()
            .background(Color.LightGray)
            .clickable { navController.navigate("DetailPage") }
        ) {
            Text(modifier = Modifier
                .padding(20.dp),
                text = "63410075 KASIPAT JANSOON")
        }
        Column(modifier = Modifier
            .padding(0.dp, 20.dp)
            .fillMaxWidth()
            .background(Color.LightGray)
            .clickable { navController.navigate("DetailPage") }
        ) {
            Text(modifier = Modifier
                .padding(20.dp),
                text = "63410077 SUTANAI WANMAHACHAI")
        }
        Column(modifier = Modifier
            .padding(0.dp, 20.dp)
            .fillMaxWidth()
            .background(Color.LightGray)
            .clickable { navController.navigate("DetailPage") }
        ) {
            Text(modifier = Modifier
                .padding(20.dp),
                text = "63410154 PUNYARIT KLAPHACHON")
        }
        Column(modifier = Modifier
            .padding(0.dp, 20.dp)
            .fillMaxWidth()
            .background(Color.LightGray)
            .clickable { navController.navigate("DetailPage") }
        ) {
            Text(modifier = Modifier
                .padding(20.dp),
                text = "63410156 RATCHAPHUMPHOUG PHONTHAI")
        }
    }
}
