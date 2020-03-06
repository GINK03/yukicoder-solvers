
fun main(args:Array<String>) {
  var str = readLine()!!
  listOf( Pair("I", "1"), Pair("l", "1"), Pair("O", "0"), Pair("o", "0")  ).map {
    val (s, t) = it
    str = str.replace(s, t)
  }
  println(str)
}
