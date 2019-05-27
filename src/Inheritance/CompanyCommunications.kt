package Inheritance

import Functions.Employee
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
    println("========================================")

    var thisIsMutable = 57

    wantsSomeInterface(object: SomeInterface {
        override fun mustImplement(num: Int): String {
            thisIsMutable++
            return "This is from mustImplement: ${num * 100}"
        }
    })
    println(thisIsMutable)
    println("========================================")
    
    println(Department.IT.getDeptInfo())

}

enum class Department(val fullName: String, val numEmployees: Int) {
    HR("Human Resources", 5), IT("Information Technology", 10), 
    ACCOUNTING("Accounting", 3), SALES("Sales", 20)
    
    fun getDeptInfo() = "The $fullName department has $numEmployees employees."
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

interface SomeInterface {
    fun mustImplement(num: Int): String
}

fun wantsSomeInterface(si: SomeInterface) {
    println("Printing from wantsSomeInterface ${si.mustImplement(22)}")
}
