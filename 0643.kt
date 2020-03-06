
fun main( args:Array<String> ) {
  val (a, b) = readLine()!!.split(" ").map{it.toInt()}
  when {
    a == b -> "0"
    a == 0 -> "2"
    b == 0 -> "1"
    a == -b -> "3"
    else -> "-1"
  }.let(::println)
}
