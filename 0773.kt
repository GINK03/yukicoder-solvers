
fun main(args:Array<String>) {
    val (A, B) = readLine()!!.split(" ").map { it.toInt() } 

    ( (23..25).toSet() - (A..B).toSet() ).size.let { println(it) } 
}
