
fun main(args:Array<String>) {
  val n = readLine()!!.toInt()
  val map = mutableMapOf<Pair<Int,Int>, Int>()
  (1..n).map { 
    val (a,b) = readLine()!!.split(" ").map { it.toInt()%2 }
    val pair = Pair(a,b)
    if( map.get(pair) == null)
      map[pair] = 0
    map[pair] = map[pair]!! + 1
  }
  val sum = map.values.map { it/2 }.sum()
  if( sum%2 == 0 )
    println("Bob")
  else 
    println("Alice")

}
