import java.io.PrintWriter


val PW = PrintWriter(System.out)

fun main(args: Array<String>) { 
  val a = readLine()!!.toInt()
  (1..(a/3).toInt() ).map { n ->
    val nr = a - n 
    (n..(nr/2).toInt() ).map { m ->
      PW.println("$n $m ${a - n -m}")
    }
  }
  PW.flush()
}
