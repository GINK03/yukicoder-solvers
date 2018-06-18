
fun main(args:Array<String>) {
  val (n, k) = readLine()!!.split(" ").map(String::toInt)
  val xs = readLine()!!.split(" ").map(String::toLong).sorted().toMutableList()
  
  var bs = mutableListOf<Long>()
  for( i in (0..xs.size - 2) ) {
    bs.add( xs[i+1] - xs[i] )
  }
  bs = bs.sorted().toMutableList()
  println(bs.slice(0..n-k-1).sum())
}

