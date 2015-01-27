
object LazyDemo extends App {

  lazy val x = { println("x"); 10 }

  val y = { println("y"); 20 }

  lazy val z = { println("z"); 30 }

  println("Adding...")
  println(x + y)

  println("--------------")
  
  def callMe(n: => Int): Int = {
    println("call me!")
    n * n
  }

  println(callMe(x))
  println(callMe(z))
}

