package com.example.exercicioagendamento.View

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.exercicioagendamento.Adapter.AdapterAgendamento
import com.example.exercicioagendamento.Database.FakeObj
import com.example.exercicioagendamento.List.ListViewModel
import com.example.exercicioagendamento.R
import com.example.exercicioagendamento.databinding.FragmentHistoricoAgendamentosBinding

class ScreenHistoricoAgendamento : Fragment(R.layout.fragment_historico_agendamentos) {

    private lateinit var binding: FragmentHistoricoAgendamentosBinding
    private lateinit var viewModel: ListViewModel
    private lateinit var agendamentoAdapter: AdapterAgendamento

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        viewModel = ViewModelProvider(this)[ListViewModel::class.java]

        viewModel.loadAgendamento(requireActivity())

        agendamentoAdapter = AdapterAgendamento(
            onClickDelete = { agendamento ->
                viewModel.deleteAgendamento(agendamento = agendamento, context = requireActivity())
            },
             onClickSave = { agendamentoAtualizado ->
                 FakeObj.uptadeAgendamento(
                     agendamentoAtualizado
                )
            }
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHistoricoAgendamentosBinding.inflate(layoutInflater)

        viewModel.agendamento.observe(viewLifecycleOwner) { agendamento ->
            agendamentoAdapter.updateList(agendamento)
        }

        binding.apply {
            buttonNovoAgendamento.setOnClickListener {
                findNavController().navigate(R.id.actionScreenHistoricoAgendamentosToScreenNovoServico)
            }

            recyclerViewAgendamento.apply {
                layoutManager = LinearLayoutManager(context)
                adapter = agendamentoAdapter
            }
        }
        return binding.root
    }
}


/*    var listServices = FakeObj.FakeObj

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerViewMedium = view.findViewById<RecyclerView>(R.id.recyclerViewAgendamento)
        recyclerViewMedium.adapter = AdapterAgendamento(listServices, context)

        val layoutManager = LinearLayoutManager(context)
        recyclerViewMedium.layoutManager = layoutManager

            }
        }*/
