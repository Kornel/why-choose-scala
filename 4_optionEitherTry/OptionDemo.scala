
object OptionDemo extends App {

  def findUsername(id: Int): Option[String] = id match {
    case -1 => None
    case n => Some(s"John id($n)")
  }

  val u1 = findUsername(10)
  val u2 = findUsername(-1)

  println(u1)
  println(u2)

  println(u1.getOrElse("Not Found1"))
  println(u2.getOrElse("Not Found2"))
}

