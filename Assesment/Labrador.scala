class Labrador(name: String,var color: String) extends Dog(name)
{

 def getColor():String={return color}
 override def speak():String ={ return "Woof"}
 val breedWeight = 75
 def avgBreedWeight():Int={return breedWeight}

}