
fun main(args:Array<String>) {
  val n = readLine()!!.toInt()
  val base = mutableListOf(0, 0, 0, 1)
  for( i in (4..1000_000) ) {
    //println(i)
    val next = (base[i-4] + base[i-3] + base[i-2] + base[i-1])%17
    base.add(next)
  }
  (1..n).map { 
    val t = readLine()!!.toInt()
    base[t-1]
  }.map { println(it) }
}
