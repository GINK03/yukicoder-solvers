fun main(args:Array<String>) { 
  val (r, k) = readLine()!!.split(" ").map(String::toInt)
  val (h, w) = readLine()!!.split(" ").map(String::toInt)
  
  val orig = (1..h).map { readLine()!!.toList() }

  // make base
  when(r) { 
    0    -> (1..h).map { (1..w).map { null }.toMutableList<Char?>() }
    90   -> (1..w).map { (1..h).map { null }.toMutableList<Char?>() }
    180  -> (1..h).map { (1..w).map { null }.toMutableList<Char?>() }
    else -> (1..w).map { (1..h).map { null }.toMutableList<Char?>() }
  }.let { base ->
    val lambdasy = mapOf<Int, (Int, Int)->Int>( 0 to { y, x -> y }, 90 to { y, x -> x }, 180 to { y,x -> h - 1 - y }, 270 to { y,x -> w - 1 - x } )
    val lambdasx = mapOf<Int, (Int, Int)->Int>( 0 to { y, x -> x }, 90 to { y, x -> h - 1 - y }, 180 to { y, x -> w - 1 - x }, 270 to { y,x -> y } )
    (0..h-1).map { y ->
    (0..w-1).map { x ->
      val transy = lambdasy[r]!!(y, x)
      val transx = lambdasx[r]!!(y, x) //h -1 - x
      orig[y][x]
      base[transy][transx] = orig[y][x]
      //println("$transy $transx $x $y ${base.size} ${base[0].size} ${orig[y][x]}")
    }
    }
    base.map { xs ->
      (1..k).map {
        xs.map { x ->
          (1..k).map { print(x.toString()) }
        }
        println("") 
      }
    }
  }
}
