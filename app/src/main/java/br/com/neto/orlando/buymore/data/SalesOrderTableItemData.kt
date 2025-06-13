package br.com.neto.orlando.buymore.data

import android.graphics.Bitmap

data class SalesOrderTableItemData(
    val cod: String,
    val codAux: String,
    val description: String,
    val price: String,
    val image: Bitmap?

)
