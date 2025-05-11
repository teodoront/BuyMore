package br.com.neto.orlando.buymore.data

data class SalesOrder(
    val id: String,
    val codCli: String,
    val name: String,
    val nf: String,
    val date: String,
    val total: String
)
