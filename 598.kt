
fun main(args:Array<String>) {
  val n = readLine()!!.toInt()

  val x = readLine()!!.toInt()

  val a = readLine()!!.toInt()

  val b = readLine()!!.toInt()

  // 通常攻撃での減産
  val normal = Math.ceil(x.toDouble() / a).toInt()

  
  // 補数
  val xb = java.lang.Integer.toBinaryString(x).toInt(2) 
  val bb = java.lang.Integer.toBinaryString(b).toInt(2)
  

  //val searchRange = (1..normal+1).toList()
  
  var size = normal
  var mid = size/2

  var cure = 0
  master@while(true) {
    val sum = xb + bb*mid
    val sumstr = java.lang.Integer.toBinaryString(sum).padStart(n, '0')
    if( sumstr[0] == '1' ) {
      // start under search
      for( scan in (mid downTo 0) ) {
        val sum = xb + bb*scan
        val sumstr = java.lang.Integer.toBinaryString(sum).padStart(n, '0')
        cure = scan
        if( sumstr[0] == '1' )
          break@master
      }
    } else { 
      mid = (mid + size+1)/2
    }
    if(mid == size) {
      // 探索失敗
      cure = normal + 1
      break@master
    }
  }
 
  
  //println(normal)
  //println(cure)
  val output = listOf(normal, cure).min()
  println(output)
}
