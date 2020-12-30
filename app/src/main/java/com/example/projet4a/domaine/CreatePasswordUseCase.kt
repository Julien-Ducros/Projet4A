package com.example.projet4a.domaine

import com.example.projet4a.data.PasswordRepository

class CreatePasswordUseCase (private val passwordRepository: PasswordRepository){
    suspend fun invoke(password: Password){
        passwordRepository.createPassword(password)
    }

}