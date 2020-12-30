package com.example.projet4a.injection

import android.content.Context
import androidx.room.Room
import com.example.projet4a.MainViewModel
import com.example.projet4a.data.AppDatabase
import com.example.projet4a.data.DatabaseDAO
import com.example.projet4a.data.UserRepository
import com.example.projet4a.domaine.CreateUserUseCase
import com.example.projet4a.domaine.GetUserUseCase
import org.koin.android.ext.koin.androidContext
import org.koin.core.module.Module
import org.koin.dsl.module

val presentationModule = module {
    factory { MainViewModel(get(), get())
     }
}

val domaineModule : Module =module {
    factory { CreateUserUseCase(get()) }
    factory { GetUserUseCase(get()) }
}

val dataModule : Module = module {
   single { UserRepository(get()) }
    single { createDataBase(androidContext()) }
}

fun createDataBase(context: Context): DatabaseDAO{
    val appDatabase = Room.databaseBuilder(context,
        AppDatabase::class.java, "database-name"
    ).build()
    return appDatabase.databaseDAO()
}