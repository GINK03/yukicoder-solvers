
fun main(args:Array<String>) {
  val (n, m) = readLine()!!.split(" ").map(String::toInt)
  (1..n).map { readLine()!!.toList() }.flatten().filter { it == 'W' }.size.run(::println)
}
