import  kotlin.coroutines.experimental.buildSequence

fun main(args:Array<String>) {
  var N = readLine()!!.toInt()
  var ans = 0
  while(1 < N) {
    if(N%2 == 1) { N++; ans++; }
    else{ N /= 2; ans++; }
  }
  println(ans)
}
