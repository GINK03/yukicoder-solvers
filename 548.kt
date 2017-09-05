
fun main( args : Array<String> ) {
  val a = readLine()!!
  "abcdefghijklm".map { x ->
    val x2 = (a + x.toString()).groupBy {
      it
    }.toList()
    val a1 = x2.map { it.first }.sortedBy{ it }.joinToString("")
    val a2 = x2.map { it.second.size }.sortedBy { it }.joinToString("")
    val c1 = a1.length == 13
    val c2 = when { c1 -> a1.slice(0..11) == "abcdefghijklm"; else -> false }
    val c3 = a2 == "1111111111112"
    println("a")
    println(a1)
    println(a1.slice(0..11) )
    println(c1)
    println(c2)
    println(c3)
    println(x2)
  }
}
