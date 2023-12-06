package com.example.myapplication.calculator;

class Calculator (
    private val operation: AbstractOperation
) {
    fun operate(num1: Int, num2: Int): Double {
        return operation.operate(num1, num2)
    }
}
