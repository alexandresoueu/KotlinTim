package Inheritance

import java.time.Year

fun main() {
    println(CompanyCommunications.getTagLine())
    println(CompanyCommunications.getCopurightLine())
}

object CompanyCommunications {
    val currentYear = Year.now().value

    fun getTagLine() = "Our Company"
    fun getCopurightLine() = "Company \u00A9 $currentYear Our Company."
}