fun main(args:Array<String>) {
  val n = readLine()!!.toDouble()
  val a = (Math.sqrt(8*n+1) - 1)/2
  when { 
    Math.floor(a) == a -> { 
      println("YES")
      println(a.toInt())
    }
    else -> println("NO")
  }
}
