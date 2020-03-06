
fun main(args:Array<String>){
  val (a,b) = readLine()!!.split(" ").map{ it.toLong() }
  println(a xor b)
}
