
fun main(args:Array<String>) { 
  val persons = (1..readLine()!!.toInt()).map { 
    val p = readLine()!!.split(" ").map{ it.toInt() }
    Pair(p[0], p[1])
  }
  val mentais = (1..readLine()!!.toInt()).map { 
    val p = readLine()!!.split(" ").map{ it.toInt() }
    Pair(p[0], p[1])
  }

  // first 値段
  // second からさ
  val pairs = mentais.mapIndexed { i,mentai ->
    val score = persons.map { person ->
      when {
        mentai.first <= person.first && person.second <= mentai.second -> 1
        else -> 0
      }
    }.sum()
    Pair(i+1, score)
  }
  val max = pairs.maxBy { it.second }!!.second

  when { 
    max == 0 -> { println(0) }
    else -> {
      pairs.filter { it.second == max }.map { 
        println(it.first)
      }
    }
  }
}
