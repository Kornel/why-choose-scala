abstract sealed class Animal
case class Dog(name: String, age: Int) extends Animal
case class Cow(age: Int) extends Animal

object Dogs extends App {

  val d1 = Dog("Buddy", 20)
  val d2 = Dog("Rocky", 10)
  val c1 = Cow(2)

  def sayHello(d: Animal) = d match {
    case Dog(n, _) => s"Woof $n"
    case Cow(age) => "Moo " * age
  } 

  println(sayHello(d1))
  println(sayHello(d2))
  println(sayHello(c1))
}

