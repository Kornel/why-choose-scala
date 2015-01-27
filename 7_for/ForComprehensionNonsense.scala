case class Sugar(v: String) {
  def flatMap(f: String => Sugar): Sugar = {
    println("inside a flatMap")
    f(v)
  }

  def map(f: String => String): Sugar = {
    println("inside a map")
    Sugar(f(v))
  }
}

object ForComprehensionNonsense extends App {

  val s1 = Sugar("lactose")
  val s2 = Sugar("glucose")

  val x = for {
    a <- s1
    b <- s2
  } yield a + b
  
  println(x)

}

