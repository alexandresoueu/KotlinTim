package Lambdas

fun main() {

    val bikeOne = mutableListOf(Motorcycle(), Motorcycle())
    val bikeTwo: MutableList<Motorcycle> = mutableListOf()
    copyMotorcycle(bikeOne, bikeTwo)

    val hondaOne = mutableListOf(Honda(), Honda())
    val hondaTwo: MutableList<Honda> = mutableListOf()
    copyMotorcycle(hondaOne, hondaTwo)

    copyMotorcycle(bikeOne, hondaTwo)

    val bikeThree: MutableList<Motorcycle> = mutableListOf(Honda(), Honda())
}


fun <T: Motorcycle> copyMotorcycle(source: MutableList<out T>, destination: MutableList<T>) {
    for (bike in source) {
        destination.add(bike)
    }
}

open class Motorcycle {

}

class Honda:Motorcycle() {

}

class Yamaha:Motorcycle() {

}

