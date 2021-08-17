package com.example.csvred

class CsvParser {
    fun parser (line:String):Vaccine{
       val tokens =line.split(",")
        return Vaccine(
            Country = tokens[Constant.ConstantIndex.Country],
            Date = tokens[Constant.ConstantIndex.Date].toInt(),
            totalVaccine = tokens[Constant.ConstantIndex.totalVaccine].toInt()
        )
    }
}
