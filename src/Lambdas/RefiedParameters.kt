package Lambdas

import java.math.BigDecimal

fun main() {
    val mixedList: List<Any> = listOf("string", 1, BigDecimal(1234.4321), "fall", BigDecimal(-33.21))
    val bigDecimalsOnly = getElementsOfType<String>(mixedList)
    for (item in bigDecimalsOnly) {
        println(item)
    }
}

inline  fun <reified T>getElementsOfType(list: List<Any>): List<T> {
    val newList: MutableList<T> = mutableListOf()
    for (element in list) {
        if (element is T) {
            newList.add(element)
        }
    }
    return newList
}