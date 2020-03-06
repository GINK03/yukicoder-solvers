import java.math.BigDecimal

fun main(args:Array<String>) {
  val n = readLine()!!.toBigDecimal()
  
  val m = ("1" + "0".repeat(18)).toBigDecimal()

  val bs = mutableSetOf<BigDecimal>()
  var tp = 1.toBigDecimal()
  stack@while(true) {
    if( tp > m ) break@stack
    //println(tp) 
    bs.add( tp )
    tp *= 2.toBigDecimal()
  }
  var x = 0.toBigDecimal()
  var control = false
  scan@while(true) {
    x++
    if( bs.contains(x) ) continue@scan
    val y = n - x
    if( !bs.contains(y) && y > 0.toBigDecimal() ) {
      control = true
      break@scan
    }
    if( x > n/2.toBigDecimal() ) break@scan
  }
  if( control )
    println("${x} ${n - x}")
  else 
    println("-1")
}
