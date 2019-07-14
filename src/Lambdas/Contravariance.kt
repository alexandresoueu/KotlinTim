package Lambdas

fun main() {

    val flowersTender = object: FlowerCare<Flowers> {
        override fun prune(flower: Flowers) = println("I'm pruning a ${flower.name}")
    }

    val roseTender = object: FlowerCare<Roses> {
        override fun prune(flower: Roses) = println("I'm pruning a rose!")
    }

    val rosesGarden = Gardens<Roses>(listOf(Roses(), Roses()), flowersTender)
    rosesGarden.tendFlower(0)

    val daffodilTender = object : FlowerCare<Daffodil> {
        override fun prune(flowers: Daffodil) = println("I'm pruning a Daffodil!")
    }

    val daffodilGarden = Gardens<Daffodil>(listOf(Daffodil(), Daffodil(), Daffodil()), flowersTender)
    daffodilGarden.tendFlower(2)

    val flowersTender2 = object: FlowerCare<Flowers> {
        override fun prune(flower: Flowers) = println("I'm pruning a flower!")
        fun pick(): Flowers = Flowers("some random flower.")
    }
    val roseGardens2 = Gardens<Roses>(listOf(Roses()), flowersTender2)
   // val rose: Roses = roseGardens2.pickFlower(0)

}

class Gardens<T: Flowers>(val flowers: List<T>, val flowerCare: FlowerCare<T>) {
    //fun pickFlower(i: Int) = flowerCare.pick(i)
    fun tendFlower(i: Int) {
        flowerCare.prune(flowers[i])
    }
}

open class Flowers(val name: String) {

}

class Roses:Flowers("Rose") {

}

class Daffodil: Flowers("Daffodil") {

}

interface FlowerCare<in T> {
    fun prune(flower: T)
}