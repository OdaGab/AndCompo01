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
            mult(20,2)
            div(5,2)
            divInt(5,2)
            Quadrado(5,2)


        }
    }
}
@Composable
fun soma(a:Int, b:Int){
    val som = a + b
    Text(
        text = "\nA soma de $a + $b é $som !"
    )
}
@Composable
fun sub(a:Int, b:Int){
    val som = a - b
    Text(
        text = "\n\nO resultado da Subtração de $a - $b é $som !"
    )
}
@Composable
fun mult(a:Int, b:Int){
    val som = a * b
    Text(
        text = "\n\n\nO resultado da Multiplicação de $a x $b é $som !"
    )
}
@Composable
fun div(a:Int, b:Int){
    val som = a / b
    Text(
        text = "\n\n\n\nO resultado da Divisão de $a / $b é $som !"
    )
}
@Composable
fun divInt(a:Int, b:Int){
    val som = a // b
    Text(
        text = "\n\n\n\n\nO resultado da Divisão inteira de $a // $b é $som !"
    )
}
@Composable
fun Quadrado(a:Int, b:Int){
    val som = a * a
    Text(
        text = "\n\n\n\n\n\nO resultado de $a ao quadrado é $som !"
    )
}
