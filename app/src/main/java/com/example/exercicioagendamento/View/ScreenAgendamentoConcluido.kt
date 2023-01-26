package com.example.exercicioagendamento.View

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.exercicioagendamento.R

class ScreenAgendamentoConcluido : Fragment(R.layout.fragment_agendamento_concluido) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<ImageView>(R.id.buttonAgendamentoConcluido).setOnClickListener {
            findNavController().navigate(R.id.actionAgendamentoConcluidoTohistoricoAgendamentos)

        view.findViewById<TextView>(R.id.textViewAgendamentoConcluido).setOnClickListener {
            findNavController().navigate(R.id.actionAgendamentoConcluidoTohistoricoAgendamentos)

            }
        }
    }
}
