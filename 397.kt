
fun main(args:Array<String>) {
  val n = readLine()

  val xs = readLine()!!.split(" ").map( String::toInt ).toMutableList()

  val ans = xs.sorted()
  
  val res = mutableListOf<Pair<Int,Int>>()
  var i = 0
  while(true) {
    if( i >=  xs.size-1 ) break

    val ta = xs[i]
    val min = xs.slice(i..xs.size-1).min()!!

    if( ta == min ) { i += 1;  continue }

    val tai = xs.slice(i..xs.size-1).lastIndexOf(min) + i
    xs[i]   = min
    xs[tai] = ta

    res.add( Pair(i, tai) )
    i += 1
  }

  //readLine()

  when { 
    res.size == 0 -> println(0)
    else -> { println(res.size);  res.map { println("${it.first} ${it.second}") }  }
  }
}
