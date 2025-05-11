package br.com.neto.orlando.buymore.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.neto.orlando.buymore.data.SalesOrder
import br.com.neto.orlando.buymore.ui.theme.MyDarkGray
import br.com.neto.orlando.buymore.ui.theme.MyLightGray


@Composable
fun SalesOrderItem(order: SalesOrder) {
    Box(
        modifier = Modifier
            .border(2.dp, MyDarkGray)
            .padding(8.dp)
            .background(MyLightGray)
    ) {
        Column(modifier = Modifier.fillMaxWidth()) {

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "Nº: ${order.id}", color = MyDarkGray)
                Text(text = "CodCli: 123456", color = MyDarkGray)
            }

            Spacer(modifier = Modifier.height(4.dp))

            Text(text = "Nome: ${order.name}", color = MyDarkGray)

            Spacer(modifier = Modifier.height(4.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "Nf: ${order.nf}", color = MyDarkGray)
                Text(text = "Data: ${order.date}", color = MyDarkGray)
            }

            Spacer(modifier = Modifier.height(4.dp))

            Text(text = "Total: ${order.total}", color = MyDarkGray, fontWeight = FontWeight.Bold)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun SalesOrderItemPreview() {
    val fakeOrder = SalesOrder(
        id = "123456",
        codCli = "123456",
        name = "Fulano Beltrano da Silva",
        nf = "123456-4",
        date = "11/11/1111",
        total = "1.234,56"
    )

    SalesOrderItem(order = fakeOrder)
}