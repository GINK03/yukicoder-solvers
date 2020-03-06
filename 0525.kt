
fun main(args : Array<String>) { 
  var (a,b) = readLine()!!.split(":").map { x -> x.toInt() } 
  b = b+5
  if( b >= 60 ) 
    a = a + 1

  a = a%24
  b = b%60
  println("%02d:%02d".format(a, b))
}
