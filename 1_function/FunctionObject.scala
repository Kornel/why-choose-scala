object FunctionObjectDemo extends App {

  val s1 = Square(10)
  val s2 = Square.apply(20)

  val squareF: Int => Int = Square.apply _

  println(s1)
  println(s2)
  println(squareF)
  println(squareF(30))

}

object Square {
  def apply(n: Int): Int = n * n
}
