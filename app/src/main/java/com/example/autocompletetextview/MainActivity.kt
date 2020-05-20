package com.example.autocompletetextview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
            //Auto cmplete text View, solo funciona con autoCompleteTextView NO FUNCIONAN CON TEXTVIEW NI EDITTEXT NI IMAGEVIEW
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

                //LISTA PAIS
        val paises = mutableListOf<String>()
        paises.add("Colombia")
        paises.add("Venezuela")
        paises.add("Colo")


        val myadapter =  ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, paises)

        autoCompleteTextView.setAdapter(myadapter)


    }




























}
