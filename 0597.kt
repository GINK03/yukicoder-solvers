
fun main(args:Array<String>) {
  readLine()!!.toInt().let { (1..it).map { readLine()!! }.joinToString("").let { println(it) } }
}
