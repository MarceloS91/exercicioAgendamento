package com.example.exercicioagendamento.View

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.exercicioagendamento.R
import kotlinx.android.synthetic.main.fragment_escolherservico.*

class ScreenEscolherServico : Fragment(R.layout.fragment_escolherservico) {

    private val args: ScreenEscolherServicoArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setButtonClick()

        view.findViewById<TextView>(R.id.textViewReceberNome).text = "${args.nickname}"
    }

            fun setButtonClick() {
                buttonEasy.setOnClickListener {
                    var action =
                        ScreenEscolherServicoDirections.actionScreenEscolherServicoToScreenDetalhesServico(
                            1
                        )
                    findNavController().navigate(action)
                }

                buttonMedium.setOnClickListener {
                    var action =
                        ScreenEscolherServicoDirections.actionScreenEscolherServicoToScreenDetalhesServico(
                            2
                        )
                    findNavController().navigate(action)

                }

                buttonHard.setOnClickListener {
                    var action =
                        ScreenEscolherServicoDirections.actionScreenEscolherServicoToScreenDetalhesServico(
                            3
                        )
                    findNavController().navigate(action)
                }
            }
        }

