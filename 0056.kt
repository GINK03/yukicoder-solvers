
fun main( args : Array<String> ) {
  val (m, n) = readLine()!!.split(" ").map { it.toDouble() }
  println("${ ((100.0 + n) * m / 100.0).toInt() }" )
}
