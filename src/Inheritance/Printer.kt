package Inheritance

fun main() {
    val laserPrinter = LaserPrinter("Dori is blue fish! #3F46BF", 178)
    laserPrinter.printModel()

    SomethingElse("Eai Rapaziada!!!!")
}

abstract  class Printer(val modelName: String) {
    open fun printModel() = println("The model name of this printer is $modelName") //allows subclassing a class or overriding a member
    abstract fun bestSellingPrice(): Double //marks a class or member as abstract
}

open class LaserPrinter(modelName: String, ppm: Int): Printer(modelName) {
    final override fun printModel() = println("The model name of this laser printer is $modelName")
    override fun bestSellingPrice(): Double = 9.99 //marks a member as an override of a superclass member
}

class SpecialLaserPrinter(modelName: String, ppm: Int): LaserPrinter(modelName, ppm) {

}

open class Something: MySubInterface {
    val someProperty: String
    override val number: Int = 25

    constructor(someParameter: String) {
        someProperty = someParameter
        println("I'm in the parent's constructor........")
    }

    override fun myFunction(str: String): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun mySubFunction(num: Int): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

class SomethingElse: Something {
    constructor(someOtherParameter: String): super(someOtherParameter) {
        println("I'm in the child's constructor***********")
    }
}

interface MyInterface {
    val number: Int
    val number2: Int
        get() = number * 100

    fun myFunction(str: String) : String
}

interface MySubInterface: MyInterface {
    fun mySubFunction(num: Int): String
}