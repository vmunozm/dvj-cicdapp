package com.eafit.calculatordvj.model

class Calculator {
    fun square(number: Double): Double {
        return number * number
    }

    fun cube(number: Double): Double {
        return number * number * number
    }

    fun sum(number1: Double, number2: Double): Double {
        return number1 + number2
    }

    fun subtract(number1: Double, number2: Double): Double {
        return number1 - number2
    }
}
