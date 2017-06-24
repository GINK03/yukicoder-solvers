
fun main(args: Array<String>) {
  val (m,n) = readLine()!!.split(" ").map { x -> x.toLong() }
  if( m >= n && 1 <= n ) {
    if( m + 1L == n * 2L ) 
      println(m - 1L)
    else 
      println(m - 2L)
  } else {
    println(0)
  }

}
