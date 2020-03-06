
fun main(args:Array<String>) {
  readLine()
  val xs = readLine()!!.split(" ").map(String::toInt).toMutableList()
  val zs = (listOf( 0 ) + xs).zip(xs).map { (f1, f2) -> f2 - f1 }
  val min = zs.slice(1..zs.size-1).min()!!
  val ys = xs.sorted()
  println("$min\n${ys.last() - ys.first()}" )
}
