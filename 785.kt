
fun main(args:Array<String>) {
    (1..3).map { 
        val input = readLine()!!
        if( input != "NONE") {
            val default = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F").toSet()
            val pat = (default - input!!.split(",").toSet()).size
            pat*pat
        } else {
            256
        }
    }.reduce { effect, it -> 
        effect * it
    }.let { println(it) }
}
