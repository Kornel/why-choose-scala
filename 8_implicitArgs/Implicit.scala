import scala.concurrent.{ExecutionContext, Future, Await}
import scala.concurrent.duration._

object ImplicitDemo extends App {

  implicit val ec = ExecutionContext.global

  val f1 = Future("Hello")
  val f2 = Future("World")

  val f3 = for {
    a <- f1
    b <- f2
  } yield a + b

  val r = Await.result(f3, 10 seconds)

  println(r)
}

