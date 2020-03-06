
fun main(args:Array<String>) {
  val (cycle, income, obj) = readLine()!!.split(" ").map { it.toLong() }

  val batch = income + cycle - 1
  
  val last = listOf(cycle, obj - (obj/batch)*(cycle + income - 1) ).min()!!
  println( cycle*(obj/batch) + last ) 
}
