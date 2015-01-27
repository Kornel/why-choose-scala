
object ForComprehensionDemo extends App {

  val l1 = List("a", "b", "c", "d")
  val l2 = List(1, 2)

  val l3 =for {
    e <- l1
    n <- l2
  } yield e * n
  
  println(l3)

  val l4 = l1.flatMap(e => l2.map(n => e * n))
  println(l4)
}

