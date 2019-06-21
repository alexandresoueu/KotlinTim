package LoopsIfWhenTryCatchExpressions

fun main() {

    var numOne: Int
    var numTwo: Int

//    if (someCondition) {
//        numOne = 50
//    } else {
//        numOne = 591
//    }

    //numTwo = someCondition ? 50 : 573

    val someCondition = 6 < 22

    val numThree = if (someCondition) 50 else 987

    val geo = if (someCondition) {
        println("something")
        50
    } else {
        println("something else")
        593
    }
    println(geo)

    println("The result of the if expression is ${ if (someCondition) {
        println("something")
        50
    } else {
        println("something else")
        593
    }}")

    if (someCondition) {
        println("something!!!!")
    }

}