package br.com.neto.orlando.buymore.ui.screen


import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.com.neto.orlando.buymore.data.SalesOrder
import br.com.neto.orlando.buymore.ui.theme.MyDarkGray
import br.com.neto.orlando.buymore.ui.theme.Orange

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SalesListScreen() {
    val orders = listOf(
        SalesOrder(
            "123456",
            "123456",
            "Fulano Beltrano da Silva",
            "123456-4",
            "11/11/1111",
            "1.234,56"
        ),
        SalesOrder(
            "654321",
            "654321",
            "Ciclano da Silva",
            "654321-7",
            "22/12/2222",
            "2.345,67"),

        SalesOrder(
            "123456",
            "123456",
            "Fulano Beltrano da Silva",
            "123456-4",
            "11/11/1111",
            "1.234,56"
        ),
        SalesOrder(
            "654321",
            "654321",
            "Ciclano da Silva",
            "654321-7",
            "22/12/2222",
            "2.345,67"),

        SalesOrder(
            "123456",
            "123456",
            "Fulano Beltrano da Silva",
            "123456-4",
            "11/11/1111",
            "1.234,56"
        ),
        SalesOrder(
            "654321",
            "654321",
            "Ciclano da Silva",
            "654321-7",
            "22/12/2222",
            "2.345,67"),

        SalesOrder(
            "123456",
            "123456",
            "Fulano Beltrano da Silva",
            "123456-4",
            "11/11/1111",
            "1.234,56"
        ),
        SalesOrder(
            "654321",
            "654321",
            "Ciclano da Silva",
            "654321-7",
            "22/12/2222",
            "2.345,67"),

        SalesOrder(
            "123456",
            "123456",
            "Fulano Beltrano da Silva",
            "123456-4",
            "11/11/1111",
            "1.234,56"
        ),
        SalesOrder(
            "654321",
            "654321",
            "Ciclano da Silva",
            "654321-7",
            "22/12/2222",
            "2.345,67"),


        // Adicione mais pedidos
    )

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Pedidos", color = Orange) },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = MyDarkGray)
            )
        }

    ) { innerPadding ->

        SalesOrderList(orders, innerPadding = innerPadding)
    }
}

@Composable
fun SalesOrderList(
    orders: List<SalesOrder>,
    innerPadding: PaddingValues,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        contentPadding = innerPadding,
        modifier = modifier.fillMaxSize()
    ) {
        items(orders) { order ->
            SalesOrderItem(order = order)
        }
    }
}

@Preview
@Composable
private fun SalesScreenPrev() {
    SalesListScreen()
}
