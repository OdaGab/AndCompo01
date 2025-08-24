package com.example.andcompo01
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            soma(1,2)
            sub(20,2)

        }
    }
}
@Composable
fun soma(a:Int, b:Int){
    val som = a + b
    Text(
        text = "\nA soma é $som !"
    )
}


@Composable
fun sub(a:Int, b:Int){
    val som = a - b
    Text(
        text = "O resultado da Subtração é $som !"
    )
}

