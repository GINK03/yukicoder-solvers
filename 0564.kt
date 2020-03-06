
fun main( args : Array<String> ) {
  val (h, n) = readLine()!!.split(" ").map { it.toInt() }
  val ns = (1..n-1).map {
    readLine()!!.toInt()
  }.map { 
    Pair("Other", it)
  }.toMutableList()
  ns.add( Pair("Target", h) )
  ns.sortedBy{ 
    it.second * -1
  }.mapIndexed { i,x ->
    val (type, h) = x
    Triple(type, i+1, h)
  }.filter {
    it.first == "Target"
  }.let { 
    val rank = it.first().second 
    val last = rank.toString().toList().last().toString()
    when {
      last == "1" -> println("${rank}st")
      last == "2" -> println("${rank}nd")
      last == "3" -> println("${rank}rd")
      else -> println("${rank}th")
    }
  }
}
