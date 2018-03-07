
fun main(args:Array<String>) {
  val cs = readLine()!!.toList().map { it.toString() }

  val char_freq = mutableMapOf<String, Int>()
  cs.map { c ->
    if( char_freq.get(c) == null ) 
      char_freq[c] = 0
    char_freq[c] = char_freq[c]!! + 1
  }
  val size1 = char_freq.toList().filter { it.second == 2 }.size
  val one = char_freq.toList().filter { it.second == 1 }

  when { 
    one.size == 1 && size1 == 6 -> { println(one[0].first) }
    else -> { println("Impossible") }
  }
}
