object DogTest extends App{
    val doggy = new Dog("Jerry")
    println(doggy.speak())
    val leb = new Labrador("Bull","Brown")
    println(leb.speak())
    println(leb.getColor())
    println(leb.avgBreedWeight())
    val york = new Yorkshire("Mark","Grey")
    println(york.speak())
    println(york.getColor())
    println(york.avgBreedWeight())
}