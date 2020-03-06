
typealias Money = Int
typealias Index = Int
typealias City = String
fun main( args : Array<String> ) {
  val (n, d) = readLine()!!.split(" ").map { it.toInt() }

  val tk = (1..n).map {
    val (t,k) = readLine()!!.split(" ").map { it.toInt() }
    Pair( Pair("T", t), Pair("K", k) )
  }

  val memo = mutableListOf<Triple<Index, City, Money>>( Triple(-1, "T", 0) )
  tk.mapIndexed { i, tk_ ->
    // search lastindex 
    val lastsAll = memo.filter { it.first == i-1 }.sortedBy { it.third * -1 }
    val lasts = when {
      lastsAll.size > 10 -> lastsAll.slice(0..9)
      else -> lastsAll
    }
    // build next divercity
    val (tokyo, kyoto) = tk_
    lasts.map { last ->
      if( last.second == tokyo.first ) {
        memo.add( Triple(i, "T", last.third + tokyo.second) )
        memo.add( Triple(i, "K", last.third + kyoto.second - d) )
      }
      if( last.second == kyoto.first ) {
        memo.add( Triple(i, "T", last.third + tokyo.second - d) )
        memo.add( Triple(i, "K", last.third + kyoto.second) )
      }
    }
  }
  println( memo.maxBy { it.third }!!.third )
}
