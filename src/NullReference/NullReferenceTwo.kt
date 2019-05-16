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

}

fun printText(text: String) {
    println(text)
}