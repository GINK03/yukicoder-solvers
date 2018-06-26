
fun main(args:Array<String>) {
  val n = readLine()!!.toInt()

  val l = mutableListOf<Long>(0)
  
  
  for(i in (1..1000000000000000000) ) {
    l.add( l[i/3] + l[i/5] ) 
  }
}
