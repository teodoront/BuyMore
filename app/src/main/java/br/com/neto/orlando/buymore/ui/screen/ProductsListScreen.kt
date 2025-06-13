package br.com.neto.orlando.buymore.ui.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import br.com.neto.orlando.buymore.ui.theme.MyDarkGray
import br.com.neto.orlando.buymore.ui.theme.Orange

@Composable
fun ProductsListScreen() {
    Surface(modifier = Modifier.fillMaxSize(), color = MyDarkGray) {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Text(text = "Produtos", color = Orange, fontSize = 32.sp)
        }
    }
}

@Preview
@Composable
private fun ProductsListScreenPreview() {
    ProductsListScreen()
}
