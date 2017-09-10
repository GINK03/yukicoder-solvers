
fun main( args : Array<String> ) {
  val n = readLine()!!.toInt()
  val k = readLine()!!.toInt()
  
  val base = (1..n).map { it }.toMutableList()
  (1..k).map {
    val swapPoint = readLine()!!.split(" ").first().toInt() - 1
    val so = base[swapPoint]
    val ta = base[swapPoint+1]
    base[swapPoint] = ta
    base[swapPoint+1] = so
  }
  val ans = readLine()!!.split(" ").mapIndexed { i,it ->
    Pair(it.toInt(), i )
  }
  val ansMap = ans.toMap()
  // here is 直前
  val basePair = base.map { 
    Pair(it, ansMap[it]!!)
  }.toMutableList()
  //println( base )
  //println( basePair )

  val swapPoints = mutableListOf<Int>()
  loop@while(true) {
    for( i in (0..basePair.size-2) ) {
      if( basePair[i].second > basePair[i+1].second ) {
        val a1 = basePair[i+1]
        val a2 = basePair[i]
        basePair[i] = a1
        basePair[i+1] = a2
        swapPoints.add( i )
      }
      if( basePair.map { it.second } == basePair.map { it.second }.sortedBy { it } ) 
        break@loop  
    }
  }
  //println( basePair )
  println( swapPoints.size )
  swapPoints.map {
    println("${it + 1} ${it + 2}")
  }
}
