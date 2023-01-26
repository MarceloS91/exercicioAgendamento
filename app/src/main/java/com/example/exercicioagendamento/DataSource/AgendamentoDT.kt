package com.example.exercicioagendamento.DataSource

import android.app.Activity
import com.example.exercicioagendamento.Adapter.AdapterAgendamento
import com.example.exercicioagendamento.Database.FakeObj
import com.example.exercicioagendamento.Model.Model
import com.example.exercicioagendamento.Model.UserRegister

class AgendamentoDT() {

    fun addAgendamento(context: Activity, agendamento: Model) {
        FakeObj.addAgendamento(agendamento)
    }

    fun deleteAgendamento(context: Activity, agendamento: Model) {
        FakeObj.deleteAgendamento(agendamento)
    }

   /* fun updateAgendamento(context: Activity, agendamento: Model) {
        FakeObj.uptadeAgendamento(agendamento)
    }*/

    fun getAgendamento(context: Activity): List<Model> {
        return FakeObj.getAgendamento()
    }
}