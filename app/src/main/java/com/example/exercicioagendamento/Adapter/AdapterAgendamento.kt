package com.example.exercicioagendamento.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.exercicioagendamento.R
import com.example.exercicioagendamento.Model.Model
import com.example.exercicioagendamento.databinding.FragmentAgendamentoConcluidoBinding
import com.example.exercicioagendamento.databinding.FragmentDetalhesservicoBinding
import com.example.exercicioagendamento.databinding.FragmentLayoutBinding
import kotlinx.android.synthetic.main.fragment_layout.view.*

class AdapterAgendamento (private val onClick: (Model) -> Unit) : RecyclerView.Adapter<AdapterAgendamento.ViewHolder>() {

    private var agendamentoList: List<Model> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            FragmentLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
      holder.bind(agendamentoList[position], onClick)
    }

    override fun getItemCount(): Int {
        return agendamentoList.size
    }

    fun updateList(agendamentoList: List<Model>) {
        this.agendamentoList = agendamentoList
        notifyDataSetChanged()
    }

    class ViewHolder(private val binding: FragmentLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(agendamento: Model, onClick: (Model) -> Unit) {
            binding.nomeOnLayout.text = agendamento.nomeLayout
            binding.enderecoOnLayout.text = agendamento.enderecoLayout
            binding.dataOnLayout.text = agendamento.dataLayout
            binding.horarioOnLayout.text = agendamento.timeLayout
            binding.descricaoOnLayout.text = agendamento.descricaoLayout
            binding.imageViewLixeira.setOnClickListener{
                onClick(agendamento)
                binding.imageViewEdit.setOnClickListener{
                    onClick(agendamento)
                }
            }



        }
    }
}
