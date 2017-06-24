
fun main(args : Array<String>) { 
  val (a,b) = readLine()!!.split(" ").map { x -> x.toInt() }
  readLine()
  val cs = readLine()!!.split(" ").map { x -> x.toDouble() }
  val pos1 = cs.map { x -> x/b }
  val pos2 = cs.map { x -> x/a } 
  val zip  = pos1.zip(pos2).map { xs -> xs.toList() }.flatMap { x -> x }
  when { 
    zip == zip.sorted()  -> println("YES")
    else                 -> println("NO")
  }
}
