
fun main(args:Array<String>) {
  val (n, k) = readLine()!!.split(" ").map{ it.toInt() }
  val a = (1..n).map { 
    readLine()!!.toInt()
  }
  
  val b = Integer.parseInt("1".repeat(a.size), 2)

  println(b)

  val maxs = mutableListOf<Int>()
  (0..b).map { 
    val d = "%${a.size}s".format(Integer.toBinaryString(it)).replace(" ", "0")
    val m = d.toList().map { it.toString() }.zip(a).filter { it.first == "1" }.map { it.second }.sum()
    if( m <= k )
      maxs.add(m)
  }
  println( maxs.sorted()[maxs.size-1] )
}
