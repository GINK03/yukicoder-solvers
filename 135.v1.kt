import java.lang.Math

fun main( args : Array<String> ) { 
  readLine()
  val bs = readLine()!!
    .split(" ")
    .map { it.toInt() }
  
  val cs = mutableSetOf<Int>()
  bs.mapIndexed { i, x->
    for(j in (i+1..bs.size-1)){
      val last  = bs[j]
      val delta = Math.abs( last - x )
      cs.add( delta )
    }
  }
  println( cs.min() )
}
