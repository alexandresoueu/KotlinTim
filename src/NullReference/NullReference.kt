package NullReference

fun main() {

    val str: String?= null
    println("What happens when do this: ${str?.toUpperCase()}")

    if (str == null) {
        null
    } else {
        str.toUpperCase()
    }

    val strTwo = str?: "This is the default value"
    println(strTwo)

    //val whatever = bankBranch?.address?.country ?: "US"

    val  something: Any = arrayOf(1, 2, 3, 4)
    val str3 = something as? String

    println(str3)
    println(str3?.toUpperCase())

}