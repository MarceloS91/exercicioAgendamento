package com.example.exercicioagendamento.View

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.exercicioagendamento.R


class ScreenLogin : Fragment(R.layout.fragment_login) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.buttonLogin).setOnClickListener {
            findNavController().navigate(R.id.actionScreenLoginToScreenLogar)
        }
        view.findViewById<Button>(R.id.buttonCadastrar).setOnClickListener {
            findNavController().navigate(R.id.actionScreenLoginToScreenCadastro)
        }

    }

}

