package br.com.neto.orlando.buymore.ui.screen.order

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.neto.orlando.buymore.R

@Composable
fun DetailItensOrder() {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            // CARD PRODUTO
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                elevation = CardDefaults.cardElevation(8.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.produtos), // substitua por sua imagem
                            contentDescription = "Produto",
                            modifier = Modifier
                                .size(48.dp)
                                .clip(RoundedCornerShape(8.dp))
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Column {
                            Text(text = "816-2", fontWeight = FontWeight.Bold)
                            Text(text = "SANDELLA MAC INST GAL CAIP 85GX50")
                        }
                    }

                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            // Estoque
            Text(
                text = "Estoque: 28361.62",
                modifier = Modifier.align(Alignment.End),
                fontWeight = FontWeight.Medium,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(16.dp))

            // EMBALAGEM / QUANTIDADE / DESCONTO
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                elevation = CardDefaults.cardElevation(8.dp)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(text = "Embalagem", color = Color.Blue, fontWeight = FontWeight.Bold)
                    Text(text = "Caixa C/ 50 Unidades", color = Color.Gray)

                    Spacer(modifier = Modifier.height(12.dp))

                    Row(modifier = Modifier.fillMaxWidth()) {
                        Column(modifier = Modifier.weight(1f)) {
                            Text("Quantidade", color = Color.Green, fontWeight = FontWeight.Bold)
                            TextField(
                                value = "5.0",
                                onValueChange = {},
                                modifier = Modifier.fillMaxWidth()
                            )
                        }
                        Spacer(modifier = Modifier.width(8.dp))
                        Column(modifier = Modifier.weight(1f)) {
                            Text("Desconto", color = Color.Green, fontWeight = FontWeight.Bold)
                            TextField(
                                value = "0.00",
                                onValueChange = {},
                                modifier = Modifier.fillMaxWidth()
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    Row(modifier = Modifier.fillMaxWidth()) {
                        Column(modifier = Modifier.weight(1f)) {
                            Text("Valor", fontWeight = FontWeight.SemiBold)
                            Text("63.50")
                        }
                        Spacer(modifier = Modifier.width(8.dp))
                        Column(modifier = Modifier.weight(1f)) {
                            Text("Valor Unit.", fontWeight = FontWeight.SemiBold)
                            Text("1.27")
                        }
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Column {
                            Text("CC Valor/%", fontSize = 12.sp)
                            Text("0.00 / 0.00")
                        }
                        Column {
                            Text("CX. Unit./Total", fontSize = 12.sp)
                            Text("1.27 / 1.27")
                        }
                        Column {
                            Text("Preço Tabela", fontSize = 12.sp)
                            Text("1.27")
                        }
                        Column {
                            Text("Preço S. Mov.", fontSize = 12.sp)
                            Text("---")
                        }
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Column {
                            Text("% Lucro", fontWeight = FontWeight.Bold)
                            Text("71.29%")
                        }
                        Column {
                            Text("Valor Total", fontWeight = FontWeight.Bold)
                            Text("317.50")
                        }
                        Column {
                            Text("Últ. Preço", fontWeight = FontWeight.Bold)
                            Text("1.27")
                        }
                    }
                }
            }
        }

        // BOTÃO FLUTUANTE
        FloatingActionButton(
            onClick = { /* TODO */ },
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(16.dp),
            containerColor = Color(0xFF3F51B5)
        ) {
            Icon(Icons.Default.Check, contentDescription = "Confirmar", tint = Color.White)
        }
    }
}

@Preview
@Composable
private fun DetailItensOrderPrev() {
    DetailItensOrder()
}