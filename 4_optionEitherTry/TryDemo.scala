import scala.util.{Try, Failure, Success}

object TryDemo extends App {

  def intFromString(s: String): Try[Int] = Try(Integer.parseInt(s))

  def parse(t: Try[Int]) = t match {
    case Failure(t) => println(s"Exception ${t.getClass.getSimpleName} with message ${t.getMessage}")
    case Success(n) => println(s"Got integer $n")
  }

  parse(intFromString("10"))
  parse(intFromString("foo"))

}

