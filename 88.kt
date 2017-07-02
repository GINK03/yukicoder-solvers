
fun main( args : Array<String> ) {
  val m = mapOf("oda" to "yukiko", "yukiko" to "oda")
  val start = readLine()!!
  (1..8).map {
    readLine()!!.toList()
  }.flatMap { 
    it 
  }.filter { 
    it == 'w' || it == 'b'
  }.size
  .let {
    when {
      it%2 == 0 -> start
      else      -> m[start]
    }.let {  
      println( it )
    }
  }
}
