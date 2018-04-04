
fun main(args:Array<String>) {
  val m = readLine()!!.toInt()

  (1..m).map {
    readLine()!!.toInt()
  }.map { x ->
    when {
      x%8 == 0 && x%10 == 0 -> "ikisugi"
      x%8 == 0  -> "iki"
      x%10 == 0 -> "sugi"
      else  -> x/3
    }.let(::println) 
  }
}
