package com.example.myapplication.presentation.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
@Preview
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CurrencyCard() {
    var text1EGP by remember {
        mutableStateOf("")
    }
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(text = "Amount", fontSize = 14.sp, fontWeight = FontWeight(600))
            TextField(
                value = text1EGP,
                onValueChange = { text1EGP = it },
                placeholder = {
                    Text(
                        text = "1 EGP",
                        fontSize = 16.sp,
                        fontWeight = FontWeight(600)
                    )
                }
            )
            Text(text = "From", fontSize = 14.sp, fontWeight = FontWeight(600))
        }
    }
}