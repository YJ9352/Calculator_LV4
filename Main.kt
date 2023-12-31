package com.example.myapplication2.Calculator_LV4

fun main(args: Array<String>) {

    println("숫자를 입력해주세요.")
    var num1 = readLine()!!.toDouble()

    println("연산자를 넣어주세요(+, -, /, *)")
    val operate = readLine()!!.toString()

    println("숫자를 입력해주세요.")
    var num2 = readLine()!!.toDouble()

    val AbstractOperation : AbstractOperation = when (operate) {
        "+" -> AddOperation()
        "-" -> SubstractOperation()
        "*" -> MultiplyOperation()
        "/" -> DivideOperation()
        else -> throw IllegalArgumentException("잘못된 입력입니다. 연산자만 넣어주세요.")
    }

    val calc = Calculator(AbstractOperation)
    val result = calc.operate(num1, num2)

    println("정답은 ${result}입니다.")
}