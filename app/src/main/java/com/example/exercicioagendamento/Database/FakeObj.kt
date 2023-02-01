package com.example.exercicioagendamento.Database

import com.example.exercicioagendamento.Model.DataBaseObj
import com.example.exercicioagendamento.Model.Model

object FakeObj {

    private var dbObj = DataBaseObj()

    fun addAgendamento(agendamento: Model) {
        dbObj.list.add(agendamento)
    }

    fun deleteAgendamento(agendamento: Model) {
        dbObj.list.remove(agendamento)
    }

    fun uptadeAgendamento(agendamentoAtualizado: Model) {
        dbObj.list.find { it.id == agendamentoAtualizado.id }?.let {
            dbObj.list.remove(it)
        }
        addAgendamento(agendamentoAtualizado)
    }

    fun getAgendamento() = dbObj.list

}
