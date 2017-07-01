
fun main( args : Array<String> ) {
  val n  = readLine()!!.toInt()
  val ms = readLine()!!.toList().map { it.toString().toInt() }
  when { 
    n > 3 -> println("YES")
    else -> { 
      (0..n-1).map { j ->
        (0..j).map { i ->
          val k = j + 1
          val l = 2*j + 1 -i
          when {
            l >= ms.size -> null
            k >= ms.size -> null
            ms.slice(i..j) == ms.slice(k..l) -> true
            else -> null
          }
        }
      }.flatMap { 
        it 
      }.any { 
        it == true
      }.let {
         when(it) {
           true -> "YES"
           else -> "NO"
         }.let { println(it) }
      }
    }
  }
}
