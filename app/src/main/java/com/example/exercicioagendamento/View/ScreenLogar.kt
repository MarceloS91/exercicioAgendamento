package com.example.exercicioagendamento.View

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.exercicioagendamento.R

class ScreenLogar : Fragment(R.layout.fragment_logar) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<ImageView>(R.id.buttonLogin).setOnClickListener {

            var login = view?.findViewById<EditText>(R.id.editTextNomeUsuarioLogin)?.text.toString()
            var password = view?.findViewById<EditText>(R.id.editTextSenhaLogin)?.text.toString()

            if (login.isEmpty() || password.isEmpty()) {
                Toast.makeText(getActivity(), "Preencha todos os campos!", Toast.LENGTH_SHORT).show()

            } else {
                val nickname = view.findViewById<EditText>(R.id.editTextNomeUsuarioLogin)
                val action = ScreenLogarDirections.actionScreenLogarToScreenEscolherServico(
                    "${nickname.text}"
                )

                findNavController().navigate(action)

            }
//            findNavController().navigate(action)
        }
    }
}
/*
    fun loginValidation (login: String, password: String): Boolean {
        val sharedPrefEmail =
            activity?.getSharedPreferences("sharedPreferencesFile", Context.MODE_PRIVATE)
                ?.getString("email", null)
        val sharedPrefPassword =
            activity?.getSharedPreferences("sharedPreferencesFile", Context.MODE_PRIVATE)
                ?.getString("password", null)

        return login == sharedPrefEmail && password == sharedPrefPassword
    }
}*/

/* fun loginValidation(login: String, password: String): Boolean {
       val data = args.nickname

       return == data[11] && password == data[12]*/