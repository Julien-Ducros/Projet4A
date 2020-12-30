package com.example.projet4a.domaine

import com.example.projet4a.data.PasswordRepository
import com.example.projet4a.data.UserRepository

class GetPasswordUseCase (
    private val passwordRepository: PasswordRepository) {
    suspend fun invoke(password: String) : Password {
        return passwordRepository.getPassword(password)
    }
}


