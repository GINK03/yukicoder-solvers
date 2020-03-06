
fun main(args: Array<String>) {
  val a = readLine()!! 
  when {
    a == "0" -> a
    else -> a + "0"
  }.let { println(it) }
}
