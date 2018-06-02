
fun main(args:Array<String>) {
  val (a, b) = readLine()!!.split(" ").map(String::toInt)

  (a..b).mapNotNull {
    val m = (a+b+it).toDouble()/3
    //println(m)
    if( m == m.toInt().toDouble() ) true
    else null
  }.size.let(::println)
}
