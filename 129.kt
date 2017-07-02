import java.math.BigDecimal
fun main( args : Array<String> ) {
  (1..2).map {
    BigDecimal ( readLine()!!.toLong() )
  }.let { 
    val (m, n) = it
    val b = listOf( m.div(1000L).rem(n) ).max()!!
    val h = n
    val head = (h downTo h.minus(b).add(1) ).map { BigDecimal(it) }.toMutableList()
    head.add( BigDecimal(1L) )
    val base = (b downTo 1).map { BigDecimal(it) }.toMutableList()
    base.add( BigDecimal(1L) )
    ( head.reduce { y,x -> y.times(x) }.div( base.reduce { y,x -> y.times(x) } ) ).let { println( it ) }
  }
}
