package com.example.projet4a.data

import androidx.room.*

@Dao
interface DatabaseDAO {
    @Query ( "SELECT * FROM userlocal, passwordlocal")


    fun getAll(): List <UserLocal>
    fun getAll(): List<PasswordLocal>

    @Query( "SELECT * FROM userlocal WHERE email LIKE :email LIMIT 1")
    fun findByName(email: String): UserLocal?
    fun findByName(passwordLocal: String): PasswordLocal

    @Insert
    fun insert(user: PasswordLocal)
    @Insert
    fun insert(password: PasswordLocal)

    @Delete
    fun delete(user: UserLocal)
    @Delete
    fun delete(password:  PasswordLocal)
    }





