package com.example.exercicioagendamento.Model

import android.app.Activity
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.exercicioagendamento.DataSource.AgendamentoDT

class RegistroViewModel : ViewModel() {

    private val agendamentoDT = AgendamentoDT()

    val agendamentoSaved = MutableLiveData<Unit>()

    fun addAgendamento(
        nomeParaAgendar: String,
        enderecoParaAgendar: String,
        dataParaAgendar: String,
        timeParaAgendar: String,
        descriptionParaAgendar: String,
        context: Activity
    ) {
        agendamentoDT.addAgendamento(
            context = context,
            agendamento = Model(
                nomeLayout = nomeParaAgendar,
                enderecoLayout = enderecoParaAgendar,
                dataLayout = dataParaAgendar,
                timeLayout = timeParaAgendar,
                descricaoLayout = descriptionParaAgendar
            )
        )
        agendamentoSaved.value = Unit
    }
}

