package com.example.exercicioagendamento.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.exercicioagendamento.Model.Model
import com.example.exercicioagendamento.databinding.FragmentLayoutBinding

class AdapterAgendamento(
    private val onClickDelete: (Model) -> Unit,
    private val onClickSave: (Model) -> Unit,
) :
    RecyclerView.Adapter<AdapterAgendamento.ViewHolder>() {

    private var agendamentoList: List<Model> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            FragmentLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(agendamentoList[position], onClickDelete, onClickSave)
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
        private var enable = false

        fun bind(
            agendamento: Model,
            onClickDelete: (Model) -> Unit,
            onClickSave: (Model) -> Unit
        ) {
            binding.nomeOnLayout.setText(agendamento.nomeLayout)
            binding.enderecoOnLayout.setText(agendamento.enderecoLayout)
            binding.dataOnLayout.setText(agendamento.dataLayout)
            binding.horarioOnLayout.setText(agendamento.timeLayout)
            binding.descricaoOnLayout.setText(agendamento.descricaoLayout)

            binding.imageViewLixeira.setOnClickListener {
                onClickDelete(agendamento)
            }

            binding.imageViewEdit.setOnClickListener {
                disableEditText(enable.not())
            }

            binding.imageViewSave.setOnClickListener {
                if (enable) {
                    onClickSave(
                        Model(
                            id = agendamento.id,
                            nomeLayout = binding.nomeOnLayout.text.toString(),
                            enderecoLayout = binding.enderecoOnLayout.text.toString(),
                            dataLayout = binding.dataOnLayout.text.toString(),
                            timeLayout = binding.horarioOnLayout.text.toString(),
                            descricaoLayout = binding.descricaoOnLayout.text.toString()
                        )
                    )
                    disableEditText(false)
                }
            }
        }

        fun disableEditText(enable: Boolean) {
            this.enable = enable
            binding.nomeOnLayout.isEnabled = enable
            binding.enderecoOnLayout.isEnabled = enable
            binding.dataOnLayout.isEnabled = enable
            binding.horarioOnLayout.isEnabled = enable
            binding.descricaoOnLayout.isEnabled = enable
        }
    }
}
