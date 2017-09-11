
fun main(args: Array<String>){
  readLine()

  var buff = 0
  val ss = readLine()!!.split(" ").map { 
    val i = it.toInt()
    if (buff < i) { buff = i }
    i/2 
  }.sum()
  println(ss - buff/2 + buff)
}
