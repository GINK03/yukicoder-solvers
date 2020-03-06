import java.lang.Math
fun main( args : Array<String> ) {
  readLine()!!.toLong()
    .let {
      (1..Math.pow(it.toDouble(), 0.5).toLong()).map { i ->
        when { 
          it%i.toLong() == 0L -> Pair(i, it/i)
          else -> null
        }
      }.filter { 
        it != null 
      }.toSet()
      .let {
        it.map {
          listOf( it!!.first.toString() + it!!.second.toString() , it!!.second.toString() + it!!.first.toString() )
        }.flatMap { it 
        }.toSet()
        .let {
          println(it.size)
        }
      }
    }
}
