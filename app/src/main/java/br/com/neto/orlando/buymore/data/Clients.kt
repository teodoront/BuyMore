package br.com.neto.orlando.buymore.data


data class Clients(
    val id: Int,
    val name: String,
    val cpf: String,
    val rg: String,
    val adress: String,
    val compAdress: String,
    val neighborhood: String,
    val cep: String,
    val city: String,
    val state: String,
    val phone: String,
    val email: String,
    val rdSocial: String,
    val dtUltCompra: String
)

