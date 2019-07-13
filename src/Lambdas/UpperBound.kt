package Lambdas

fun main() {
    val ints = listOf(1, 2, 3, 4, 5)
    val shorts: List<Short?> = listOf(10, 20, 30, 40)
    val floats: List<Float?> = listOf(103.7f, -55.9f)
    val strings: List<String> = listOf("7", "8", "9")

    //convertToInt(ints)
    //convertToInt(shorts)
    //convertToInt(floats)

    //append(StringBuilder("String 1"), StringBuilder("String 2"))

    if (strings is List<String>) {
        println("It is a List of string.")
    }

    val listAny: Any = listOf("Nemo", "bobinho")
    if (listAny is List<*>) {
        println("It is a List of Any.")
    }

    //listAny = listOf(1, 2, 3)
    if (listAny is List<*>) {
        println("This list contains String")
        val strList = listAny as List<String>
        println(strList[1].replace("str", "string"))
    }

    printCollection(shorts)
    printCollection(strings)
}

fun <T> printCollection(collection: List<T>) {
    for (item in collection) {
        println(item)
    }
}

fun <T> append(itemOne: T, itemTwo: T)
    where T:CharSequence, T:Appendable{
    println("Result is ${itemOne.append(itemTwo)}")
}

fun <T:Number?> convertToInt(collection: List<T>) {
    for (num in collection) {
        println("${num?.toInt()}")
    }
}