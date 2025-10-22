package com.example.smartconnect

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etUsuario = findViewById<EditText>(R.id.etUsuario)
        val etClave = findViewById<EditText>(R.id.etClave)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val btnRecuperar = findViewById<Button>(R.id.btnRecuperar)
        val btnRegistrar = findViewById<Button>(R.id.btnRegistrar)

        btnLogin.setOnClickListener {
            if (etUsuario.text.isNotEmpty() && etClave.text.isNotEmpty()) {
                mostrarDialogo("Inicio de sesión", "Bienvenido a SmartConnect")
            } else {
                mostrarDialogo("Error", "Debe ingresar usuario y contraseña")
            }
        }

        btnRecuperar.setOnClickListener {
            startActivity(Intent(this, RecuperarClaveActivity::class.java))
        }

        btnRegistrar.setOnClickListener {
            startActivity(Intent(this, RegistrarCuentaActivity::class.java))
        }
    }

    private fun mostrarDialogo(titulo: String, mensaje: String) {
        AlertDialog.Builder(this)
            .setTitle(titulo)
            .setMessage(mensaje)
            .setPositiveButton("OK", null)
            .show()
    }
}