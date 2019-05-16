package NullReference

fun main() {
    val str: String? = "This isn't null"
    str?.let { printText(it) }

    val strTwo = str!!
    val str3 = strTwo.toUpperCase()
    println("STREE THREE: ${str3}")

    val str4 : String? = null
    val anotherStr = "This isn't nullable"

    println( str4 == anotherStr)

    println("======================================")

    val nullableInts = arrayOfNulls<Int>(8)

    for (i in nullableInts) {
        println(i)
    }

    println("This is nullableInts position 3:  ${nullableInts[3]}")

}

fun printText(text: String) {
    println(text)
}