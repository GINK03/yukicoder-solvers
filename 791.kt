
fun main(args:Array<String>) {
    val ml = readLine()!!.toList().map { it.toString().toInt() }.toMutableList()
    val head = ml[0]
    ml.removeAt(0)
    when {
	head == 1 && ml.size >= 1 && ml.all { it == 3 } -> ml.size
	else ->  -1
    }.let { println(it) }
}
