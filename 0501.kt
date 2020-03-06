
fun main( args : Array<String> ) { 
  val (b, t) = readLine()!!.split(" ").map { x -> x.toInt() }
  when { 
    b == t -> println("A".repeat(b))
    b  < t -> println("A".repeat(b - (t-b)) + "B".repeat(t-b) ) 
    b  > t -> println("A".repeat(t)         + "C".repeat(b-t) )
    else   -> null
  }
}
