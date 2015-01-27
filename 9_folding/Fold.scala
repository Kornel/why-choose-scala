object FoldDemo extends App {

  val l1 = List(1, 2, 3, 4, 5, 6)

  val sum = l1.foldLeft(0)(_ + _)

  val sum2 = l1.reduce(_ + _)

  println(sum)
  println(sum2)
  println(l1.sum) // :)

  val mo = (0 /: l1)(_ + _)
  println(mo)
}
