package com.example.graphicscomponents

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.AdapterListUpdateCallback
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class TextViewActivity : Activity() {
    lateinit var tvContador: TextView
    lateinit var btnButon: Button

    var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_text_view)

        tvContador = findViewById(R.id.tvContador)
        btnButon = findViewById(R.id.btnBoton)

        btnButon.setOnClickListener {
            contador++
            tvContador.text = contador.toString()
            Toast.makeText(this, contador.toString(), Toast.LENGTH_LONG).show()
        }
    }
}