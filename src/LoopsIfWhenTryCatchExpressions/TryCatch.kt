package LoopsIfWhenTryCatchExpressions

import Inheritance.Something
import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

fun main() {
    println(getNumber("22.7") ?: "I Can't print the result.")

    //notImplementedYet("String")
}

fun notImplementedYet(something: String): Nothing {
    throw IllegalArgumentException("Implement me!")
}


fun getNumber(str: String): Int? {
    return try {
        Integer.parseInt(str)
    } catch (e: NumberFormatException) {
        null
    } finally {
        println("I'm in the finally block.")
    }
}