
fun main(args:Array<String>) {
  val (a,b) = readLine()!!.split(" ").map(String::toLong)
  
  when { 
    (a%100L == 0L && b%100L == 0L && a > 0 && b > 0) -> (a/10L)*b
    else -> { 
      val r = a*b
      if( -99999999 <= r && r <= 99999999 )
        r
      else
        "E"
    }
  }.run(::println)
}
