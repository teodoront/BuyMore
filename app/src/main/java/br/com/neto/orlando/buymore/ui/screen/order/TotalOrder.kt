package br.com.neto.orlando.buymore.ui.screen.order

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.neto.orlando.buymore.data.InfoItem
import br.com.neto.orlando.buymore.ui.theme.MyLightGray


@Composable
fun TotaisOutrosCardScreen() {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        InfoCard(
            title = "Totais",
            sections = listOf(
                listOf(
                    InfoItem("Valor total", "", "R$ 0,00", true),
                ),
                listOf(
                    InfoItem("Valor de tabela", "", "R$ 0,00", false),
                    InfoItem("Valor sem impostos", "", "R$ 0,00", false),
                    InfoItem("Desconto", "0%", "R$ 0,00", false)
                ),
                listOf(
                    InfoItem("Limite cliente", "", "R$ 8.000,00", false),
                    InfoItem("CC pedido", "", "R$ 0,00", false),
                    InfoItem("CC disp. RCA", "", "R$ 100.000,03", false),
                    InfoItem("CC RCA (previsto)", "", "R$ 100.000,03", false)
                )
            )
        )

        Spacer(modifier = Modifier.height(16.dp))

        InfoCard(
            title = "Outros",
            sections = listOf(
                listOf(
                    InfoItem("Lucratividade", "0.00%", "R$ 0,00", false),
                    InfoItem("Comissão", "0%", "R$ 0,00", false)
                ),
                listOf(
                    InfoItem("Valor de ST", "0%", "R$ 0,00", false),
                    InfoItem("Valor de FECP", "0%", "R$ 0,00", false),
                    InfoItem("Valor de IPI", "0%", "R$ 0,00", false)
                ),
                listOf(
                    InfoItem("Peso (B/L)", "", "0", false),
                    InfoItem("Itens / Volumes", "", "0", false),
                    InfoItem("Volume (m³)", "", "0", false)
                )
            )
        )

    }
}

@Composable
fun InfoCard(
    title: String,
    sections: List<List<InfoItem>>
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        colors = CardDefaults.cardColors(containerColor = MyLightGray)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = title,
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            Divider()

            sections.forEachIndexed { _: Int, section: List<InfoItem> ->
                Spacer(modifier = Modifier.height(12.dp))
                section.forEach { item: InfoItem ->
                    InfoRow(
                        label = item.label,
                        prefix = item.prefix,
                        value = item.value,
                        bold = item.bold
                    )
                }
            }

        }
    }
}


@Composable
fun InfoRow(
    label: String,
    prefix: String,
    value: String,
    bold: Boolean = false
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 2.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = label,
            style = MaterialTheme.typography.bodyMedium
        )
        Text(
            text = if (prefix.isNotBlank()) "$prefix $value" else value,
            style = if (bold) MaterialTheme.typography.bodyMedium.copy(fontWeight = FontWeight.Bold)
            else MaterialTheme.typography.bodyMedium
        )
    }
}

@Preview
@Composable
private fun TotaisOutrosCardScreenPrev() {
    TotaisOutrosCardScreen()
}
