import java.lang.Math
fun main( args : Array<String> ) {
  val c         = readLine()!!.toDouble()
  val (IN, OUT) = readLine()!!.split(" ").map { it.toDouble() }
  val R         = (OUT + IN)/2
  val r         = (OUT - IN)/2
  println( 2 * Math.PI * Math.PI * r * r * R * c)
}
