package com.cibertec.l1_proyectousuario

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class FormularioPrincipal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario_principal)

        val btnCrear: Button = findViewById(R.id.btnCrear);
        val btnCancelar: Button = findViewById(R.id.btnCancelar);

        btnCrear.setOnClickListener {
            val welcomeScreen = Intent(this, VentanaBienvenida::class.java)
            startActivity(welcomeScreen)
        }

        btnCancelar.setOnClickListener {
            Toast.makeText(this, "El usuario esta intentando cancelar el registro", Toast.LENGTH_LONG).show();
        }
    }
}