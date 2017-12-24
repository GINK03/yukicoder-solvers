
fun main(args:Array<String>) {
  (0..2).map { readLine()!!.toInt() }.zip( listOf("A", "B", "C") ).map {
    //println(it)
    it
  }.sortedBy { 
    it.first * -1
  }.map {
    println(it.second)
  }
}
