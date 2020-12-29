package com.example.projet4a.data

import com.example.projet4a.domaine.User

class UserRepository(private val databaseDAO: DatabaseDAO) {

    suspend fun createUser(user: User){
        databaseDAO.insert(user.toData())
    }

    fun getUser(email: String) : User? {
        val userLocal :UserLocal =databaseDAO.findByName(email)
        return userLocal.toEntity()
    }

}