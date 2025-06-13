package br.com.neto.orlando.buymore.ui.screen.order

import android.graphics.BitmapFactory
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.neto.orlando.buymore.R
import br.com.neto.orlando.buymore.data.SalesOrderTableItemData

@Composable
fun ProductsTableListScreen() {
    val context = LocalContext.current
    val bitmap = BitmapFactory.decodeResource(context.resources, R.drawable.produtos)

    val originalItems = remember {
        mutableStateListOf(
            SalesOrderTableItemData("001", "123456789", "Abacaxi Caramelado", "127,50", bitmap),
            SalesOrderTableItemData("002", "987654321", "Banana Real", "89,90", bitmap),
            SalesOrderTableItemData("003", "111111111", "Melancia Doce", "45,00", bitmap),
            SalesOrderTableItemData("004", "222222222", "Morango Supremo", "23,75", bitmap),
            SalesOrderTableItemData("005", "333333333", "Goiaba Cremosa", "65,80", bitmap)
        )
    }

    var searchQuery by remember { mutableStateOf("") }

    val filteredItems = originalItems.filter {
        it.description.contains(searchQuery, ignoreCase = true) ||
                it.cod.contains(searchQuery, ignoreCase = true) ||
                it.codAux.contains(searchQuery, ignoreCase = true)
    }

    Scaffold { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            // Barra de busca fora do TopAppBar
            OutlinedTextField(
                value = searchQuery,
                onValueChange = { searchQuery = it },
                modifier = Modifier
                    .padding(6.dp)
                    .fillMaxWidth(),
                placeholder = { Text("Buscar produtos...") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Buscar"
                    )
                },
                singleLine = true

            )

            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(8.dp)
            ) {
                items(filteredItems) { item ->
                    ProductsTableOrderItem(
                        tableItem = item,
                        onClick = {
                            //evento de abrir a tela de itens
                        }
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                }
            }
        }
    }
}


@Preview
@Composable
private fun SalesScreenPrev() {
    ProductsTableListScreen()
}
