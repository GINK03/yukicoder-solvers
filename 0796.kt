
fun main(args:Array<String>){
    val N = readLine()!!.toInt()
    (1..N).map {
	when {
	    it != N -> 3
	    else -> 1
	}
    }.map { it.toString() }.joinToString(" ").let { println(it) }
}
