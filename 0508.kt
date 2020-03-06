import java.lang.Math
fun main(args : Array<String>) { 
  val m = readLine()!!.toDouble()
  println( Math.pow(m/3,0.5).toLong() + 1L )
}
