
fun main(args:Array<String>) {
  
  val n = readLine()!!.toInt()

  val input = readLine()!!.split(" ").map { it.toLong() }

  val size = input.size 
  val median = (input.sorted()[size/2] + input.sorted().reversed()[size/2])/2
  
  //println(median)
  input.map { 
    Math.abs(median - it)
  }.sum().let { println(it) }
}
