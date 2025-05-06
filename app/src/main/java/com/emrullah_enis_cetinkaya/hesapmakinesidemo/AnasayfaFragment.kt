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

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.emrullah_enis_cetinkaya.hesapmakinesidemo.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
    lateinit var islem:String
    private var operation=Operations()
    private var numbers=operation.getNumbers()
    private var isaretler=operation.getIsaretler()
    private var sayi:Int=0
    lateinit var sharedPreferences:SharedPreferences
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        sharedPreferences=requireContext().getSharedPreferences("Uygulama Verisi",Context.MODE_PRIVATE)
        islem=sharedPreferences.getString("islem","")?:""
        binding=FragmentAnasayfaBinding.inflate(inflater, container, false)
        if (islem==""){
            islem="0"
            textEdit(islem)
        }
        textEdit(islem)

        binding.button0.setOnClickListener {

            textEdit(islem+"0")
        }
        binding.button1.setOnClickListener {

            textEdit(islem+"1")
        }
        binding.button2.setOnClickListener {

            textEdit(islem+"2")
        }
        binding.button3.setOnClickListener {

            textEdit(islem+"3")
        }
        binding.button4.setOnClickListener {

            textEdit(islem+"4")
        }
        binding.button5.setOnClickListener {

            textEdit(islem+"5")
        }
        binding.button6.setOnClickListener {

            textEdit(islem+"6")
        }
        binding.button7.setOnClickListener {

            textEdit(islem+"7")
        }
        binding.button8.setOnClickListener {

            textEdit(islem+"8")
        }
        binding.button9.setOnClickListener {

            textEdit(islem+"9")
        }
        binding.buttonbackspace.setOnClickListener {
            try {

                textEdit(islem.dropLast(1))
            }
            catch (e:StringIndexOutOfBoundsException){

            }
        }
        binding.buttonesit.setOnClickListener {
            try {
                if (operation.kontrolFonksiyonu(islem)){
                    Toast.makeText(requireContext(),"Hatalı işlem",Toast.LENGTH_LONG).show()
                }
                else{
                    refreshList()
                    try {
                        if (numbers.size>isaretler.size){
                            for ((i,parca) in isaretler.withIndex()){
                                when(parca){
                                    '/'->sayi=sayi/numbers[i+1]
                                    'x'->sayi=sayi*numbers[i+1]
                                    '+'->sayi=sayi+numbers[i+1]
                                    '-'->sayi=sayi-numbers[i+1]
                                }
                            }
                            textEdit(sayi.toString())
                        }
                    }
                    catch (e:ArithmeticException){
                        Toast.makeText(requireContext(),"Sayı sıfıra bölünemez!",Toast.LENGTH_LONG).show()
                    }

                }
            }
            catch (e:IndexOutOfBoundsException){

                textEdit("0")
            }
        }
        binding.buttoncarpi.setOnClickListener {

            textEdit(islem+"x")
        }
        binding.buttoneksi.setOnClickListener {

            textEdit(islem+"-")
        }
        binding.buttonarti.setOnClickListener {

            textEdit(islem+"+")
        }
        binding.buttonbolu.setOnClickListener {

            textEdit(islem+"/")
        }
        binding.buttonAC.setOnClickListener {

            textEdit("0")
        }


        return binding.root
    }
    fun textEdit(islemString: String){
        islem=islemString
        binding.textView2.text=islem
    }
    fun refreshList(){
        operation.parcalama(islem)
        numbers=operation.getNumbers()
        isaretler=operation.getIsaretler()
        sayi=numbers[0]
    }

    override fun onPause() {
        super.onPause()
        sharedPreferences.edit().putString("islem",islem).apply()
    }

    override fun onStop() {
        super.onStop()
        sharedPreferences.edit().putString("islem",islem).apply()

    }
}