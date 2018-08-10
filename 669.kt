
fun main(args:Array<String>) {
  val (n, k) = readLine()!!.split(" ").map(String::toInt)
  val xs = readLine()!!.split(" ").map(String::toInt)
  
  var mask = 0
  xs.map { 
    mask = mask xor (it%(k+1))
  }
  if(mask != 0) {
    println("YES")
  } else {
    println("NO")
  }
}
