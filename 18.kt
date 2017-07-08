
fun main( args : Array<String> ) {
  val m = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toList().mapIndexed { i,x ->
     Pair(i, x)
  }.toMap()
  val os = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toList().mapIndexed { i,x ->
     Pair(x, i)
  }.toMap()
  readLine()!!.toList().mapIndexed { i,x ->
    val d = i%26
    val ii = (26*100 + os[x]!! - i - 1)%26
    //println("$i $d ${m[ii]} ${ii}")
    m[ii]
  }.joinToString("").let { println(it) }
}
