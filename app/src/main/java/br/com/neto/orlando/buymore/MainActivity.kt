package br.com.neto.orlando.buymore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import br.com.neto.orlando.buymore.navigation.AppNavigation
import br.com.neto.orlando.buymore.ui.theme.BuyMoreTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BuyMoreTheme {
                AppNavigation()
            }
        }
    }
}


