package Lambdas

import java.math.BigDecimal

fun main() {
    val list = mutableListOf("Hey Jude!")
    list.add("Another the wall")
    list.printCollection()
    list[0].toUpperCase()

    val bdList = mutableListOf(BigDecimal(-33.08), BigDecimal(10.10), BigDecimal(2019.99))
    bdList.printCollection()

}

fun <T> List<T>.printCollection() {
    for (item in this) {
        println(item)
    }
}