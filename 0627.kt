
fun main(args:Array<String>) {
  val n = readLine()!!.toInt()
  val ll = (1..n).map { readLine()!!.toInt() }.toMutableList()
  ll.add(0, 0)

  (0..ll.size-2).map { i ->
    val delta = Math.abs(ll[i] - ll[i+1])
    delta == 1
  }.all {
    it == true
  }.let { when(it) {
      true -> println("T")
      else -> println("F")
    }
  }
}
