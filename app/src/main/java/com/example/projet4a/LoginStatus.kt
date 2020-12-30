package com.example.projet4a

import android.provider.ContactsContract
import com.example.projet4a.domaine.Password

sealed class LoginStatus

data class LoginSuccess(val email: String, val password: String): LoginStatus()
object LoginError: LoginStatus()

