package com.example.jesse1.coderswag.Controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.jesse1.coderswag.Adapters.CategoryAdapter
import com.example.jesse1.coderswag.R
import com.example.jesse1.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories)

        categoryListView.adapter = adapter
    }
}
