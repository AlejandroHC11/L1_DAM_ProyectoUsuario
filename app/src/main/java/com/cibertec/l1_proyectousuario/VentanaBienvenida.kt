package com.cibertec.l1_proyectousuario

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class VentanaBienvenida : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ventana_bienvenida)

        val btnSalir: Button = findViewById(R.id.btnSalir)

        btnSalir.setOnClickListener{
            showDialog();
        }
    }
    private fun showDialog(){
        val dialogConfirm = Dialog(this)
        dialogConfirm.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialogConfirm.setCancelable(false)
        dialogConfirm.setContentView(R.layout.dialog_confirmacion)

        dialogConfirm.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        val btnDialogSi : Button = dialogConfirm.findViewById(R.id.btnDialogSi)
        val btnDialogNo: Button = dialogConfirm.findViewById(R.id.btnDialogNo)

        btnDialogSi.setOnClickListener {
            val FormularioPrincipal = Intent(this, FormularioPrincipal::class.java)
            startActivity(FormularioPrincipal)
        }

        btnDialogNo.setOnClickListener {
            dialogConfirm.dismiss()
        }

        dialogConfirm.show()
    }
}