package com.example.projet4a.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(UserLocal::class), version = 1)
abstract class AppDatabase : RoomDatabase(){
    abstract fun databaseDAO(): DatabaseDAO
}