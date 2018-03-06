
fun main(args:Array<String>) {
  val speed = 100/60.0
  
  val dist = readLine()!!.toInt()
  val hour = dist/(60*speed).toInt()
  val min  = ( ( dist - hour * ((60*speed).toInt()) ) / speed ).toInt()
  println("${((10 + hour)%24).toString().padStart(2, '0')}:${min.toString().padStart(2, '0')}")
}
