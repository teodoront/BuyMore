package br.com.neto.orlando.buymore.viewmodel

data class CustomerUiState(
    val id: String = "",
    val name: String = "",
    val cpf: String = "",
    val rg: String = "",
    val adress: String = "",
    val compAdress: String = "",
    val neighborhood: String = "",
    val cep: String = "",
    val city: String = "",
    val state: String = "",
    val phone: String = "",
    val email: String = "",
    val rdSocial: String = "",
    val emailIsValid: Boolean = true
)
