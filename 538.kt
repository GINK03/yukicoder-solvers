import java.lang.Math
fun main( args : Array<String> ) {
  val (a, b, c) = readLine()!!.split(" ").map { it.toLong() }
  // c = n * b + d
  // b = n * a + d
  val n = (c - b) / (b - a).toDouble() 
  val d = c - n * b
  println("${Math.round(n*c + d)}")
}
