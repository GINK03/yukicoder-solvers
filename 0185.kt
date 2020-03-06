
fun main( array : Array<String> ) {
  val n  = readLine()!!.toInt() 
  val bs = (1..n).map { 
    val (a,b) = readLine()!!.split(" ").map { it.toInt() }
    b - a
  }
  val cs = bs.map { it - bs.first() }.all { it == 0 }
  when { 
    cs == true && bs.first() >  0 -> println( bs.first() )
    else                          -> println( -1 )
  }
}
