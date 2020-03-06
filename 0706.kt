
fun main(args:Array<String>) {
  val dd = (1..readLine()!!.toInt()).map { readLine()!!.toList().filter { it == '^' }.size }.groupBy { it }.map { (k,vs) -> Pair(k, vs.size) }
  val maxSec = dd.maxBy { it.second }!!.second
  val res = dd.filter { (k,size) -> size == maxSec }.map { (k, size) -> k }.max()!!
  println(res)

}
