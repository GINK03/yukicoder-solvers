
fun main(args:Array<String>) {
  val (h, w) = readLine()!!.split(" ").map(String::toInt)
  val xs = (1..h).map { 
    readLine()!!.toList().toMutableList()
  }
  outer@for( hstart in (0..h-1) ) {
    for( wstart in (0..w-1) ) {
      if( hstart == 0 && wstart == 0 ) continue
      val copy = xs.map { it.toMutableList() }
      
      copy[hstart][wstart] = '*'
      if( copy.flatten().filter { it == '*' }.size != 3 ) continue

      val triples = mutableListOf<Pair<Int,Int>>()
      copy.mapIndexed { height, copy_line ->
        copy_line.mapIndexed { width, char ->
          if( char == '*' ) triples.add( Pair(height+1, width+1) )
        }
      }
      if( ( triples[0].first == triples[1].first && triples[1].first == triples[2].first ) || 
          ( triples[0].second == triples[1].second && triples[1].second == triples[2].second ) ) continue
     
      // ベクトルを作成
      val (x, y) = Pair( triples[1].first.toDouble() - triples[0].first, (triples[1].second.toDouble() - triples[0].second) )
      //println("$x $y ${(triples[2].first.toDouble()+1.0)/x} ${(triples[2].second.toDouble()+1.0)/y}") 
      if( (triples[2].first.toDouble()-triples[1].first.toDouble())/x == (triples[2].second.toDouble()-triples[1].second.toDouble())/y) continue

      copy.map { it.joinToString("").run(::println) }
      break@outer
    }
  }
}
