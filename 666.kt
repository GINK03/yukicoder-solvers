
fun main(args:Array<String>){
  val base = "1000000007".toBigDecimal()
  val (a,b) = readLine()!!.split(" ").map{ it.toBigDecimal() % base }
  (a*b%base).let(::println)
}
