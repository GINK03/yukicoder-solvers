
fun main(args:Array<String>){ 
  val (a,b) = (0..1).map { readLine()!!.toInt() }
  val n = readLine()!!.toInt()
  val no_freq = mutableMapOf<String,Int>()
  (1..n).map {
    val no = readLine()!!
    if(no_freq.get(no) == null ) 
      no_freq[no] = 0
    no_freq[no] = no_freq[no]!! + 1
  }
  val m = (a+b)*(no_freq.values.sum() - no_freq.size)
  println(m)
}
