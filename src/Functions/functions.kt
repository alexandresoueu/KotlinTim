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
