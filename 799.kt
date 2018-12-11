
fun main(args:Array<String>) {
    val (A, B, C, D) = readLine()!!.split(" ").map { it.toInt() }

    ((B-A+1)*(D-C+1) - (A..B).toSet().intersect((C..D).toSet()).size).let { println(it) }
}
