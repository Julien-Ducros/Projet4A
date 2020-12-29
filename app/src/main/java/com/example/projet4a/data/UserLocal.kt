package com.example.projet4a.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.projet4a.domaine.User

@Entity
data class UserLocal (
    @ColumnInfo(name = "email") val email: String
){
    @PrimaryKey(autoGenerate = true) var uid: Int? = null
}


fun User.toData() : UserLocal{
    return UserLocal(
        email = this.email
    )
}

fun UserLocal.toEntity() : User{
    return User(
        email = this.email
    )
}