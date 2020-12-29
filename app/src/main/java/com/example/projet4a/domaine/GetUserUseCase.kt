package com.example.projet4a.domaine

import com.example.projet4a.data.UserRepository

class GetUserUseCase(
private val userRepository: UserRepository)
{
    suspend fun invoke(email: String) : User? {
        return userRepository.getUser(email)
    }
}