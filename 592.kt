
fun main(args:Array<String>) {
  val n = readLine()!!.toInt()
  val cs = readLine()!!.toList().map(Char::toString)
  val pairs = mutableListOf<Pair<Int,Int>>()
  
  val a = (0..202000).toMutableList()
  val s = mutableListOf<Int>()
  for( i in (0..cs.size-1) ) { 
    if(cs[i] == "(") s.add(i) 
    else {
      val j = s[s.size-1]
      s.removeAt( s.size -1 )
      a[i] = j
      a[j] = i
    }
  }

  (0..n-1).map { 
    println(a[it]+1)
  }
  /*
  // O(N^2)で間に合わない方法
  for( start in (0..cs.size-2)) {
    if( cs[start] != "(" ) continue
    var cur = start+1
    var state = 0
    while(true) {
      if( cs[cur] == ")" ) { 
        if( state == 0 ) { pairs.add( Pair(start, cur) ); break  } 
        else state -= 1
      } else {
        state += 1
      }
      cur += 1
    }
  }
  val m = mutableMapOf<Int,Int>()
  pairs.map { 
    val (k,v) = it
    m[k+1] = v+1
    m[v+1] = k+1
  }

  (1..n).map { 
    println( m[it] )
  }
  */
}
