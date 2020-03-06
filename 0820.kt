
import java.lang.Math
fun main(args:Array<String>){
    val ( a, b) = readLine()!!.split(" ").map { it.toDouble() }
    // println("$a, $b")
    println( (Math.pow(2.0, a)/Math.pow(2.0, b)).toLong() )
}

