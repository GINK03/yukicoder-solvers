
fun main(args:Array<String>) {
  val n = readLine()!!.toInt()
  val sizes = (1..n).map { 
    val (a, b) = readLine()!!.split(" ").map(String::toLong)
    a+4L*b
  }

  val min = sizes.min()!!
  val deltas = sizes.map { it - min }
  val max = deltas.max()!!
  val deltas2 = deltas.map { max - it }
  when { 
    deltas2.any { it%2L != 0L } -> -1L
    else -> {
      deltas2.sum()/2L
    }
  }.run(::println)
}
