package Inheritance.javacode

import Inheritance.CompanyCommunications as Empresa
import Inheritance.topLevel
import Inheritance.Department.*
import Inheritance.upperFirtsAndLast as hoc

fun main() {
    topLevel("Bubba is here!")
    println(Empresa.getCopurightLine())
    println(IT.getDeptInfo())
    println(ACCOUNTING.getDeptInfo())
    println("bulbassauro".hoc())
}