
fun main( args : Array<String> ) {
  val (a0, a1, a2) = readLine()!!.split(".").map { it.toInt() }
  val (b0, b1, b2) = readLine()!!.split(".").map { it.toInt() }
  when { 
    "%03d%03d%03d".format(a0,a1,a2).toLong() >= "%03d%03d%03d".format(b0,b1,b2).toLong()  -> "YES"
    else -> "NO"
  }.let { println(it) }

}
