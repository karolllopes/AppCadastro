package com.example.appcadastro

import android.app.Activity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import android.widget.Toast

class MainActivity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this, "Bem vindo na aula de Pam2", Toast.LENGTH_SHORT).show()
        val view = TextView(this)
        view.setText("Frutas")
        setContentView(R.layout.activity_main)
    }
}