
fun main(args:Array<String>) {
    val (A, B) = readLine()!!.split(" ").map { it.toInt() }
    listOf(A - B, -1).max().let { 
        when {
            it == -1 -> Pair("YES", Math.abs(A+1-B))
            else -> Pair("NO", Math.abs(A+1-B))
        }.let { println("${it.first}\n${it.second}") }
    }
}
