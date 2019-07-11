package Lambdas

fun main() {

    val immutableMap = mapOf<Int, Vrum>(1 to Vrum("red", "toyota", 2012),
        2 to Vrum("yellow", "Honda", 2010),
        3 to Vrum("green", "volks", 2005),
        17 to Vrum("white", "Honda", 2003),
        8 to Vrum("black", "Chevrolet", 2019)
    )

    println(immutableMap.asSequence().filter { it.value.model == "Honda" }
        .map { it.value.color })

    println("=============================")

    listOf("Nemo", "Dori", "Shark", "Pumba").asSequence()
        //.filter { println("filtering $it"); it[0] == "N" }
        .map { println("mapping $it"); it.toUpperCase() }
        .find { it.endsWith("o") }
}

data class Vrum(val color: String, val model: String, val year: Int) {

}