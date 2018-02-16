
fun search(n:Long) : Long? { 
  var (l, m, r) = listOf(1L, 0L, 2000000000L) 
  while (l <= r) {
     m = (l + r) / 2
     val x = m * (m + 1) / 2
     if (x == n) return m
     else if (x < n) l = m + 1
     else r = m - 1
  }
  return null
}
fun main(args:Array<String>) {
  val n = readLine()!!.toLong()
  val ans = search(n) 
  when  {
    ans == null -> println("NO")
    else -> { println("YES")
      println(ans)
    }
  }
}
