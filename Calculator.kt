package com.example.myapplication2.Calculator_LV4

class Calculator (
    private val operation: AbstractOperation
) {
    fun operate(num1: Double, num2: Double): Double {
        return operation.operate(num1, num2)
    }
}
