package com.matheus.imccalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        submitReport.setOnClickListener {
            submit()
        }
    }
    private fun submit(){
        var person = Person(nameInput.text.toString(),weightInput.text.toString(),heightInput.text.toString(),ageInput.text.toString())

    }
}
