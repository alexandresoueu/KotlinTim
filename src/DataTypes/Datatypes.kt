package DataTypes

fun main() {
    val myInt = 10
    println("default datatype is: ${myInt is Int}")

    var myLong = 22L
    println("default value myLong is: ${myLong}")

    myLong = myInt.toLong()
    println("Now value myLong is: ${myLong}")

    val myByte: Byte = 111
    println("default value MYBYTE is: ${myByte}")

    var myShort: Short
    myShort = myByte.toShort()
    println("NOW MYBYTE is: ${myByte}")

    val anotherInt = 5

    var myDouble = 65.984
    println("MyDouble is: ${myDouble is Double}")

    val myFloat = 838.9993f
    println("This is a FLOAT: ${myFloat is Float}")

    myDouble = myFloat.toDouble()
    println("Now MyDouble is: ${myDouble}")

    val char = 'a'
    val myChar = 66
    println("MYCHAR is CHAR: ${myChar.toChar()}")

    val myBoolean = true

    val vacationTime = false
    val onVacation = DummyClass().isVacationTime(vacationTime)
    println(onVacation)

    val anything: Any

}