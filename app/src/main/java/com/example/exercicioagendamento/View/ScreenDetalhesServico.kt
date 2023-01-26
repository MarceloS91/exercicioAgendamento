package com.example.exercicioagendamento.View

import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.exercicioagendamento.R
import com.example.exercicioagendamento.Model.RegistroViewModel
import com.example.exercicioagendamento.databinding.FragmentDetalhesservicoBinding
import kotlinx.android.synthetic.main.fragment_detalhesservico.*

class ScreenDetalhesServico : Fragment(R.layout.fragment_detalhesservico) {

   private val args: ScreenDetalhesServicoArgs by navArgs()
   private lateinit var binding: FragmentDetalhesservicoBinding
   private lateinit var viewModel: RegistroViewModel

   override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
      super.onViewCreated(view, savedInstanceState)

      setDetalhesLevel(args.levelId)

   }

   fun setDetalhesLevel(id: Int) {
      when (id) {
         1 -> receberImagemDificuldade.setImageResource(R.drawable.facil)
         2 -> receberImagemDificuldade.setImageResource(R.drawable.medio)
         3 -> receberImagemDificuldade.setImageResource(R.drawable.dificil)
         4 -> receberImagemDificuldade.setImageResource(R.drawable.facil)
         5 -> receberImagemDificuldade.setImageResource(R.drawable.medio)
         6 -> receberImagemDificuldade.setImageResource(R.drawable.dificil)
      }
   }

   override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
      viewModel = ViewModelProvider(this)[RegistroViewModel::class.java]

   }

   override fun onCreateView(
      inflater: LayoutInflater, container: ViewGroup?,
      savedInstanceState: Bundle?
   ): View {



      binding = FragmentDetalhesservicoBinding.inflate(layoutInflater)

      viewModel.agendamentoSaved.observe(viewLifecycleOwner) {
         findNavController().navigate(R.id.actionScreenDetalheServicoToAgendamentoConcluido)
      }

      binding.buttonAgendar.setOnClickListener {
         viewModel.addAgendamento(
            nomeParaAgendar = binding.nomeAgendamento.text.toString(),
            enderecoParaAgendar = binding.enderecoAgendamento.text.toString(),
            dataParaAgendar = binding.dateAgendamento.text.toString(),
            timeParaAgendar = binding.timeAgendamento.text.toString(),
            descriptionParaAgendar = binding.descriptionAgendamento.text.toString(),
            context = requireActivity()
         )

      }
      return binding.root
   }

}
  /*       if (binding.nomeAgendamento.text.isEmpty() || binding.enderecoAgendamento.text.isEmpty() ||
            binding.dateAgendamento.text.isEmpty() || binding.timeAgendamento.text.isEmpty() ||
            binding.descriptionAgendamento.text.isEmpty()
         ) {
            Toast.makeText(
               getActivity(),
               "Você esqueceu de preencher algum campo!",
               Toast.LENGTH_SHORT
            ).show()
         } else {
            FakeObj.addAgendamento(
               nomeAgendamento,
               enderecoAgendamento,
               dateAgendamento,
               timeAgendamento,
               descriptionAgendamento
            )
            findNavController()().navigate(container)
         }*/


    /*override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.buttonAgendar).setOnClickListener {


*//*
        fun setLevelService(){
            when{
                view.findViewById<ImageView>(R.id.buttonEasy).
            }
        }*//*

            var nomeAgendamento = view.findViewById<EditText>(R.id.nomeAgendamento)?.text.toString()

            var enderecoAgendamento = view.findViewById<EditText>(R.id.enderecoAgendamento)?.text.toString()

            // val radioButton = view.findViewById<RadioButton>(R.id.radioButtonGrade) //

            var dataAgendamento = view.findViewById<EditText>(R.id.dateAgendamento)?.text.toString()

            var timeAgendamento = view.findViewById<EditText>(R.id.timeAgendamento)?.text.toString()

            var descriptionAgendamento = view.findViewById<EditText>(R.id.descriptionAgendamento)?.text.toString()

            if (
                nomeAgendamento.isEmpty() || enderecoAgendamento.isEmpty() || dataAgendamento.isEmpty() ||
                timeAgendamento.isEmpty() || descriptionAgendamento.isEmpty()
            ) {
                Toast.makeText(getActivity(), "Você deixou algum campo vazio!", Toast.LENGTH_SHORT)
                    .show()
            } else {
                FakeObj.addAgendamento(Model(nomeAgendamento, enderecoAgendamento, dataAgendamento, timeAgendamento, descriptionAgendamento))
                findNavController().navigate(R.id.actionScreenDetalheServicoToAgendamentoConcluido)
            }


        }
    }*/
