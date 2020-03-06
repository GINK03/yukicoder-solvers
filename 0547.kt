
fun main( args : Array<String> ) {
  readLine()
  val (x1, x2) = (0..1).map { readLine()!!.split(" ") }

  x1.zip(x2).mapIndexed { i,xs ->
    val (a,b) = xs
    Pair(i, a == b)
  }.filter { 
    it.second == false
  }.let { 
    val ans = it.first()
    val i = ans.first
    println("${i+1}\n${x1[i]}\n${x2[i]}")
  }
}
