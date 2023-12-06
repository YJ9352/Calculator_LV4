package com.example.myapplication.calculator;

class DivideOperation: AbstractOperation() {
    override fun operate(num1: Int, num2: Int): Double {
        return (num1 / num2).toDouble()
    }
}