package usingclasses

trait Animal { // "parent class" is a generalization
  def favoriteFood: String
  def feed(food: String): Unit
  def speak(): Unit
}

// every dog has the behaviors / features of "Animal" -- "Liskov Substitution"
class Dog extends Animal {
  override def favoriteFood: String = "Scraps"

  override def feed(food: String): Unit = {
    if (food == "Scraps") {
      speak() // make happy noise
    } else {
      println("Whimper and hide in corner")
    }
  }

  override def speak(): Unit = println("Bark bark, woof woof")

  def fetch(bone: String): Unit = println("Fetching my " + bone)
}

class Tiger extends Animal {
  override def favoriteFood: String = "Raw meat"

  override def feed(food: String): Unit = {
    if (food == "Raw meat") {
      speak() // make happy noise
    } else {
      println("Bite zookeeper's head off")
    }
  }

  override def speak(): Unit = println("Roar!!")
}


object Zoo {
  def feed(menagerie: List[Animal]):Unit = menagerie.foreach(a => a.feed("Scraps"))

  def main(args: Array[String]): Unit = {
    // many animals
    // feed them all...
    val menagerie = List(new Dog, new Tiger)
//    menagerie.foreach(a => a.feed(a.favoriteFood))
    feed(menagerie)

    val anAnimal:Dog = new Dog
    anAnimal.fetch("My best bone")
  }
}