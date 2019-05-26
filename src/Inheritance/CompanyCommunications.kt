package Inheritance

import java.time.Year

fun main() {
    println(CompanyCommunications.getTagLine())
    println(CompanyCommunications.getCopurightLine())
    println("========================================")
    println(SomeClass.accessPrivateVar())
    println("========================================")

    val someClassOne = SomeClass.justAssign("nemo living in ocean")
    val someClassTwo = SomeClass.upperOrLowerCase("Dori swimming in oceand!", false)

    println(someClassOne.someString)
    println(someClassTwo.someString)
}

object CompanyCommunications {
    val currentYear = Year.now().value

    fun getTagLine() = "Our Company"
    fun getCopurightLine() = "Company \u00A9 $currentYear Our Company."
}

class SomeClass private constructor(val someString: String) {

    companion object {
        private val privateVar = 6

        fun accessPrivateVar() = "I'm accessing privateVar $privateVar"

        fun justAssign(str: String) = SomeClass(str)
        fun upperOrLowerCase(str: String, lowerCase: Boolean): SomeClass {
            if (lowerCase) {
                return SomeClass(str.toLowerCase())
            } else {
                return SomeClass(str.toUpperCase())
            }
        }
    }
}