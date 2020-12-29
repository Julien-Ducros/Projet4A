package com.example.projet4a.domaine

import com.example.projet4a.data.UserRepository

class CreateUserUseCase(
    private val userRepository: UserRepository
) {
    suspend fun invoke(user: User){
        userRepository.createUser(user)
    }
}