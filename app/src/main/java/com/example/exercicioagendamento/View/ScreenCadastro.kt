package com.example.exercicioagendamento.View

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.exercicioagendamento.R

class ScreenCadastro : Fragment(R.layout.fragment_cadastro) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val nickname = view.findViewById<EditText>(R.id.editTextCadastroNomeUsuario)

        view.findViewById<ImageView>(R.id.buttonCadastro).setOnClickListener {

//Criar uma list//

            var nomeCompleto = view?.findViewById<EditText>(R.id.editTextCadastroNome)?.text.toString()

            var dataNascimento = view?.findViewById<EditText>(R.id.editTextCadastroDataNascimento)?.text.toString()

            var cpf = view?.findViewById<EditText>(R.id.editTextCadastroCPF)?.text.toString()

            var rg = view?.findViewById<EditText>(R.id.editTextTextCadastroRG)?.text.toString()

            var logradouro = view?.findViewById<EditText>(R.id.editTextCadastroLogradouro)?.text.toString()

            var bairro = view?.findViewById<EditText>(R.id.editTextCadastroBairro)?.text.toString()

            var cidade = view?.findViewById<EditText>(R.id.editTextCadastroCidade)?.text.toString()

            var estado = view?.findViewById<EditText>(R.id.editTextCadastroEstado)?.text.toString()

            var cep = view?.findViewById<EditText>(R.id.editTextCep)?.text.toString()

            var numerocelular = view?.findViewById<EditText>(R.id.editTextCelular)?.text.toString()

            var email = view?.findViewById<EditText>(R.id.editTextCadastroEmail)?.text.toString()

            var nomeUsuario = view?.findViewById<EditText>(R.id.editTextCadastroNomeUsuario)?.text.toString()

            if (nomeCompleto.isEmpty() || dataNascimento.isEmpty() || cpf.isEmpty() || rg.isEmpty() || logradouro.isEmpty() || bairro.isEmpty() ||
                cidade.isEmpty() || estado.isEmpty() || cep.isEmpty() || numerocelular.isEmpty() || email.isEmpty() || nomeUsuario.isEmpty()
            ) {
                Toast.makeText(getActivity(), "Preencha todos os campos!", Toast.LENGTH_SHORT)
                    .show()

            } else {

                val action = ScreenCadastroDirections.actionScreenCadastroToScreenEscolherServico("${nickname.text}")

                findNavController().navigate(action)
            }
        }
    }
}