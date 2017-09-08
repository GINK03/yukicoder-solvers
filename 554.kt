
fun main( args : Array<String> ) {
  val ns = mutableMapOf<Int, Long>(1 to 1L)
  var odd = 0L
  var even = 1L
  val n = readLine()!!.toInt()
  val L = 1000_000_007L
  (2..n).map { i ->
    when {
      i%2 == 0 -> { 
        ns[i] = i*even%L
        odd += ns[i]!!
      }
      else -> {
        ns[i] = i*odd%L
        even += ns[i]!!
      }
    }
  }
  println( ns[n]!!%L )
  
}
