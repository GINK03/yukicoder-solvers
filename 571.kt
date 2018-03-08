
fun main(args:Array<String>) {
  val m = mutableMapOf<String, Pair<String, String>>()
  listOf("A", "B", "C").map {
    val input = readLine()!!
    val (left, right) = input.split(" ")
    m[ "${left.padStart(10, '0')}_xxx_${(100000000 - right.toInt()).toString().padStart(10, '0')}" ] = Pair(input, it)
  }
  m.toList().sortedBy { it.first }.reversed().map { 
    val (k,v) = it
    println(v.second)
  }
}
