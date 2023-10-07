package com.example.pmdm02_holamundo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Content()
        }
    }
}


@Preview(showBackground = true)
@Composable
fun Content() {

    Column (modifier = Modifier
    ){
        Row (modifier = Modifier
            .background(MaterialTheme.colorScheme.primary)
            .fillMaxWidth()
            .padding(2.dp),
            horizontalArrangement = Arrangement.Center
        ){
            Titulo("Tarea PGL - Jonathan B")
        }
        Space()
        Row (modifier = Modifier
            .fillMaxSize(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ){
            Texto("Hola Mundo!")
        }
    }
}



@Composable
fun Space() {
    Spacer(modifier = Modifier.height(5.dp))
}

@Composable
fun Texto(texto:String) {
    Text(
        text = texto,
        fontSize = 20.sp
    )
}

@Composable
fun Titulo(texto:String) {
    Text(
        text = texto,
        fontSize = 33.sp,
        color = Color.White,
        textAlign = TextAlign.Center
    )
}