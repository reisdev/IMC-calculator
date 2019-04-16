package com.matheus.imccalculator

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*
import java.text.DecimalFormat

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        var it = getIntent()
        var param = it.getExtras()
        var person = param.getSerializable("person") as Person

        nameResult.text = person.getName()
        ageResult.text = "%d years".format(person.getAge())
        weightResult.text = "%.1f Kg".format(person.getWeight())
        heightResult.text = "%.2f m".format(person.getHeight())
        IMCResult.text = "%.1f Kg/m²".format(person.getIMC())

        if(person.getIMC() <  18.5){
            classResult.setText(R.string.underweight)
        } else if(person.getIMC() >= 18.5 && person.getIMC() < 24.9 ){
            classResult.setText(R.string.healthy)
        }else if(person.getIMC() >= 25 && person.getIMC() < 29.9 ){
            classResult.setText(R.string.overweight)
        }else if(person.getIMC() >= 30.0 && person.getIMC() < 34.9 ){
            classResult.setText(R.string.obesity1)
        } else if(person.getIMC() >= 35 && person.getIMC() < 39.9 ){
            classResult.setText(R.string.obesity2)
        }else if(person.getIMC() >= 40){
            classResult.setText(R.string.obesity3)
        }
        newCalculation.setOnClickListener{
            goBack()
        }
    }

    private fun goBack() {
        var it = Intent(this,MainActivity::class.java)
        it.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
        startActivity(it)
    }
}

