package Functions

fun main() {
    println(labelMultiply(3, 4))

    val emp = Employee("Julio da Gaita")
    println(emp.upperCaseFirstName())

    val carOne = Car("Blue", "Monza",1991)
    val carTwo = Car("Red", "Voyage", 1998)
    val carThree = Car("Green", "Beatle", 2002)

    printColors(carOne, carTwo, carThree)

    println("====================================================")

    val manyCars = arrayOf(carOne, carTwo, carThree)
    printColors(*manyCars)

    val moreCars = arrayOf(carThree, carThree)
    val carFour = carTwo.copy()
    val lotsOfCars = arrayOf(*manyCars, *moreCars, carFour)
    for (c in lotsOfCars) {
        println(c)
    }

    println("====================================================")

    println(Utils().upperFirtsAndLast("nemo living in ocean"))

    val t = "dori living in ocean too"
    println(t.upperFirtsAndLast())
}


fun String.upperFirtsAndLast(): String {
    val upperFirst = substring(0, 1).toUpperCase() + substring(1)
    return upperFirst.substring(0, upperFirst.length -1) +
            upperFirst.substring(upperFirst.length -1, upperFirst.length).toUpperCase()
}

fun printColors (vararg cars: Car) {
    for (car in cars) {
        println(car.color)
    }
}

fun whatever() = 2 * 5

fun labelMultiply(operandOne: Int, operandTwo: Int, label: String = "The result is: "): String =
    "$label ${operandOne * operandTwo}"

class Employee(val firstName: String) {
    fun upperCaseFirstName() = firstName.toUpperCase()
}

data class Car(val color: String, val model: String, val year: Int) {

}
