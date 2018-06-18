
fun main(args:Array<String>) {
  val n = readLine()!!.toInt()
  val runes = "abcdefghijklmnopqrstuvwxyz".toList().map(Char::toString)

  val buffs = mutableListOf<String>("an")
  
  var c = 0
  l1@for( c1 in (0..runes.size-1 ) ) {
    for( c2 in (0..runes.size-1 ) ) {
      for( c3 in (0..runes.size-1 ) ) {
        for( c4 in (0..runes.size-1 ) ) {
          var numstr = "a" + listOf(c1,c2,c3,c4).map{ runes[it] }.joinToString("") + "a" 
          buffs.add(numstr)
          c++
          if(c >= n-1) break@l1
        }
      }
    }
  }
  if( n == 1 )  println("an")
  else buffs.reversed().joinToString("\n").run(::println)
}
