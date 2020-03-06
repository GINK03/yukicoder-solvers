
fun main(args:Array<String>) {
  val n = readLine()!!.toInt()
  (1..10).mapNotNull { a -> 
    val b = n -a
    if( 10 >= b && b >= 1 ) Pair(a, b)
    else null
  }.first().let { println("${it.first} ${it.second}")}
}
