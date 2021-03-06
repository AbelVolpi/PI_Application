package com.projetointegrador.pi_application.viewmodel

import androidx.lifecycle.ViewModel
import com.projetointegrador.pi_application.repository.UserRepository

class LoginViewModel : ViewModel() {

    private val userRepository = UserRepository()

    fun login(email: String, password: String) = userRepository.login(email, password)

}