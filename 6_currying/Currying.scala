object CurryingDemo extends App {

  def add(a: Int, b: Int): Int = a + b
  val foo: (Int, Int) => Int = add

  val sum = foo(10, 10)
  println(s"Adding 10 + 10: $sum")

  val curried: Int => Int => Int = foo.curried
  
  val add20 = curried(20)
  val add30 = curried(30)
  
  println(add20(30))
  println(add30(30))
}

