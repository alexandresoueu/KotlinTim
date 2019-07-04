@file:Suppress("REDUNDANT_LABEL_WARNING")

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

    println("=================================== COUNT")
    println(countTo100())
    println("=================================== COUNT LAMBDA")
    println(lambdaCountTo100())
    println("=================================== COUNT SHORT LAMBDA")
    println(shortLambdaCountTo100())
    println("=================================== COUNT GREAT SHORT LAMBDA")
    println(greatShortLambdaCountTo100())

    println("**************************************************************")
    findByLastName(employees, "of Ocean")
    findByLastName(employees, "Little Jaime")

    println("##################################")

    "Little Jaims is a Postman".apply bubba@ {
        "Keys is a boy.".apply creed@ {
            println(toLowerCase())
            println(toUpperCase())
            println(this@bubba.toLowerCase())
        }
        //println(this@creed.toUpperCase())
        println(toLowerCase())
        println(toUpperCase())
    }

}

fun findByLastName(employees: List<Employee>, lastName: String) {
    employees.forEach {
        if (it.lastName == lastName) {
            println("Yes, this is last name bro. $lastName")
            return
        }
    }
    println("Nope, there's no employee with the last name $lastName")
}


fun greatShortLambdaCountTo100() =
    StringBuilder().apply() {
        for (index in 1..99) {
            append(index)
            append(", ")
        }
        append(100)
    }.toString()

fun shortLambdaCountTo100() =
    with(StringBuilder()) {
        for (index in 1..99) {
            append(index)
            append(", ")
        }
        append(100)
        toString()
    }

fun lambdaCountTo100(): String {
    val numbers = StringBuilder()
    return with(numbers) {
        for (index in 1..99) {
            append(index)
            append(", ")
        }
        append(100)
        toString()
    }
}

fun countTo100(): String {
    val numbers = StringBuilder()
    for (index in 1..99) {
        numbers.append(index)
        numbers.append(", ")
    }
    numbers.append(100)
    return numbers.toString()
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