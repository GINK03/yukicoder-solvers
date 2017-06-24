
fun main(args: Array<String>) {
  val (n,m) = readLine()!!.split(" ").map { x -> x.toLong() }

  val fs = mutableListOf<Long>(0, 1)
  (2..n-1).map { 
    val next = fs[fs.size-1] + fs[fs.size-2]
    fs.add( next%m )
  }
  println( fs[fs.size-1]%m )
}
