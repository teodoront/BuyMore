package br.com.neto.orlando.buymore.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectHorizontalDragGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.neto.orlando.buymore.R
import br.com.neto.orlando.buymore.ui.theme.Green
import br.com.neto.orlando.buymore.ui.theme.MyDarkGray
import br.com.neto.orlando.buymore.ui.theme.MyLightGray
import br.com.neto.orlando.buymore.ui.theme.Orange

@Composable
fun StartMenu(
    onRegisterCustomer: () -> Unit,
    onSalesList: () -> Unit,
    onProductsList: () -> Unit,
              ) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MyLightGray
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {


            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(24.dp, Alignment.CenterVertically),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                SwipeableMenuCard(
                    title = "Pedidos",
                    description = "Toque ou deslize",
                    icon = {
                        Icon(
                            imageVector = Icons.Default.ShoppingCart,
                            contentDescription = null,
                            modifier = Modifier.size(48.dp),
                            tint = Orange
                        )},
                    onClick = { onSalesList() },
                    onSwipe = { onSalesList() }
                )

                SwipeableMenuCard(
                    title = "Clientes",
                    description = "Toque ou deslize",
                    icon = {
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = null,
                            modifier = Modifier.size(48.dp),
                            tint = Orange
                        )},
                    onClick = { onRegisterCustomer()},
                    onSwipe = { onRegisterCustomer()}
                )

                SwipeableMenuCard(
                    title = "Produtos",
                    description = "Toque ou deslize",
                    icon = {
                        Image(
                            painter = painterResource(id = R.drawable.produtos),
                            contentDescription = null,
                            modifier = Modifier.size(48.dp),
                            colorFilter = ColorFilter.tint(Orange)
                        )
                    },
                    onClick = { onProductsList()},
                    onSwipe = { onProductsList()}
                )
            }

            Icon(
                imageVector = Icons.Default.Settings,
                contentDescription = "Configurações",
                tint = Orange,
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .size(36.dp)
                    .clickable {
                        // Ação ao clicar
                    }
                    .graphicsLayer(
                        shadowElevation = 8F,
                        shape = CircleShape,
                        clip = false
                    )
                    .background(
                        color = MyLightGray,
                        shape = CircleShape
                    )
            )


        }
    }
}

@Composable
fun SwipeableMenuCard(
    title: String,
    description: String,
    icon: @Composable () -> Unit,
    onClick: () -> Unit,
    onSwipe: () -> Unit
) {
    Card(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .pointerInput(Unit) {
                detectHorizontalDragGestures { _, dragAmount ->
                    if (dragAmount < -100f || dragAmount > 100f) {
                        onSwipe()
                    }
                }
            },
        colors = CardDefaults.cardColors(
            contentColor = MyDarkGray
        ),
        elevation = CardDefaults.cardElevation(12.dp),
        shape = RoundedCornerShape(24.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(modifier = Modifier.size(48.dp)) {
                icon()
            }
            Spacer(modifier = Modifier.height(16.dp))
            Text(title, fontSize = 22.sp, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(8.dp))
            Text(description, fontSize = 14.sp, color = Green)
        }
    }
}


@Preview
@Composable
private fun StartMenuPrev() {
    StartMenu(
        onRegisterCustomer = {},
        onSalesList = {},
        onProductsList = {})
}