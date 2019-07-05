package Lambdas

fun main() {
    val strings = listOf("summer", "spring", "winter", "fall")
    println(strings.javaClass)

    val emptyList = emptyList<String>()
    println(emptyList.javaClass)

    if (!emptyList.isEmpty()) {
        println(emptyList[0])
    }

    val notNullList = listOfNotNull("Hey", null, "goodbye")
    println(notNullList)

    val arrayList = arrayListOf(1, 2, 4)
    println(arrayList.javaClass)

    val mutableList = mutableListOf<Int>(1,2,3)
    println(mutableList.javaClass)


    println(mutableList[2])
    mutableList[1] = 20
    println(mutableList)


    val array = arrayOf("blue", "orange", "yellow")
    val colorList = listOf(*array)
    val colored = array.toList()
    println(colorList)
    println(colored)
}