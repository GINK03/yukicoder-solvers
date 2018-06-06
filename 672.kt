
fun main(args:Array<String>) {
  val inputs = readLine()!!.toList().map { 
    when {
      it == 'A' -> 1
      else -> -1
    }
  }
  // scanner
  val m = mutableMapOf<Int, MutableList<Int>>( 0 to mutableListOf(-1, -1, -1) )
  var s = 0
  inputs.mapIndexed { index, it -> 
    s += it 
    if( m.get(s) == null ) {
      m[s] = mutableListOf(index, -1, -1)
    } else { 
      m[s]!![1] = index
      m[s]!![2] = index - m[s]!![0]
    }
  }
  m.toList().map {  
    it.second[2]
  }.max()?.let { 
    if( it < 0 ) 0
    else it
  }.run(::println)
  //println(m)
}
