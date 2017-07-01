
fun main( args : Array<String> ) { 
  readLine()!!
    .split(" ")
    .map { it.toInt() }
    .let {
      val (a, b) = it
      val c = b * 2
      when {
        a % c == 0 -> a/c - 1
        else       -> a/c 
      }.let {
        println(it * b)
      }
    }
}
