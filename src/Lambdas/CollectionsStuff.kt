package Lambdas


fun main() {
    val setInt = setOf(10, 15, 19, 5, 3, -22)

    println(setInt.filter { it % 2 != 0 })

    println("========= Immutable =========")
    val immutableMap = mapOf<Int, Cars>(1 to Cars("Green", "Toyota", 2015),
        2 to Cars("red", "Ford", 2016),
        3 to Cars("silver", "Honda", 2015),
        17 to Cars("green", "BMW", 2007),
        8 to Cars("red", "Ford", 2007))


    println("TO SORTED => " + immutableMap.toSortedMap())

    println(immutableMap.all { it.value.year > 2010 } )
    println(immutableMap.any { it.value.year > 2010 } )
    println(immutableMap.count { it.value.year > 2010 } )

    println("## IMMUTABLE FILTER ")
    println(immutableMap.filter { it.value.year == 2015 })
    println("CBJR =>>" + immutableMap.filter { it.value.model == "Ford" }//review
        .map { it.value.color })

    println("## IMMUTABLE MAP ")
    println(immutableMap.map {it.value.year })
    println(immutableMap.map {it.value.year == 2013 })


    println("========= Mutable =========")
    val mutableMap = mutableMapOf<Int, Cars>(1 to Cars("Green", "Toyota", 2015),
        2 to Cars("red", "Ford", 2016),
        3 to Cars("silver", "Honda", 2013))

    mutableMap.filter { it.value.color == "silver" }
    println("The Filters map is $mutableMap")

    println("***************************************************************************************")


    val ints = arrayOf(1, 2, 3, 4, 5)
    val add10List: MutableList<Int> = mutableListOf()

    for (index in ints) {
        add10List.add(index + 10)
    }
    println(add10List)

    val add20List = ints.map { it + 20 }
    println(add20List)
    println(add20List.javaClass)

    println("======== FIND IN CARS ==========")

    val cars = immutableMap.values
    println(cars.find { it.year > 2010 })
    println(cars.groupBy { it.color })
    println(cars.sortedBy { it.year })

}

data class Cars(val color: String, val model: String, val year: Int) {

}