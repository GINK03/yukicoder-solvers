
fun main(args:Array<String>) {
  readLine()
  val a1 = readLine()!!.toList().groupBy { it }.map { (k,vs) -> Pair(k, vs.size) }.toMap()
  val a2 = readLine()!!.toList().groupBy { it }.map { (k,vs) -> Pair(k, vs.size) }.toMap()
  listOf('A', 'B').map { 
    val r = try { listOf<Int>(a1[it]!!, a2[it]!!).min()!! } catch(e: Exception) { 0 }
    r
  }.sum().run(::println)
}
