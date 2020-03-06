
data class Data(val one:Int, val zero:Int, val result:Int)
fun main(args:Array<String>) {
  // build matrix
  val b = mutableListOf<Data>( Data(0,0,0), Data(1,0,0)  )
  
  (0..30).map { zero -> 
    (2..30).map { one ->
      if( one + zero <= 30 )
        b.add( Data( one, zero, one*(one-1)/2 * (0..zero).map {2}.reduce { y,x -> x*y }/2 ) )
    }
  }

  val m = b.map { data -> 
    val result = data.result
    val value =  Pair(data.one, data.zero)
    Pair(result, value)
  }.toMap()

  val k = readLine()!!.toInt()
  val (one, zero) = m[k]!! 
  val re = mutableListOf<Int>(); (1..one).map { re.add(1) }; (1..zero).map { re.add(0) }
  re.size.let(::println)
  re.map(Int::toString).joinToString(" ").let(::println)
}
