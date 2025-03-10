package com.example.scaldfolding

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.scaldfolding.ui.theme.ScaldfoldingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ScaldfoldingTheme {
                }
            }
        }
    }
@Preview(showBackground = true)
@Composable
fun prevista(){
    Aplicacion(modifier: Modifier.fillMaxSize())
}

@Composable
fun Aplicacion(modifier: Modifier){
    Scaffold(modifier = Modifier,
        topBar = {
            BarraSuperior()
        },
        bottomBar = {
            Greeting("hola", modifier = Modifier.fillMaxSize().background(Color.Red))
        },
                floatingActionButton = {
                    Text("------------")
                })
    { padding_interior ->
        Column(modifier = Modifier.padding(padding_interior)) {
            Text("Esto es un mensaje del otro mundo")
        }

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BarraSuperior(){
    TopAppBar(title = {
        Text("Titulo de la barra", modifier = Modifier)
    })
}






@Composable
fun BarraInferior(){
    BottomAppBar{
        Row(verticalAlignment = Aligment.CenterVertically){
            Text("")
            Spacer(modifier = Modifier.width(15.dp)) }
    }


@Composable
fun BotonFlotante(al_pusho_picar: () -> Unit){
    FloatingActionButton(onClick = {}) {
        Icon(Icons.Rounded.ShoppingCart, contentDescription = "")
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}
