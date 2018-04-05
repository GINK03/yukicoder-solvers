
fun main(args:Array<String>) {
  val list = readLine()!!.toList()

  var (o,x) = Pair(0,0)
  (list.size-1 downTo 0).map { i ->
    //println(list[i])
    val tar = list[i]
    when { 
      tar == 'x' -> x++
      tar == 'o' -> o++
    }
    o/(o+x).toDouble()*100
  }.reversed().map(::println)
}
