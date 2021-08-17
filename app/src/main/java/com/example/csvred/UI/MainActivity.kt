package com.example.csvred.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.csvred.CsvParser
import com.example.csvred.DataManager
import com.example.csvred.databinding.ActivityMainBinding
import java.io.BufferedReader
import java.io.InputStreamReader

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    val LOG_TAG = "CSV"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ParseFile()

        }

    fun ParseFile(){
        val input = InputStreamReader(assets.open("country_vaccinations.csv"))
        val reder = BufferedReader(input)
        reder.forEachLine {
            val parser = CsvParser()
            val currentVaccine = parser.parser(it)
            DataManager.AddVaccine(currentVaccine)
           }
    }
    fun log(value:String){

        Log.v(LOG_TAG,value)
    }
}