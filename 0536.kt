
fun main( args : Array<String> ) {
  readLine()?.let {
    when {
    it[it.length-2] == 'a' && it[it.length-1] == 'i' -> it.slice(0..it.length-3) + "AI"
    else -> it + "-AI"
    }.let {
      println(it)
    }
  }
}
