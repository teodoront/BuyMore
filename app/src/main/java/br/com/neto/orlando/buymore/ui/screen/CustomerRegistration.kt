package br.com.neto.orlando.buymore.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.neto.orlando.buymore.ui.theme.Green
import br.com.neto.orlando.buymore.ui.theme.MyDarkGray
import br.com.neto.orlando.buymore.ui.theme.Orange
import androidx.lifecycle.viewmodel.compose.viewModel
import br.com.neto.orlando.buymore.viewmodel.CustomerViewModel


@Composable
fun CustomerRegistration(
    viewModel: CustomerViewModel = viewModel()
) {
    val uiState by viewModel.uiState.collectAsState()
    val scrollState = rememberScrollState()


    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MyDarkGray
    ) {

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(18.dp)
                    .verticalScroll(scrollState),
                verticalArrangement = Arrangement.spacedBy(8.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "CADASTRO DE CLIENTES",
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold,
                    color = Orange,
                    textAlign = TextAlign.Center,
                    lineHeight = 40.sp,
                    modifier = Modifier.padding(bottom = 8.dp)
                )

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    OutlinedTextField(
                        value = uiState.id,
                        onValueChange = { viewModel.onIdChange(it) },
                        label = { Text("Código") },
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = Green,
                            unfocusedBorderColor = Color.Gray,
                            focusedLabelColor = Green,
                            unfocusedLabelColor = Color.LightGray,
                            focusedLeadingIconColor = Green,
                            unfocusedLeadingIconColor = Color.Gray,
                            cursorColor = Green,
                            focusedTextColor = Color.White,
                            unfocusedTextColor = Color.White
                        ),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                        singleLine = true,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 6.dp)
                    )
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    OutlinedTextField(
                        value = uiState.name,
                        onValueChange = { viewModel.onNameChange(it) },
                        label = { Text("Nome") },
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = Green,
                            unfocusedBorderColor = Color.Gray,
                            focusedLabelColor = Green,
                            unfocusedLabelColor = Color.LightGray,
                            focusedLeadingIconColor = Green,
                            unfocusedLeadingIconColor = Color.Gray,
                            cursorColor = Green,
                            focusedTextColor = Color.White,
                            unfocusedTextColor = Color.White
                        ),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                        singleLine = true,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 6.dp)
                    )
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    OutlinedTextField(
                        value = uiState.cpf,
                        onValueChange = { viewModel.onCpfChange(it) },
                        label = { Text("CPF/CNPJ:") },
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = Green,
                            unfocusedBorderColor = Color.Gray,
                            focusedLabelColor = Green,
                            unfocusedLabelColor = Color.LightGray,
                            focusedLeadingIconColor = Green,
                            unfocusedLeadingIconColor = Color.Gray,
                            cursorColor = Green,
                            focusedTextColor = Color.White,
                            unfocusedTextColor = Color.White
                        ),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                        singleLine = true,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 8.dp)
                            .weight(2f)
                    )
                    OutlinedTextField(
                        value = uiState.rg,
                        onValueChange = { viewModel.onRgChange(it) },
                        label = { Text("RG/IE:") },
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = Green,
                            unfocusedBorderColor = Color.Gray,
                            focusedLabelColor = Green,
                            unfocusedLabelColor = Color.LightGray,
                            focusedLeadingIconColor = Green,
                            unfocusedLeadingIconColor = Color.Gray,
                            cursorColor = Green,
                            focusedTextColor = Color.White,
                            unfocusedTextColor = Color.White
                        ),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                        singleLine = true,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 6.dp)
                            .weight(1f)
                    )

                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    OutlinedTextField(
                        value = uiState.adress,
                        onValueChange = { viewModel.onAdressChange(it) },
                        label = { Text("Endereço:") },
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = Green,
                            unfocusedBorderColor = Color.Gray,
                            focusedLabelColor = Green,
                            unfocusedLabelColor = Color.LightGray,
                            focusedLeadingIconColor = Green,
                            unfocusedLeadingIconColor = Color.Gray,
                            cursorColor = Green,
                            focusedTextColor = Color.White,
                            unfocusedTextColor = Color.White
                        ),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                        singleLine = true,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 6.dp)
                    )
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    OutlinedTextField(
                        value = uiState.compAdress,
                        onValueChange = { viewModel.onCompAdressChange(it) },
                        label = { Text("Complemento:") },
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = Green,
                            unfocusedBorderColor = Color.Gray,
                            focusedLabelColor = Green,
                            unfocusedLabelColor = Color.LightGray,
                            focusedLeadingIconColor = Green,
                            unfocusedLeadingIconColor = Color.Gray,
                            cursorColor = Green,
                            focusedTextColor = Color.White,
                            unfocusedTextColor = Color.White
                        ),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                        singleLine = true,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 6.dp)
                    )
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    OutlinedTextField(
                        value = uiState.neighborhood,
                        onValueChange = { viewModel.onNeighborhoodChange(it) },
                        label = { Text("Bairro:") },
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = Green,
                            unfocusedBorderColor = Color.Gray,
                            focusedLabelColor = Green,
                            unfocusedLabelColor = Color.LightGray,
                            focusedLeadingIconColor = Green,
                            unfocusedLeadingIconColor = Color.Gray,
                            cursorColor = Green,
                            focusedTextColor = Color.White,
                            unfocusedTextColor = Color.White
                        ),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                        singleLine = true,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 6.dp)
                            .weight(2f)
                    )
                    OutlinedTextField(
                        value = uiState.cep,
                        onValueChange = { viewModel.onCepChange(it) },
                        label = { Text("CEP:") },
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = Green,
                            unfocusedBorderColor = Color.Gray,
                            focusedLabelColor = Green,
                            unfocusedLabelColor = Color.LightGray,
                            focusedLeadingIconColor = Green,
                            unfocusedLeadingIconColor = Color.Gray,
                            cursorColor = Green,
                            focusedTextColor = Color.White,
                            unfocusedTextColor = Color.White
                        ),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                        singleLine = true,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 6.dp)
                            .weight(1f)
                    )

                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    OutlinedTextField(
                        value = uiState.city,
                        onValueChange = { viewModel.onCityChange(it) },
                        label = { Text("Cidade:") },
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = Green,
                            unfocusedBorderColor = Color.Gray,
                            focusedLabelColor = Green,
                            unfocusedLabelColor = Color.LightGray,
                            focusedLeadingIconColor = Green,
                            unfocusedLeadingIconColor = Color.Gray,
                            cursorColor = Green,
                            focusedTextColor = Color.White,
                            unfocusedTextColor = Color.White
                        ),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                        singleLine = true,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 6.dp)
                            .weight(3f)
                    )
                    OutlinedTextField(
                        value = uiState.state,
                        onValueChange = { viewModel.onStateChange(it) },
                        label = { Text("UF:") },
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = Green,
                            unfocusedBorderColor = Color.Gray,
                            focusedLabelColor = Green,
                            unfocusedLabelColor = Color.LightGray,
                            focusedLeadingIconColor = Green,
                            unfocusedLeadingIconColor = Color.Gray,
                            cursorColor = Green,
                            focusedTextColor = Color.White,
                            unfocusedTextColor = Color.White
                        ),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                        singleLine = true,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 6.dp)
                            .weight(1f)
                    )

                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    OutlinedTextField(
                        value = formatPhoneNumber(uiState.phone),
                        onValueChange = { newText ->
                            viewModel.onPhoneChange(newText.filter { it.isDigit() }.take(11))
                        },
                        label = { Text("Fone:") },
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = Green,
                            unfocusedBorderColor = Color.Gray,
                            focusedLabelColor = Green,
                            unfocusedLabelColor = Color.LightGray,
                            focusedLeadingIconColor = Green,
                            unfocusedLeadingIconColor = Color.Gray,
                            cursorColor = Green,
                            focusedTextColor = Color.White,
                            unfocusedTextColor = Color.White
                        ),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
                        singleLine = true,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 6.dp)
                    )
                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    OutlinedTextField(
                        value = uiState.email,
                        onValueChange = {
                            viewModel.onEmailChange(it)
                            viewModel.setEmailValid(isValidEmail(it))
                        },
                        isError = !uiState.emailIsValid && uiState.email.isNotBlank(),
                        label = { Text("E-mail:") },
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = Green,
                            unfocusedBorderColor = Color.Gray,
                            focusedLabelColor = Green,
                            unfocusedLabelColor = Color.LightGray,
                            focusedLeadingIconColor = Green,
                            unfocusedLeadingIconColor = Color.Gray,
                            cursorColor = Green,
                            focusedTextColor = Color.White,
                            unfocusedTextColor = Color.White
                        ),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                        singleLine = true,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 6.dp)
                    )
                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    OutlinedTextField(
                        value = uiState.rdSocial,
                        onValueChange = {
                            viewModel.onRdSocialChange(it)
                        },
                        label = { Text("Rede Social:") },
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = Green,
                            unfocusedBorderColor = Color.Gray,
                            focusedLabelColor = Green,
                            unfocusedLabelColor = Color.LightGray,
                            focusedLeadingIconColor = Green,
                            unfocusedLeadingIconColor = Color.Gray,
                            cursorColor = Green,
                            focusedTextColor = Color.White,
                            unfocusedTextColor = Color.White
                        ),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                        singleLine = true,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 6.dp)
                    )
                }
                Spacer(modifier = Modifier.height(100.dp))
            }

            SmallFloatingActionButton(
                onClick = { /* ação */ },
                containerColor = Orange,
                contentColor = Color.White,
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(8.dp)
                    .navigationBarsPadding()
            ) {
                Icon(
                    imageVector = Icons.Default.Check,
                    contentDescription = "Configurações"
                )
            }
        }
    }
}

fun formatPhoneNumber(input: String): String {
    val digits = input.filter { it.isDigit() }.take(11)

    return when {
        digits.isEmpty() -> ""
        digits.length <= 2 -> "(${digits.padEnd(2, '_')})"
        digits.length <= 6 -> "(${digits.substring(0, 2)}) ${digits.substring(2)}"
        digits.length <= 10 -> "(${digits.substring(0, 2)}) ${
            digits.substring(
                2,
                6
            )
        }-${digits.substring(6)}"

        else -> "(${digits.substring(0, 2)}) ${digits.substring(2, 7)}-${digits.substring(7, 11)}"
    }
}

fun isValidEmail(email: String): Boolean {
    return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
}


@Preview
@Composable
private fun CustomerRegistrationPrev() {
    CustomerRegistration(viewModel = CustomerViewModel())
}