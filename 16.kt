
fun main( args : Array<String> ) {
  val (x, n) = readLine()!!.split(" ").map { it.toInt() }
  val ax = readLine()!!.split(" ").map { it.toInt() }.sortedBy { it }
  val max = ax.max()!!
  val mm = mutableMapOf<Int, Long>(0 to 1L, 1 to x.toLong())
  val L = 1000_003L
  var bya = 1
  loop@ while (true) {
    bya *= 2
    mm[bya] = mm[bya/2]!! * mm[bya/2]!! % L
    if( bya > max ) break@loop
  }

  // build dataset
  val cs = mutableListOf<MutableList<Pair<Int,Long>>>()
  for( a in ax.reversed() ) {
    var b = a
    val bs = mutableListOf<Pair<Int, Long>>()
    mm.toList().sortedBy { it.first * -1 }.map {
      if( b - it.first > 0 ) {
        bs.add( it ) 
        b -= it.first
      }
    }
    println( a )
    println( bs )
    cs.add( bs )
  }
  cs.map { bs ->
    var acc = 1L
    for( b in bs ) {
      acc *= b.second 
    }
    acc 
  }.reduce { y,x -> 
    y+x
  }.let { println( it % L ) }
}
