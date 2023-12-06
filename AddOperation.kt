package com.example.myapplication.calculator;

open class AddOperation: AbstractOperation() {
    override fun operate(num1: Int, num2: Int): Double {
        return (num1 + num2).toDouble()
    }
}