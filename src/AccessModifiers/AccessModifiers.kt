package AccessModifiers

fun main() {
    val dori = Nemo("Zaira")
    println(dori.firstName)

    val dolly = Nemo("Bob")
    println(dolly.firstName)
    println(dolly.fullTime)

    val MichaelDouglas = Nemo("Ghost", false)
    println(MichaelDouglas.firstName)
    println(MichaelDouglas.fullTime)

    println(Demo().dummy)

}

class Nemo (val firstName: String, var fullTime: Boolean = true) {

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