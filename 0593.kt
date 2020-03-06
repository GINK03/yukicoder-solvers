
fun mod1(string:String, mod:Int):Int {
  val strarray = string.toList() 
 
  var x = 1
  var res = 0
  for( i in (0..strarray.size-1) ) {
    res = (res + (strarray[i] - '0') * x) % mod
    x = (x * 4) % mod;
  }
  return res
}
fun main(args:Array<String>) {
  val fours = readLine()!!
 
  when { 
    mod1(fours, 15) == 0 -> "FizzBuzz"
    mod1(fours, 3) == 0 -> "Fizz"
    mod1(fours, 5) == 0 -> "Buzz"
    else -> fours
  }.let { println(it) }
}
