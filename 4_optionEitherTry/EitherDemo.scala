
object EitherDemo extends App {

  def divide(n: Double, div: Double): Either[String, Double] = div match {
    case 0 => Left("Cannot divide by zero!")
    case d => Right(n / d)
  }

  divide(20, 2) match {
    case Left(err) => println(err)
    case Right(succ) => println(succ)
  } // słabo

  divide(20, 0).fold( 
    x => println(x), 
    r => println(s"Result is $r") 
  ) // lepiej 

}
