package br.com.neto.orlando.buymore.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CustomerViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(CustomerUiState())
    val uiState: StateFlow<CustomerUiState> = _uiState.asStateFlow()

    fun onIdChange(value: String) { _uiState.update { it.copy(id = value) } }
    fun onNameChange(value: String) { _uiState.update { it.copy(name = value) } }
    fun onCpfChange(value: String) { _uiState.update { it.copy(cpf = value) } }
    fun onRgChange(value: String) { _uiState.update { it.copy(rg = value) } }
    fun onAdressChange(value: String) { _uiState.update { it.copy(adress = value) } }
    fun onCompAdressChange(value: String) { _uiState.update { it.copy(compAdress = value) } }
    fun onNeighborhoodChange(value: String) { _uiState.update { it.copy(neighborhood = value) } }
    fun onCepChange(value: String) { _uiState.update { it.copy(cep = value) } }
    fun onCityChange(value: String) { _uiState.update { it.copy(city = value) } }
    fun onStateChange(value: String) { _uiState.update { it.copy(state = value) } }
    fun onPhoneChange(value: String) { _uiState.update { it.copy(phone = value) } }
    fun onEmailChange(value: String) { _uiState.update { it.copy(email = value) } }
    fun onRdSocialChange(value: String) { _uiState.update { it.copy(rdSocial = value) } }
    fun setEmailValid(isValid: Boolean) { _uiState.update { it.copy(emailIsValid = isValid) } }
}
