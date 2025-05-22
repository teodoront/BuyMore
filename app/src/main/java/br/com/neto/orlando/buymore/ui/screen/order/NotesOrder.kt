package br.com.neto.orlando.buymore.ui.screen.order

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.neto.orlando.buymore.ui.theme.MyDarkGray
import br.com.neto.orlando.buymore.ui.theme.MyLightGray

@Composable
fun NotesOrder() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        NotesOrderCard()
    }
}
@Composable
fun NotesOrderCard() {
    var observacaoNF by remember { mutableStateOf("") }
    var numeroPedidoCliente by remember { mutableStateOf("") }

    Card(
        modifier = Modifier
            .fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        colors = CardDefaults.cardColors(containerColor = MyLightGray)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(
                text = "Observações",
                style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold)
            )

            Spacer(modifier = Modifier.height(8.dp))

            OutlinedTextField(
                value = observacaoNF,
                onValueChange = { observacaoNF = it },
                label = { Text("Observação Nota Fiscal") },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(120.dp), // altura fixa pra simular área de texto
                singleLine = false,
                maxLines = 5,
                shape = RoundedCornerShape(8.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Número do pedido do cliente:",
                style = MaterialTheme.typography.bodySmall,
                color = Color.Gray
            )

            OutlinedTextField(
                value = numeroPedidoCliente,
                onValueChange = { numeroPedidoCliente = it },
                placeholder = { Text("Informe o número do pedido do cliente") },
                modifier = Modifier.fillMaxWidth(),
                singleLine = true,
                shape = RoundedCornerShape(8.dp)
            )
        }
    }
}

@Preview
@Composable
private fun NotesOrderPrev() {
    NotesOrder()
}
