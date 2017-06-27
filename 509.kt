
fun main( args : Array<String> ) {
   val m  = mapOf(0 to 1, 1 to 0, 2 to 0, 3 to 0, 4 to 1, 5 to 0, 6 to 1, 7 to 0, 8 to 2, 9 to 1)
   val txt = readLine()!!
   val an = txt.toList()
            .map { it.toString().toInt() }
            .map { x -> 
              m[x]!!.toInt() 
            }.reduce { y,x ->
              y+x
            }
   val inn = 1 + an + 2 * txt.length
   val ou  = 2 * ( 1 + an) + txt.length
   println( listOf(inn,ou).min() )
}
