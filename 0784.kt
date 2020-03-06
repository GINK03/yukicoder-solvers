
fun main(args:Array<String>) {

    val ml = mutableListOf<String>()
    readLine()!!.toList().reversed().mapIndexed {index, it ->
        if( index != 0 && index%3 == 0) ml.add(",")
        ml.add(it.toString())
    }
    ml.reversed().joinToString("").let{println(it)}
}
