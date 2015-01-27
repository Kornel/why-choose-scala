import scala.concurrent.{ExecutionContext, Future, Await}
import scala.concurrent.duration._

object NoImplicitDemo extends App {

  val ec = ExecutionContext.global

  val f1 = Future("Hello")(ec)
  
  val r = Await.result(f1, 10 seconds)

  println(r)
}

