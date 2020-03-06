
fun main(args:Array<String>) {
  readLine()

  val es = readLine()!!.split(" ").map { it.toInt() }.filter { it != 0 }
  val all_size = es.size
  val one_size = es.filter { it == 1 }.size
  val two_size = es.filter { it == 2 }.size

  when { 
    all_size == one_size + two_size && one_size % 2 == 1 && two_size == 1 -> "A"
    all_size == one_size && one_size % 2 == 1 -> "A"
    else -> "B"
  }.let { println(it) }
}
