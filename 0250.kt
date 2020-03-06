
fun main( args : Array<String> ) {
  val n = readLine()!!.toInt()
  (1..n).map {
    readLine()!!.split(" ").map { it.toLong() }
  }.map { xs ->
    val (a,b,c) = xs
    val h1 = ( a + b - 1 downTo a + 1 ).reduce { y,x -> y*x }
    val h2 = ( b - 1  downTo 1 ).reduce { y,x -> y*x }
    println(b - 1)
    println("$h1 $h2 ${h1/h2}")
    when {
      a - 1 == 0L -> "AC"
      h1/h2 > c -> "ZETUBOU"
      else      -> "AC"
    }.let { println( it ) }
  }
}
