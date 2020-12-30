package com.example.projet4a.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.projet4a.domaine.Password

@Entity
data class PasswordLocal(
    @ColumnInfo(name = "password") val passwordLocal: String
){
    @PrimaryKey(autoGenerate = true) var uid: Int? = null
}

fun Password.toData(): PasswordLocal{
    return PasswordLocal(
        passwordLocal = this.password
    )
}

fun PasswordLocal.toEntity(): Password {
    return Password(
        password = this.passwordLocal
    )
}