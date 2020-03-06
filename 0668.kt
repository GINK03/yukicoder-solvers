
fun main(args:Array<String>) {
  val s = readLine()!!

  var size = s.length - 1
  
  val tops = s.slice(0..2)
  if( mutableSetOf("995", "996", "997", "998", "999").contains(tops) ) {
    println("1.0*10^${size+1}")
  } else {
    val (head1, head2) = listOf( tops[0], tops[1] ).map { it.toString() }
    val tail = tops.toList().last()
    if( mutableSetOf('1', '2', '3', '4').contains( tail ) ) {
      println("${head1}.${head2}*10^${size}")
    } else {
      val (up1, up2) = (tops.slice(0..1).toInt() + 1).toString().toList().map { it.toString() }
      println("${up1}.${up2}*10^${size}")
    }
  }
}
