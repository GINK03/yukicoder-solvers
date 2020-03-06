
fun main(args:Array<String>) { 
  val m = mutableMapOf("RED" to 0, "BLUE" to 0) 
  (1..3).map {  
    val key = readLine()!!
    m[key] = m[key]!! + 1
  }
  val ans = m.toList().sortedBy { kv ->
    val (k,v) = kv
    v*-1
  }.first()
  println(ans.first)
}
