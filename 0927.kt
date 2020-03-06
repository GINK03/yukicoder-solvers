
fun main(args:Array<String>) {
    val a = readLine()!!
    val b = a.toList().sorted().reversed().map { it.toString().toInt() }.toMutableList()

    //println(a)
    //println(b)
    val last = b.last()
    var good = false
    for(i in b.size-1 downTo 0 step 1) {
        //println(b[i])
        if( last != b[i]) {
            good = true
            b[i+1] = b[i]
            b[i] = last
            break
        } 
    }
    if(good == false) {
        println(-1)
    } else if(b.first() == 0) {
        println(-1)
    } else {
        println(b.map{it.toString()}.joinToString(""))
    }
}
