
fun main(args:Array<String>) {
    // そもそも M = 10 * Nの制約があるので条件分岐はいらない（問題文の落とし穴）
    /* val (N,M) = (0..1).map { readLine()!!.toInt() }
    when {
      N % 2 == 1 && (M/10)%2 == 1 -> "Yes" 
      N % 2 == 0 && M % 2 == 0 -> "Yes"
      else -> "No"
    }.let { println(it) } */
    println("Yes")
}
