import java.lang.Math
fun main( args : Array<String> ) {
  val (n, m) = readLine()!!.split(" ").map { it.toInt() }
  var ps = (1..m).map {
    readLine()!!.toInt()
  }.toList()
  .sorted()
  (0..m-n).map { i ->
    val a = ps[i]
    val b = ps[i+n-1]
    val ret = when { 
      a*b < 0 -> listOf( Math.abs(a)*2 + Math.abs(b), Math.abs(a) + Math.abs(b)*2).min()
      else    -> listOf( Math.abs(a), Math.abs(b) ).max()
    }
    ret!!
  }.min()
  .let { println( it ) }
}
