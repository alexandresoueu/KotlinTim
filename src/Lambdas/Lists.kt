package Lambdas

fun main() {
    val strings = listOf("spring", "fall", "summer", "winter", "spring")
    val colorList = listOf("blue", "white", "orange", "gray", "white", "orange")

    println("=============STRINGS===============")
    println(strings.last())
    println(strings.getOrNull(5))

    /*if (strings.size > 5) {
        println(strings[5])
    }*/

    println("=============INTS===============")

    val ints = listOf(1, 2, 3, 4, 5)
    println(ints.max())
    println(colorList.zip(strings))

    println("=============MERGED AND NO DUPLICATE===============")

    val mergedLists = listOf(strings, colorList)
    println(mergedLists)

    val combinerList = strings + colorList
    println(combinerList)

    val noDupsList = colorList.union(strings)
    println(noDupsList)

    val noDupColors = colorList.distinct()
    println(noDupColors)

    println("=============MUTABLE===============")

    val mutableSeasons = strings.toMutableList()
    mutableSeasons.add("some other season")
    println(mutableSeasons)
}