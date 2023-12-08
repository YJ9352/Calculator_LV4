package com.example.myapplication2.Calculator_LV4

class DivideOperation: AbstractOperation() {
    override fun operate(num1: Double, num2: Double): Double {
        return (num1 / num2).toDouble()
    }
}