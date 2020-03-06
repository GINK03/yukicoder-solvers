
fun main( args : Array<String> ) {
  val nim = readLine()!!.toLong() % 4L
  when {
    nim == 3L -> "X"
    else -> "O"
  }.let { println(it) }
}
