
fun main(args:Array<String>) {
  val input = readLine()!!.toList().map { it.toString().toInt() }.reversed().toMutableList()

  val buff = mutableListOf<Int>()
  // round op
  for( c in (0..input.size-1-1-1) ) {
    if( input[c] >= 5 ) input[c+1] += 1
  }
  if( input[input.size-2] >= 10 ) {
    input[input.size-2] = 0
    input[input.size-1] += 1
  }
  if( input[input.size-1] >= 10 ) {
    input[input.size-1] = 0
    input.add( 1 )
  }
  val r = input.reversed()
  val h1 = r[0]
  val h2 = r[1]
  
  println("${h1}.${h2}*10^${input.size-1}")
}
