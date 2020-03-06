data class Data(val index:Int, val name:String)
fun main( args : Array<String> ) {
  val m = readLine()!!.toInt()
  val scans = (1..m).map {
    readLine()!!.toInt()
  }
  // build
  val xx = mutableListOf( Data(0,"") )
  
  var cnt = 0
  var buff = mutableListOf( Data(0, "") )
  (1..11).map { p ->
    val m = Math.pow(2.toDouble(), p.toDouble())
    val next = mutableListOf<Data>()
    (0..m.toInt()-1).map { i ->
      cnt++
      val target = i/2
      val prev_name = buff[target].name
      val data = when {
        i%2 == 0 -> Data(cnt, prev_name + "L")
        else -> Data(cnt, prev_name + "R")
      }
      xx.add( data )
      next.add( data )
    }
    buff = next
  }
  scans.map { s ->
    xx.filter { it.index == s }.first().name.let{ println(it) }
  }
}
