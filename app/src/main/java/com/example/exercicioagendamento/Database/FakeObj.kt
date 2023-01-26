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

    fun uptadeAgendamento(agendamento: Model, agendamentoAtualizado: Model) {

    }

    fun getAgendamento() = dbObj.list

}
