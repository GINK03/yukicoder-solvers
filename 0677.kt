
fun main(args:Array<String>) {
  val n = readLine()!!.toInt()
  
  var two = 1L
  val twos = mutableSetOf(1L)
  (1..n).map { 
    two *= 2L
    twos.add(two)
  }

  var five = 1L
  val fives = mutableSetOf(1L)
  (1..n).map { 
    five *= 5L
    fives.add(five)
  }
  
  val res = mutableSetOf(1L)
  for(two in twos) {
    for(five in fives) {
      res.add(two*five)
    }
  }
  res.sorted().map {
    println(it)
  }
}
