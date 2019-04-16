package com.matheus.imccalculator

import java.io.Serializable

/**
 * Created by Matheus Reis <matheusdrdj@gmail.com> on 12/04/2019.
 */

class Person : Serializable {
    private var name: String = ""
    private var weight : Double = 0.0
    private var height: Double = 0.0
    private var age : Int = 0
    private var IMC : Double = 0.0

    constructor(n: String,w: String,h: String,a: String){
        name = n
        weight = w.replace(",",".").toDouble()
        height = h.replace(",",".").toDouble()
        age = a.toInt()
        IMC = weight / (height*height)
    }
    fun getName(): String {
        return name
    }
    fun getAge(): Int {
        return age
    }
    fun getWeight(): Double {
        return weight
    }
    fun getHeight(): Double {
        return height
    }
    fun getIMC(): Double {
        return IMC
    }
}