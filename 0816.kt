
fun main(args:Array<String>) {
    val (A, B) = readLine()!!.split(" ").map { it.toInt() }.sorted()

    when {
        3*A == 2*B -> A/2
        2*A == B -> A*3
        3*A == B -> 2*A
        else -> -1
    }.let { println(it) }
}
