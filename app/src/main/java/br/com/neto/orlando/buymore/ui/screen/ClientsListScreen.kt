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
import br.com.neto.orlando.buymore.data.Clients
import br.com.neto.orlando.buymore.ui.theme.MyDarkGray
import br.com.neto.orlando.buymore.ui.theme.Orange

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ClientsListScreen() {

    val client = listOf(
        Clients(
      123,
            "Fulano Beltrano da Silva",
            "111.111.111-11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "11/11/1111"
        ),
        Clients(
            123,
            "Fulano Beltrano da Silva",
            "111.111.111-11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "11/11/1111"
        ),
        Clients(
            123,
            "Fulano Beltrano da Silva",
            "111.111.111-11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "11/11/1111"
        ),
        Clients(
            123,
            "Fulano Beltrano da Silva",
            "111.111.111-11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "11/11/1111"
        )
    )

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Clientes", color = Orange) },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = MyDarkGray)
            )
        }

    ) { innerPadding ->

        ClientsList(client, innerPadding = innerPadding)
    }

}

@Composable
fun ClientsList(
    clients: List<Clients>,
    innerPadding: PaddingValues,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        contentPadding = innerPadding,
        modifier = modifier.fillMaxSize()
    ) {
        items(clients) { clients ->
            ClientsItem(client = clients)
        }
    }
}

@Preview
@Composable
private fun ClisentsListPrev() {
    ClientsListScreen()
}