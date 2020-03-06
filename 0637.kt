
fun main(args:Array<String>) {
  val bs = readLine()!!.split(" ").map { it.toInt() }

  bs.map {
    when { 
      it%3 == 0 && it%5 == 0 -> "FizzBuzz".length
      it%3 == 0 -> "Fizz".length
      it%5 == 0 -> "Buzz".length
      else -> it.toString().length
    }
  }.sum().let{ println(it) }
}
