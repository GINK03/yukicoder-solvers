
fun main(args:Array<String>) {
  val n = readLine()!!.toInt()
  val ms = readLine()!!.split(" ").map(String::toInt).sorted()
  ms.zip((1..n).toList()).map  {
    Math.abs( it.first - it.second )
  }.sum().run(::println)
}
