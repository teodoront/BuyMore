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
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.neto.orlando.buymore.data.Clients
import br.com.neto.orlando.buymore.data.SalesOrder
import br.com.neto.orlando.buymore.ui.theme.MyDarkGray
import br.com.neto.orlando.buymore.ui.theme.MyLightGray


@Composable
fun ClientsItem(client: Clients) {
    Card(
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
                Text(text = "CodCli: ${client.id}", color = MyDarkGray)
            }

            Spacer(modifier = Modifier.height(4.dp))

            Text(text = "Nome: ${client.name}", color = MyDarkGray)

            Spacer(modifier = Modifier.height(4.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "CPF/CNPJ: ${client.cpf}", color = MyDarkGray)
                Text(text = "Data Ult. Compra: ${client.dtUltCompra}", color = MyDarkGray)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun SalesOrderItemPreview() {

    val fakeClients = Clients(
    id = 123456,
    name = "Fulano Beltrano da Silva",
    cpf = "123.123.456-22",
    rg = "",
    adress = "",
    compAdress = "",
    neighborhood = "",
    cep = "",
    city = "",
    state  = "",
    phone = "",
    email = "",
    rdSocial = "",
    dtUltCompra  = "11/11/1111"
    )
    ClientsItem(fakeClients)
}