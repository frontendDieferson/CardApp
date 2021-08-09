package com.example.cardapp.data

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class BusinessCardRepository (private val dao: BusinessCardDao) {

   fun insert(BusinessCard: BusinessCard) = runBlocking {
       launch(Dispatchers.IO) {
           dao.insert(BusinessCard)
       }
   }

    fun getAll() = dao.getAll()

}