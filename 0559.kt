
fun main( args : Array<String> ) {
  val a = readLine()!!
  val ans = a.toList().sortedBy { it }
  val bs = a.toMutableList()
  //swap scan
  when {
    bs.size > 1 -> {
      var c = 0
      scan@ while( true ) {
        for( i in (0..bs.size-2)) {
          val scope = bs[i]
          val next = bs[i+1]
          if( scope > next ) {
            bs[i] = next
            bs[i+1] = scope
            c++
          }
          if( ans == bs ) 
            break@scan
          //println(bs)
        }
      }
      println(c)
    }
    else -> { println(0) }
  }
}
