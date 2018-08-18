package com.example.jesse1.coderswag.Controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.jesse1.coderswag.R
import com.example.jesse1.coderswag.Utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
    }
}
