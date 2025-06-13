package br.com.neto.orlando.buymore

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.neto.orlando.buymore.ui.screen.order.NotesOrder
import br.com.neto.orlando.buymore.ui.screen.order.ProductsTableListScreen
import br.com.neto.orlando.buymore.ui.screen.order.SalesOrder
import br.com.neto.orlando.buymore.ui.screen.order.TotaisOutrosCardScreen
import br.com.neto.orlando.buymore.ui.theme.Green
import br.com.neto.orlando.buymore.ui.theme.MyDarkGray
import br.com.neto.orlando.buymore.ui.theme.Orange
import kotlinx.coroutines.launch

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun MainMenu() {
    val pagerState = rememberPagerState(initialPage = 0, pageCount = { 5 })
    val coroutineScope = rememberCoroutineScope()

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Pedido", color = Orange) },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = MyDarkGray)
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)

        ) {
            ScrollableTabRow(
                selectedTabIndex = pagerState.currentPage,
                containerColor = MyDarkGray,
                edgePadding = 0.dp,
                indicator = { tabPositions ->
                    TabRowDefaults.Indicator(
                        Modifier
                            .tabIndicatorOffset(tabPositions[pagerState.currentPage])
                            .height(3.dp),
                        color = Orange
                    )
                }
            ) {
                listOf("CABEÇALHO", "TABELA", "ITENS", "TOTAL", "OBSERVAÇÕES").forEachIndexed { index, title ->
                    Tab(
                        selected = pagerState.currentPage == index,
                        onClick = {
                            coroutineScope.launch {
                                pagerState.animateScrollToPage(index)
                            }
                        },
                        text = { Text(title) },
                        selectedContentColor = Green,
                        unselectedContentColor = Color.LightGray
                    )
                }
            }

            HorizontalPager(state = pagerState, modifier = Modifier.fillMaxSize()) { page ->
                when (page) {
                    0 -> SalesOrder()
                    1 -> ProductsTableListScreen()//aqui tratar na regra de negócio para listar os produtos para inserir no pedido
                    2 -> ProductsTableListScreen()//aqui tratar na regra de negócio para listar os produtos inseridos no pedido
                    3 -> TotaisOutrosCardScreen()
                    4 -> NotesOrder()
                }
            }
        }
    }
}





@Preview
@Composable
private fun MainMenuPrev() {
    MainMenu()
}