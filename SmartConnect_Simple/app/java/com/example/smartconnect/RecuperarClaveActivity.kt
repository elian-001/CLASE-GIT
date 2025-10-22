package com.example.smartconnect

import android.app.AlertDialog
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class RecuperarClaveActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recuperar)

        val etCorreo = findViewById<EditText>(R.id.etCorreo)
        val btnEnviar = findViewById<Button>(R.id.btnEnviar)

        btnEnviar.setOnClickListener {
            val mensaje = if (etCorreo.text.isNotEmpty()) {
                "Se ha enviado un correo para recuperar la clave"
            } else {
                "Debe ingresar su correo"
            }
            AlertDialog.Builder(this)
                .setTitle("Recuperar Clave")
                .setMessage(mensaje)
                .setPositiveButton("OK", null)
                .show()
        }
    }
}