/*License

This project is licensed under the GNU General Public License v3.0.

Copyright (c) 2025 Emrullah Enis Çetinkaya

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program. If not, see <https://www.gnu.org/licenses/>.
*/



package com.emrullah_enis_cetinkaya.hesapmakinesidemo

class Operations {

    private var numbers= ArrayList<Int>()
    private var isaretler=ArrayList<Char>()

    fun parcalama(islem:String){
        numbers.clear()
        isaretler.clear()
        if (islem!=""){
            val parcalar=Regex("(\\d+|[+\\-/x])").findAll(islem).map { it.value }.toList()
            for (parca in parcalar){
                if (parca.matches(Regex("\\d+"))){
                    numbers.add(parca.toInt())
                }
                else{
                    isaretler.add(parca[0])
                }
            }
        }
    }
    fun getNumbers():ArrayList<Int>{
        return numbers
    }
    fun getIsaretler():ArrayList<Char>{
        return isaretler
    }
    fun kontrolFonksiyonu(islem: String):Boolean{
        val islemHatasi=Regex("([+\\-/x]{2,})")
        if (islemHatasi.containsMatchIn(islem)){
            return true
        }
        else{
            return false
        }
    }
}