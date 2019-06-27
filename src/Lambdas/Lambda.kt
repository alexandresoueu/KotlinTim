package Lambdas

fun main() {
    //run { println("I'm in a Lambda!") }

    val employees = listOf(Employee("Nemo", "of Ocean", 2005),
        Employee("Dori","of Ocean", 2017),
        Employee("Bob", "Sponge", 2010),
        Employee("Felix", "Cat", 1999)
    )
    println(employees.minBy(Employee::startYear))

    var num = 10
    run {
        num += 15
        println(num)
    }

    run(::topLevel)
}

fun topLevel() = println("I'm in a function!")

fun useParameter(employees: List<Employee>, num: Int) {
    employees.forEach{
        println(it.firstName)
        println(num)
    }
}

data class Employee(val firstName: String, val lastName: String, val startYear: Int) {

}