
fun main(args:Array<String>) {
  val n = readLine()!!.toInt()
  val map = mutableMapOf<String, Int>()
  (1..n).map { 
    readLine()
    val (num, score) = readLine()!!.split(" ").map { it.toInt() }
    val words = readLine()!!.split(" ")
    words.map { word ->
      if(map.get(word) == null)
        map[word] = 0
      map[word] = map[word]!! + score
    }
  }

  val freq_list = mutableMapOf<Int, MutableList<String>>()
  map.toList().sortedBy {
    it.second * -1
  }.mapIndexed { i, pair ->
    val (word, freq) = pair
    if( freq_list.get(freq) == null )
      freq_list[freq] = mutableListOf<String>()
    freq_list[freq]!!.add( "${word} ${freq}" )
  }

  freq_list.toList().sortedBy { 
    it.first * -1
  }.map { 
    val (freq, list) = it
    list.sortedBy { 
      it
    }
  }.flatten().mapIndexed { index, it ->
    if( index <= 9 )
      println(it)
  }
}
