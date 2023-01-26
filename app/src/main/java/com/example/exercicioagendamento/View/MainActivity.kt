package com.example.exercicioagendamento.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exercicioagendamento.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.hide()
    }
}