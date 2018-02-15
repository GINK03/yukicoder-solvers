
fun main(args: Array<String>) {
  val n = readLine()!!.toInt()

  (n downTo 1).map { 
    (1..it).map { a -> n.toString() }.joinToString("")
  }.joinToString("\n").let { println(it) }
}

