
fun main(args: Array<String>) { 
  val (ws, n) = readLine()!!.split(" ").map { it.toInt() }
  val xs = (1..ws).map { 0 }.toMutableList()
  
  var check = false
  val arrs = (1..n).map { 
    val arr = readLine()!!.split(" ").map { it.toInt() }
    arr
  }
  
  total@for( arr in arrs ) {
    arr.mapIndexed { index, x ->
      xs[index] += x
    }
    // 尺取サーチ
    for( left in (0..xs.size-1) ) {
      for( right in (left..xs.size-1) ) {
        if( xs.slice( (left..right) ).sum() == 777 ) {
          check = true
          break@total
        }
      }
    }
  }

  if(check) 
    println("YES")
  else
    println("NO")
}
