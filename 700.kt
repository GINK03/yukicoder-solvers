
fun main(args:Array<String>) {
  val (n, m) = readLine()!!.split(" ").map(String::toInt)
  (1..n).map { readLine()!!.contains("LOVE") }.any { it }.let { when { it == true -> "YES"; else -> "NO"} }.run(::println)
}
