package OOChallenge

import java.awt.Color


fun main() {
    val bicycle = KotlinBicycle(13, 5, 15)
    bicycle.printDescription()

    val mountainBike = KotlinMountainBike(17, 7,20, 8)
    mountainBike.printDescription()

    val roadBike = KotlinRoadBike(21, 7, 23, 9)
    roadBike.printDescription()

    println("=======================================")

    val bicycleTwo = KotlinBicycle(10, 3)
    bicycleTwo.printDescription()

    val mountainBikeTwo = KotlinMountainBike(12, 5, 9, 7, "Green")
    mountainBikeTwo.printDescription()

    val roadBikeTwo = KotlinRoadBike(12, 4, 8)
    roadBikeTwo.printDescription()

    println("=======================================")

    KotlinMountainBike.availableColor.forEach{ println(it) }
}


open class KotlinBicycle(var cadence: Int, var speed: Int, var gear: Int = 10) {
    fun applyBrake(decrement: Int) {
        speed -= decrement
    }

    fun speedUp(increment: Int) {
        speed += increment
    }

    open fun printDescription() {
        println("Bike is gear $gear with cadence $cadence   " +
                "speed is $speed .")
    }

}

class KotlinMountainBike(var seatHeight: Int, cadence: Int, speed: Int, gear: Int = 13):
        KotlinBicycle(cadence, speed, gear){

    constructor(seatHeight: Int, cadence: Int, speed: Int, gear: Int = 14, color: String = "gray"):
        this(seatHeight, cadence, speed, gear) {
            println("This color is $color")
        }

    companion object {
        val availableColor = listOf("blue", "gray", "green", "red", "Brown")
    }

    override fun printDescription() {
        super.printDescription()
        println("height is $seatHeight")
    }
}

class KotlinRoadBike(val tireWith: Int, cadence: Int, speed: Int, gear: Int = 19):
        KotlinBicycle(cadence, speed, gear) {

    override fun printDescription() {
        super.printDescription()
        println("tireWith  is $tireWith")
    }
}