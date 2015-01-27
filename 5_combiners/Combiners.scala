object Combiners extends App {

  val l1 = List(1, 2, 3, 4, 5)

  val squares = l1.map(n => n * n)
  val even = l1.collect { case n if n % 2 == 0 => s"Even number: $n" }
  
  println(squares)
  println(even)

  val l2 = List(Some(1), None, Some(3))
  println(l2.flatten)
}

