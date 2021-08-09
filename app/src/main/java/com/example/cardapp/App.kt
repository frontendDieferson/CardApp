package com.example.cardapp

import android.app.Application
import com.example.cardapp.data.AppDatabase
import com.example.cardapp.data.BusinessCardRepository

class App : Application() {

    val database by lazy  {AppDatabase.getDatabase(this) }
    val repository by lazy {BusinessCardRepository(database.businessDao())}
}