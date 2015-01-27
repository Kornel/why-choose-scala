object FibonacciDemo extends App {

  val fibs: Stream[Int] = 1 #:: fibs.scanLeft(1)(_ + _)

  val first10Fibs = fibs.take(10)

  println(first10Fibs)
  println(first10Fibs.toList)
}

