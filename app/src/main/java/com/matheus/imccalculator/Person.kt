package com.matheus.imccalculator

import java.io.Serializable

/**
 * Created by Matheus Reis <matheusdrdj@gmail.com> on 12/04/2019.
 */

public class Person : Serializable {
    var name: String = ""
    var weight : Double = 0.0
    var height: Double = 0.0
    var age : Int = 0

    constructor(n: String,w: String,h: String,a: String){
        name = n
        weight = w.toDouble()
        height = h.toDouble()
        age = a.toInt()
    }
    fun IMC(): Double {
        return weight / height
    }
}