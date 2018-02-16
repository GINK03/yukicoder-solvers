
fun main(args: Array<String>) { 
  val (ws, n) = readLine()!!.split(" ").map { it.toInt() }
  val xs = (1..ws).map { 0 }.toMutableList()
  
  var check = false
  (1..n).map { 
    val arr = readLine()!!.split(" ").map { it.toInt() }
      
    when  { 
      arr.sum() != 0 -> { arr.mapIndexed { index, x ->
            xs[index] += x
          }
          xs.toList()
        }
      else -> null
    }
  }.filter { it != null }
  .map { xsn ->
    val xs = xsn!! 
    if( check == false ) {
      scan@for( s in (0..xs.size-1) ) { 
        for( e in (s..xs.size-1) ) { 
          if( xs.slice(s..e).sum() == 777) {
            check = true
            continue@scan
          }
        }
      }
    }
  }

  if(check) 
    println("YES")
  else
    println("NO")
}
