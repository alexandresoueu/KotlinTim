package Lambdas

import java.time.Year

fun main() {
    val immutableMap = mapOf<Int, Car>(1 to Car("Blue",  "Golf", 2011),
        2 to Car("Green", "Omega", 1988),
        3 to Car("Red", "Mustang", 2015)
    )

    println(immutableMap.javaClass)
    println(immutableMap)

    val mutableMap = hashMapOf<String, Car>("Mike's " to Car("Gray", "Ferrari", 2002),
        "Jaime's" to Car("Yellow", "Camaro", 1977),
        "Moe's" to Car("Pink", "Beatle", 1966))

    println(mutableMap.javaClass)
    println(mutableMap)
    mutableMap.put("Morgana's Car ", Car("Purple", "Corvette", 1950))
    println("=====================================================")

    for ((key, value) in mutableMap){
        println(key)
        println(value)
    }


    println("=====================================================")

    val pair = Pair(10, "ten")
    //val firstValue = pair.first
    //val secondValue = pair.second

    val (firstValue, secondValue) = pair
    println(firstValue)
    println(secondValue)
    println("=====================================================")

    val car = Car("Brown", "Pointer", 1969)
    val (color, model, year) = car
    println("color is ${color}, model is ${model} and year is ${year}")

}

data class Car(val color: String, val model: String, val year: Int) {
}