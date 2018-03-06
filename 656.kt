
fun main(args:Array<String>) {
  val ts = readLine()!!.toList().map { 
    when { 
      '0' == it -> 10
      else -> it.toString().toInt()
    }
  }.sum()


  println(ts)
}
