package LoopsIfWhenTryCatchExpressions

fun main() {

//    for (index in 5..50 step 5) {
//        println(index)
//        println("====================")
//    }

//    for (negative in -50..0 step 10) {
//        println(negative)
//    }

//    var total: Int
//    var secondToLast = 0
//    var last = 1
//
//    println(secondToLast)
//    println(last)
//
//    for (number in 1..13) {
//        total = secondToLast+ last
//        println(total)
//        secondToLast = last
//        last = total
//    }

//    iloop@ for (i in 1..5) {
//        println(i)
//        if (i == 2) {
//            break
//        }
//        for (j in 11..20) {
//            println(j)
//            for (k in 100 downTo 90) {
//                println(k)
//                if(k == 98) {
//                    continue@iloop
//                }
//            }
//        }
//    }

    val num = 99
    println(if (num < 100) {
        -234.567
    } else if(num > 100) {
        4444.345
    } else {
        0.0
    })

    val dnum = when {
        num < 100 -> -123.453
        num > 100 -> 4444.123
        else -> 0.0
    }
    println(dnum)


}