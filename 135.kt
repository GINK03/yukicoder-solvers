import java.lang.Math

fun main( args : Array<String> ) { 
  readLine()
  val bs = readLine()!!
    .split(" ")
    .map { it.toInt() }
    .toSet()
    .sorted()
 
  val ans = (0..bs.size-2).map { i ->
    bs[i+1] - bs[i]
  }.min()
  
  when(ans) { 
    null -> println(0)
    else -> println(ans)
  }
}
