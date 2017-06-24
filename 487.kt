
fun main(args : Array<String> ) { 
  val b  = 2017L
  var m  = readLine()!!.toLong()
  var c  = 1L
  (1..2017*2).map { 
    c = c * 2017L % m
  }
  println( (b + c)%m )
}
