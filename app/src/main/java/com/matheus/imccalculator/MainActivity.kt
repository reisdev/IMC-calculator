package com.matheus.imccalculator

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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
        var person: Person
        try {
            person = Person(nameInput.text.toString(), weightInput.text.toString(), heightInput.text.toString(), ageInput.text.toString())
            var param = Bundle()
            param.putSerializable("person",person)
            var it = Intent(this,ResultActivity::class.java)
            it.putExtras(param)
            startActivity(it)
        }
        catch(e: NumberFormatException){
        }

    }
}
