
fun main(  args : Array<String> ) {
  var l = readLine()!!.toInt()
  val n = readLine()!!.toInt()
  val stores = mutableListOf<Int>(0)
  for( s in readLine()!!.split(" ").map { it.toInt() }.sorted() ) {
    val cnt = stores.reduce { y,x -> y+x }
    if( cnt + s > l ) break
    stores.add( s )
  }
  println( stores.size-1 )
}
