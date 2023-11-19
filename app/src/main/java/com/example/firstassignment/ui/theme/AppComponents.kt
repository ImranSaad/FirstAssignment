package com.example.firstassignment.ui.theme

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Topappbar(Text:String){
            TopAppBar(
                colors = TopAppBarDefaults.largeTopAppBarColors(
                    containerColor = Color( 0xFF760094),
                    titleContentColor = Color.White,
                ),
                title = {
                    Text(text = Text)
                }
            )
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OutlineTextFilled(Text:String){
    var text by remember {
        mutableStateOf("")
    }

    OutlinedTextField(modifier = Modifier.fillMaxWidth()
        .padding(15.dp),
        value = text,
        onValueChange = {text = it},
        label = { Text(text = Text)}
    )
}