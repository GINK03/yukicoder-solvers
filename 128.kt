
fun main( args : Array<String> ) {
  (1..2).map {
    readLine()!!.toLong()
  }.let {
    val (m, n) = it
    println(m/1000/n*1000)
  }
}
