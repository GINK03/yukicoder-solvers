
fun main( args : Array<String> ) {
  val bs = readLine()!!
  val cs = "abcdefghijklm".map { x ->
    val mm = (bs + x.toString())
      .toList()
      .groupBy { 
        it
      }.map { 
        val (k, arr) = it
        Pair(k, arr.size)
      }.toMap()
    val res = "abcdefghijklm".map {
      mm[it]
    }.sortedBy { 
      it 
    }.let { 
      when { 
        it.joinToString("") == "1111111111112" -> x
        else -> null
      }
    }
    res
  }.filter {
    it != null
  }
  when {
    cs.size == 0 -> println("Impossible")
    else -> cs.map {
      println(it)
    }
  }
}
