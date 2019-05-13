package academy.learnprogramming.textadventure

fun main() {
    val helloOne = "Hello"
    val helloTwo = "Hello"

    println("/**/HelloOne os referentially equal helloTwo: ${helloOne === helloTwo}")

    println("HelloOne os structurally equal helloTwo: ${helloOne == helloTwo}")

    var num = 2988

    val text: Any = "the Any type ****"
    if (text is String) {
        println(text.toUpperCase())
    }

    println(
        """   1
        |  11
        | 111
        |1111""".trimMargin()
    )


}