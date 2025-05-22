package br.com.neto.orlando.buymore.data

data class InfoItem(
    val label: String,
    val prefix: String = "",
    val value: String,
    val bold: Boolean = false
)
