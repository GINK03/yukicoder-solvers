
fun main(args:Array<String>){
    readLine()!!.toInt().let {
        when {
            it%2 == 0 -> it/2
            else -> it/2 + 1
        }
    }.let { println(it) }
}
