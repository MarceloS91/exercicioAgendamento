package com.example.exercicioagendamento.Model

import android.location.Address
import java.io.Serializable

data class UserRegister(
    var id: Int,
    var name: String,
    var birthDate: String,
    var cpf: String,
    var rg: String,
    var cellphone: String,
    var address: Address

): Serializable
