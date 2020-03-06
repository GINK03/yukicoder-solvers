
fun main(args: Array<String>) { 
  val (a1, a2) = readLine()!!.split(" ").map { x -> x.toInt() }
  when { 
    a1 <= a2                -> println(1)
    a1%2 == 0 && 2*a2 >= a1 -> println(2)
    else                    -> println(-1)
  }

}
