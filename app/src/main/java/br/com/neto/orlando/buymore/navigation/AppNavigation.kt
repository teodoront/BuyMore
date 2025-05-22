package br.com.neto.orlando.buymore.navigation

import LoginScreen
import android.util.Log
import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.neto.orlando.buymore.ui.screen.ClientsListScreen
import br.com.neto.orlando.buymore.ui.screen.CustomerRegistration
import br.com.neto.orlando.buymore.ui.screen.SalesListScreen
import br.com.neto.orlando.buymore.ui.screen.StartMenu
import br.com.neto.orlando.buymore.ui.screen.order.ProductsTableListScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login") {
        composable("login") {
            LoginScreen(
                onLoginSuccess = {
                    navController.navigate("startMenu") {
                        popUpTo("login") { inclusive = true }
                    }
                }
            )
        }

        composable("startMenu") {
            StartMenu(
                onRegisterCustomer = {
                    navController.navigate("customerRegistration")
                },
                onSalesList = {
                    navController.navigate("salesList")
                },
                onProductsList = {
                    navController.navigate("productsList")
                }
            )
        }
        composable("customerRegistration") {//tela de cadastro de cliente
            BackHandler {
                Log.d("BackHandler", "Voltar pressionado!")
                navController.popBackStack()
            }
            ClientsListScreen()
        }

        composable("salesList") {//tela de cadastro de cliente
            BackHandler {
                Log.d("BackHandler", "Voltar pressionado!")
                navController.popBackStack()
            }
            SalesListScreen()
        }

        composable("productsList") {//tela de cadastro de cliente
            BackHandler {
                Log.d("BackHandler", "Voltar pressionado!")
                navController.popBackStack()
            }
            ProductsTableListScreen()
        }


    }
}
