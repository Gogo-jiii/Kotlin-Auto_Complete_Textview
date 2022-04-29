package com.example.autocompletetextview

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var data = arrayOf<String?>("a", "b", "c", "aa", "bb", "cc", "aaa", "bbb", "ccc", "abc")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter: ArrayAdapter<*> = ArrayAdapter<Any?>(
            this,
            com.google.android.material.R.layout.support_simple_spinner_dropdown_item, data
        )
        autoCompleteTextView.setAdapter(adapter)
        autoCompleteTextView.setThreshold(2)
    }
}