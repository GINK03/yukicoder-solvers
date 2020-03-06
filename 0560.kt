
fun main( args : Array<String> ) {
  val (m, n) = readLine()!!.split(" ").map { it.toInt() }

  val bu = mutableListOf<Double>( m.toDouble() )
  (1..n).map {
    val x = bu.last()
    bu.add( (2*x + x + 1.0)/3.0 )
  }
  println( bu.last() )
}
