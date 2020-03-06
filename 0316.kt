
fun gcd(a: Long, b: Long): Long = if(a < b) gcd(b, a) else if(b == 0L) a else gcd(b, a % b)
fun lcm(a: Long, b: Long): Long = (a * b) / gcd(a, b)

fun main( args : Array<String> ) {
  val n = readLine()!!.toLong()
  val (a, b, c) = readLine()!!.split(" ").map { it.toLong() }
  val r = n/a + n/b + n/c -1 * ( n/lcm(a,b) + n/lcm(b,c) + n/lcm(c,a) ) + n/(lcm(lcm(a,b), c))
  println(r)
}
