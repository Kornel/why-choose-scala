object FunctionDemo extends App {

  def square(n: Int): Int = n * n

  def show(n: Int): String = s"n = $n"

  def decorate(s: String): String = s"***\n$s\n***"

  def showDecoratedSquare = decorate _ compose show _ compose square _

  val decSquare = showDecoratedSquare(10)

  println(decSquare)

}
