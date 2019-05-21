package AccessModifiers


val MY_CONSTANT = 100

fun main() {

    println("CONSTANT IS ${MY_CONSTANT}")

    val dori = Nemo("Zaira")
    println(dori.firstName)
    dori.fullTime = false
    println(dori.fullTime)

    val dolly = Nemo("Bob")
    println(dolly.firstName)
    println(dolly.fullTime)

    val MichaelDouglas = Nemo("Ghost", false)
    println(MichaelDouglas.firstName)
    println(MichaelDouglas.fullTime)

    println(Demo().dummy)

    println("==============================================")

    val monza = Car("gray", "monza shark", 1990)
    println(monza)

    val voyage = Car("gray", "voyage vintage", 1990)
    println(monza != voyage)

    val corsa = monza.copy()
    println(corsa)

    val uno = monza.copy(year = 2012)
    println(uno)

}


data class  Car(val color: String, val model: String, val year: Int) {

}


class Nemo (val firstName: String, fullTime: Boolean = true) {

    var fullTime = fullTime
    get() {
        println("Running get into fullTime")
        return field
    }
    set(value) {
        println("Running set into fulltTime")
        field = value
    }

    //val firstName: String = firstName

    /*var fullTime: Boolean = true

    constructor(firstName: String, fullTime: Boolean): this(firstName) {
        this.fullTime = fullTime
    }*/
}

class Demo {
    val dummy: String

    constructor(){
        dummy = "HEY JUDE"
    }
}