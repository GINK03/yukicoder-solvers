
fun main( args : Array<String> ) {
  val (m, n) = readLine()!!.split(" ").map { it.toInt() }
  val ps     = readLine()!!.split(" ").map { it.toInt() }

  val ans    = ps.sorted()

  (0 .. m-1).map { i ->
    // search end
    if(ps[i] == ans[i]) continue
    while (ps[i] != ans[i]) {
      for( sw in (i .. m-1 step n) ) {
        val tmp = ps[sw]
        ps[sw]  = ps[sw+n]
        ps[sw+n]= tmp  
      }
    }
  }
}
