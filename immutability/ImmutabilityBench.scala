
object Immutability extends App {

  val l1 = (1 to 100000).toList
  
  val b0 = Benchmark((l, n) => l :+ n, l1, 10)

  val b1 = Benchmark((l, n) => n +: l, l1, 10)
  
  println(s"\n\nAppend at end: $b0 seconds")
  println(s"Append at head: $b1 seconds\n\n")

}



















object Benchmark {
 
  def apply(f: (List[Int], Int) => List[Int], l: List[Int], n: Int): Long = {
    
    def warmup = (1 to 1000).foreach(x => f(l, n))

    def bench = {
      val t0 = System.nanoTime
      (1 to 1000).foreach(x => f(l, n))
      (System.nanoTime - t0) / 1000000
    }

    warmup //side-effect!
    bench
  }
}
