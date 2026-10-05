package com.hugo.mybutton1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Añadimos una variable nombre button y tipo Button
        val input = findViewById<EditText>(R.id.inputTexto)
        val boton = findViewById<Button>(R.id.boton)
        val resultado = findViewById<TextView>(R.id.textoResultado)

        boton.setOnClickListener {
            resultado.text = input.text.toString()
        }
    }
}