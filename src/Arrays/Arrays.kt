package Arrays

import DataTypes.DummyClass
import java.math.BigDecimal

fun main() {

    val names = arrayOf("Nemo", "Dori", "Bilu", "Zaira")
    println("Names default is: ${names}")

    val longsOne = arrayOf(1L, 2L, 3L)

    val longsTwo = arrayOf<Long>(1, 2, 3, 4)

    val longsThree = arrayOf(1, 2, 3, 4)

    println("ArrayOne is a Long Array? ${longsOne is Array<Long>}")
    println("ArrayTwo is a Long Array? ${longsTwo is Array<Long>}")
    println("ArrayThree is a Int Array? ${longsThree is Array<Int>}")

    println("Position 1 in longsOne is equal the same position in longsTwo? ${longsOne[1] === longsTwo[1]}")

    val evenNumbers = Array(16){ i -> i * 2 }

    for (number in evenNumbers) {
        println("The number is: ${number}")
    }

    val lotsOfNumbers = Array(100000) { i -> i + 1 }

    val allZeroes = Array(100) { 0 }

    var someArray: Array<Int>
    someArray = arrayOf(1, 2, 3, 4)

    for (number in someArray) {
        println("This array number is: ${number}")
    }

    someArray = Array(7) { i -> ( i + 1 ) * 10 }

    for (number in someArray) {
        println(number)
    }

    val mixedArray = arrayOf("Quechua", 30, BigDecimal(11.6), 'j') //formatter bigDecimal
    for (element in mixedArray){
        println("This element: ${element}")
    }

    println("mixedArray is Any array? ${mixedArray is Array<Any>}")

    var myIntArray = intArrayOf(1, 2, 554, 48)
    DummyClass().printNumbers(myIntArray)

    var someOtherArray = IntArray(5)
    for (number in someOtherArray) {
        println("Some other array is: ${number}")
    }
    println("========================================================")

    DummyClass().printNumbers(evenNumbers.toIntArray())
}