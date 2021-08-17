package com.example.csvred

object DataManager {
    private val vaccineList = mutableListOf<Vaccine>()
    fun AddVaccine (vaccine:Vaccine){
        vaccineList.add(vaccine)
    }
}