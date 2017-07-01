
fun main( args : Array<String> ) {
  val n = readLine()!!.toInt()
  (1..n).map { 
    readLine()!!
  }.map { x ->
    """[0-9]+"""
      .toRegex()
      .findAll( x.reversed() )
      ?.let  {
        val ll = mutableListOf<String>()
        it.forEach { 
          ll.add(it.value ) 
        }
        when (ll) { 
          mutableListOf<String>() -> println(x)
          else ->  {
            val last = ll.first()
            val next = (last.reversed().toInt() + 1).toString().reversed()
            when { 
              next.length < last.length -> next + "0".repeat(last.length - next.length)
              else -> next 
            }.let {
               val result =  x.reversed().replace(last, it).reversed() 
              //println( "$last $next")
              println(result)
            }
          }
        }
      }
  }

}
