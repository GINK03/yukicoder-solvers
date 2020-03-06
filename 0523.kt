
fun main( args : Array<String> ) { 
  val c = 1000000007L
  val a = readLine()!!.toInt()
  var b = 1L 
  (1..a).map { x ->
    b = b * x % c
    b = (b * (2 * x - 1)) % c
  }
  println( b )
}
