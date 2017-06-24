
fun main(args : Array<String>) { 
  val n = readLine()!!.toInt()
  var head = readLine()!!.toInt()
  var rank = 1
  println(rank)
  val scores = (2..n).map { 
    readLine()!!.toInt()
  }
  scores.map { score ->
    when  { 
      score > head  -> { 
        rank += 1
        head  = head
      }
      else -> null
    }
    println( rank )
  }

}
