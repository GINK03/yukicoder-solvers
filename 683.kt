import  java.math.BigDecimal as BigDecimal
fun grad(a:BigDecimal, b:BigDecimal):BigDecimal {
  return when  { 
    a == 0.toBigDecimal() && b == 0.toBigDecimal() -> 1.toBigDecimal()
    a == 0.toBigDecimal() -> 1.toBigDecimal()
    a%2.toBigDecimal() == 1.toBigDecimal() && b%2.toBigDecimal() == 1.toBigDecimal() -> 0.toBigDecimal()
    a%2.toBigDecimal() == 0.toBigDecimal() && b%2.toBigDecimal() == 0.toBigDecimal() -> ( grad(a-1.toBigDecimal(), b/2.toBigDecimal()).toLong() or grad(a/2.toBigDecimal(), b-1.toBigDecimal()).toLong() ).toBigDecimal()
    a%2.toBigDecimal() == 1.toBigDecimal() -> grad(a-1.toBigDecimal(), b/2.toBigDecimal())
    b%2.toBigDecimal() == 1.toBigDecimal() -> grad(a/2.toBigDecimal(), b-1.toBigDecimal())
    else -> 0.toBigDecimal()
  }
}
fun main(args:Array<String>) {
  val (a, b) = readLine()!!.split(" ").map(String::toBigDecimal)
  when(grad(a, b)) {
    1.toBigDecimal() -> "Yes"
    else -> "No"
  }.run(::println)
}
