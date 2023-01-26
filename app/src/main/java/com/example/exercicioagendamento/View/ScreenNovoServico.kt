package com.example.exercicioagendamento.View

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.exercicioagendamento.R
import com.example.exercicioagendamento.View.ScreenNovoServicoDirections
import kotlinx.android.synthetic.main.fragment_escolherservico.*
import kotlinx.android.synthetic.main.fragment_screen_novo_servico.*


class ScreenNovoServico : Fragment(R.layout.fragment_screen_novo_servico) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setButtonClick()


    }

    fun setButtonClick() {
        buttonEasy2.setOnClickListener {
            var action =
                ScreenNovoServicoDirections.actionScreenNovoServicoToDetalhesServico(
                    4
                )
            findNavController().navigate(action)
        }

        buttonMedium2.setOnClickListener {
            var action =
                ScreenNovoServicoDirections.actionScreenNovoServicoToDetalhesServico(
                    5
                )
            findNavController().navigate(action)

        }

        buttonHard2.setOnClickListener {
            var action =
                ScreenNovoServicoDirections.actionScreenNovoServicoToDetalhesServico(
                    6
                )
            findNavController().navigate(action)
            }
        }
    }
