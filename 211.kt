
fun main(args:Array<String>) {
  val k = readLine()!!.toInt()
  val sa = listOf(2,3,5,7,11,13).map { prime -> 
    listOf(4,6,8,9,10,12).map { ord ->
      prime*ord
    }
  }.flatten().groupBy { it }.map { (k,vs) -> Pair(k, vs.size) }.toMap()

  val total = sa.toList().map { it.second }.sum()

  when { 
    sa.get(k) != null -> {
      sa[k]!!/total.toDouble()
    }
    else -> { 0.0 }
  }.run(::println)
}
