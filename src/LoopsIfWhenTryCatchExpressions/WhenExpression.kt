package LoopsIfWhenTryCatchExpressions

import java.math.BigDecimal

enum class Seasons {
    SPRING, SUMMER, FALL, WINTER
}

fun main() {
    val timeOfYear = Seasons.WINTER
    val str = when (timeOfYear) {
        Seasons.WINTER -> println("I need a coat")
        Seasons.FALL -> println("I need a Cap")
        Seasons.SPRING -> println("I need a Flower")
        Seasons.SUMMER -> println("I need a Ice Cream")
    }
    println(str)

    val num = 100

    when (num) {
        in 100..199 -> println("Num is until 100..199")
        200 -> println("Num is 200")
        300 -> println("Num is 300")
        else -> println("Doesn't match anything.")
    }

    val y = 10

    when (num) {
        y + 80 -> println("Y is 90")
        y + 90 -> println("Y is 100")
        y + 100 -> println("Y is 110")
        else -> println("Doesn't match anything.")

    }

    val obj: Any = "I'm a String"
    val obj2: Any = BigDecimal(25.2)
    val obj3: Any = 45

    val something: Any = obj2

    val z = when (something) {
        is String -> {
            println(something.toUpperCase())
            1
        }
        is BigDecimal -> {
            println(something.remainder(BigDecimal(10.5)))
            2
        }
        is Int -> {
            println("${something - 22}")
            3
        }
        else -> {
            println("I have no ideia")
            -2
        }
    }
    println(z)


}