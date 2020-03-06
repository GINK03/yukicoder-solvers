
fun main( args : Array<String> ) {
  val ans = mapOf('2' to 19892, '.' to 1, '1' to 20063, '4' to 19874, '5' to 20199, '9' to 19841, '6' to 19898, '3' to 20011, '8' to 19956, '7' to 20163, '0' to 20104 )

  val diff = readLine()!!.toList()
  .groupBy { it }
  .toList()
  .map { 
    val (k, arr) = it
    Pair(k, arr.size - ans[k]!!)
  }
  val ta = diff.filter {
    it.second < 0
  }.first().first
  val so = diff.filter {
    it.second > 0
  }.first().first
  println("$so $ta")
}
