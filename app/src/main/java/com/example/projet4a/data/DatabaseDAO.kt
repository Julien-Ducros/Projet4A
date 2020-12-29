package com.example.projet4a.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.projet4a.domaine.User
import kotlin.reflect.jvm.internal.impl.renderer.KeywordStringsGenerated

@Dao
interface DatabaseDAO {
    @Query ( "SELECT * FROM userlocal")
    fun getAll(): List <UserLocal>

    @Query( "SELECT * FROM userlocal WHERE email LIKE :email ADD")
    fun findByName(email: String): UserLocal

    @Insert
    fun insert(user: UserLocal)

    @Delete
    fun delete(user: UserLocal)
    }



