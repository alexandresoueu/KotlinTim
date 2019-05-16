package NullReference

fun main() {

    val floatOne: Float? = -3847.384f

    val floatTwo: Float? = -3847.384f

    val floatThree: Float? = -3847.384f.toFloat()

    val shortArray = shortArrayOf(1, 2, 3, 4, 5)
    val shortArrayTwo: Array<Short> = arrayOf(1, 2, 3, 4, 5)

    val intArray = Array<Int?>(40) { i -> (i + 1) * 5 }

    val charArray = charArrayOf('a', 'b', 'c')


    val x: String? = "I AM IN UPPERCASE!"
    val z = x?.toLowerCase() ?: "I give up!"
    println(z)

    x?.let { println(it.toLowerCase().replace("am", "am not"))}


    val myNonNullVariable: Int? = null
    myNonNullVariable!!.toDouble()


}