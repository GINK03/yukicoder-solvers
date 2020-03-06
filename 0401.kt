
fun main( args : Array<String> ) {
  val n = readLine()!!.toInt()
  val mm = mutableListOf<MutableList<Int?>>()

  (0..n-1).map { y ->
    mm.add( mutableListOf<Int?>() )
    (0..n-1).map { x ->
      mm[y].add( null )
    }
  }
  // scan
  
  var sX = 0
  var sY = n-1
  var sX3 = n-1
  var sY3 = 0

  var cnt = 1
  cont@while(true) {
    // 1st
    if ( mm[sX].filter{ it == null } != listOf<Int?>() ) {
      for( i in (0..mm.size-1) ) {
        if( mm[sX][i] == null ) {
          mm[sX][i] = cnt
          cnt++
          continue@cont
        }
      }
    }else if( (0..n-1).map{ mm[it][sY] }.filter { it == null } != listOf<Int?>() ) {
      for( i in (0..n-1) ) {
        if( mm[i][sY] == null ) {
          mm[i][sY] = cnt
          cnt++
          continue@cont
        }
      }
    }else if ( mm[sX3].filter{ it == null } != listOf<Int?>() ) {
      for( i in (mm.size-1 downTo 0) ) {
        if( mm[sX3][i] == null ) {
          mm[sX3][i] = cnt
          cnt++
          continue@cont
        }
      }
    }else if( (0..n-1).map{ mm[it][sY3] }.filter { it == null } != listOf<Int?>() ) {
      for( i in (mm.size-1 downTo 0) ) {
        if( mm[i][sY3] == null ) {
          mm[i][sY3] = cnt
          cnt++
          continue@cont
        }
      }
    } else {
      sX += 1
      sY -= 1
      sX3 -= 1
      sY3 += 1
      if( mm.flatten().filter{ it == null }.size == 0 ) {
        break@cont
      }

    }
  }
  mm.map { y ->
    y.map { x ->
      "%03d".format(x)
    }.joinToString(" ")
    .let {
      println(it)
    }
  }
}
