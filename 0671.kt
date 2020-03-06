
fun main(args:Array<String>) {
  val n = readLine()!!.toList().filter { it == '0' }.size
  println(Math.abs(8 - n))
}
