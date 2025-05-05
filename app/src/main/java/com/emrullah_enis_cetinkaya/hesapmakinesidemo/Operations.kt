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