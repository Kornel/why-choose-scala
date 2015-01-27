case class Dog(name: String)

object Dogs extends App {

  val d1 = Dog("Buddy")
  val d2 = Dog("Rocky")
  val d3 = Dog("Buddy")

  println(s"$d1 == $d2: ${d1 == d2}")
  println(s"$d1 == $d3: ${d1 == d3}")


}

