package com.example.projet4a.data

import com.example.projet4a.domaine.Password

class PasswordRepository(private val databaseDAO: DatabaseDAO) {

    suspend fun createPassword(password: Password) {
        databaseDAO.insert(password.toData())

    }

    fun getPassword(password: String) : Password
    {
        val passwordLocal: PasswordLocal = databaseDAO.findByName(password)
        return passwordLocal.toEntity()
    }

}
