import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.DarkGray
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.neto.orlando.buymore.viewmodel.LoginViewModel
import br.com.neto.orlando.buymore.ui.theme.Green
import br.com.neto.orlando.buymore.ui.theme.Orange
import br.com.neto.orlando.buymore.ui.theme.MyDarkGray

@Composable
fun LoginScreen(
    onLoginSuccess: () -> Unit,
    viewModel: LoginViewModel = viewModel()
) {

    val uiState by viewModel.uiState.collectAsState()

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MyDarkGray
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(32.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "LOGIN",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                color = Orange,
                modifier = Modifier.padding(bottom = 24.dp)
            )

            OutlinedTextField(
                value = uiState.email,
                onValueChange = { viewModel.onEmailChange(it) },
                label = { Text("Email") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = null,
                        tint = Green
                    )
                },
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
                    .padding(bottom = 16.dp)
            )

            OutlinedTextField(
                value = uiState.password,
                onValueChange = { viewModel.onPasswordChange(it) },
                label = { Text("Password") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Lock,
                        contentDescription = null,
                        tint = Green
                    )
                },
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
                visualTransformation = PasswordVisualTransformation(),
                singleLine = true,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 24.dp)
            )

            Button(
                onClick = {
                    onLoginSuccess()
                },
                colors = ButtonDefaults.buttonColors(containerColor = Orange),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Text("LOGIN", color = DarkGray, fontWeight = FontWeight.Bold)
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Forgot password?",
                color = Green,
                fontSize = 14.sp,
                modifier = Modifier.clickable {
                    // lógica de recuperação de senha
                }
            )
        }
    }
}

@Preview
@Composable
private fun LoginScreenPrev() {
    LoginScreen(onLoginSuccess = {}, viewModel = LoginViewModel())
}
