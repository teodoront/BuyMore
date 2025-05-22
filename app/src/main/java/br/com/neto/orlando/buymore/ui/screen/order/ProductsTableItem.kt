package br.com.neto.orlando.buymore.ui.screen.order

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.neto.orlando.buymore.R
import br.com.neto.orlando.buymore.data.SalesOrder
import br.com.neto.orlando.buymore.data.SalesOrderTableItemData
import br.com.neto.orlando.buymore.ui.theme.MyDarkGray
import br.com.neto.orlando.buymore.ui.theme.MyLightGray


@Composable
fun ProductsTableOrderItem(
    tableItem: SalesOrderTableItemData,
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .border(2.dp, MyDarkGray)
            .padding(8.dp)
            .background(MyLightGray)
            .clickable { onClick() }
    ) {
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.produtos), // substitua por seu drawable
                contentDescription = "Produto",
                modifier = Modifier
                    .size(80.dp)
                    .padding(end = 8.dp)
            )

            Column(modifier = Modifier.fillMaxWidth()) {

                Text(text = "Código: ${tableItem.cod}", color = MyDarkGray)

                Spacer(modifier = Modifier.height(4.dp))

                Text(text = "Código de Barras: ${tableItem.codAux}", color = MyDarkGray)

                Spacer(modifier = Modifier.height(4.dp))

                Text(text = "Descrição: ${tableItem.description}", color = MyDarkGray)

                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    text = "Preço R$: ${tableItem.price}",
                    color = MyDarkGray,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun SalesOrderItemPreview() {
    val fakeItemTable = SalesOrderTableItemData(
        cod = "123456",
        codAux = "123456789101112",
        description = "Abacaxi Caramelado",
        price = "127,50",
        image = null,

        )

    ProductsTableOrderItem(tableItem = fakeItemTable, onClick = {})
}