package LoopsIfWhenTryCatchExpressions

fun main() {
    println("============RANGE==============")
    val range = 1..5

    for (index in range) {
        println(index)
    }
    println("*******************************")
    for (num in 1..20 step 4) {
        println("Num = ${num}")
    }
    println("*******************************")
    for (e in 15 downTo 3) {
        println("E = ${e}")
    }
    println("*******************************")
    for (j in 30 downTo 10 step 5) {
        println("J = ${j}")
    }

    println("*******************************")
    for (x in 1 until 10) {
        println("X = ${x}")
    }

    println("*******************************")
    val s = "goodbye"
    println("BigS = ${s}")
    val sRange = 0..s.length
    println("sRange = ${sRange}")



    val charRange = 'a'..'z'
    val stringRange = "ABD".."XYZ" // don't print in for

    println("============HELLO==============")
    val str = "Hello"
    for (a in str) {
        println(a)
    }

    println("*******************************")
    println(3 in range)
    println('q' in charRange)
    println("CCC" in stringRange)
    println("CCCC" in stringRange)
    println("ZZZZZ" in stringRange)
    println("*******************************")

    println("============BACKWARDRANGE==============")
    val backwardRange = 5.downTo(1)
    for (y in backwardRange) {
        println(y)
    }

    println("============STEPRANGE==============")
    val stepRange = 3..15
    for (z in stepRange) {
        println(z)
    }

    println("============STEPTHREE==============")

    val stepThree = stepRange.step(3)
    for (n in stepThree) {
        println(n)
    }

    println("============REVERSEDRANGE==============")
    val reversedRange = range.reversed()
    for (x in reversedRange) {
        println(x)
    }

    println("========== SEASONS ==========")

    val seasons = arrayOf("spring", "summer", "winter", "fall")

    for (season in seasons) {
        println("SEASON IS ${season}")
    }

    println("=============================================")

    for (indexes in seasons.indices) {
        println("${seasons[indexes]} is season number $indexes")
    }
    println("=============================================")
    println("=============================================")

    seasons.forEach { println(it) }
    seasons.forEachIndexed {indexus, value -> println("$value is season number $indexus")}

    val notASeason = "Whatever" !in seasons
    println(notASeason)

    val notInRange = 32 !in 1..10
    println(notInRange)

    val strin = "Hellow!"
    println('w' in strin)
    println('w' !in strin)

    println("=====================CASCATE FOR========================")

    for (z in 1..3) {
        println("Z = ${z}")
        for (u in 1..4) {
            println("U == ${u}")
            for (k in 5..10) {
                println("K === ${k}")
                if ( k == 7) {
                    break;
                }
            }
        }

    }
}