package com.example.exercicioagendamento.List

import android.app.Activity
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.exercicioagendamento.Adapter.AdapterAgendamento
import com.example.exercicioagendamento.DataSource.AgendamentoDT
import com.example.exercicioagendamento.Model.Model

class ListViewModel : ViewModel() {

    private val agendamentoDataSource = AgendamentoDT()

    val agendamento = MutableLiveData<List<Model>>()

    fun loadAgendamento(context: Activity) {
       agendamento.value =  agendamentoDataSource.getAgendamento(context)
    }

    fun deleteAgendamento(
        agendamento: Model,
        context: Activity
    ) {
        agendamentoDataSource.deleteAgendamento(
            context = context,
            agendamento = agendamento
        )
        loadAgendamento(context)
    }
}