
fun main(args:Array<String>) {
  val n = readLine()!!.toInt()

  val x = readLine()!!.toInt()

  val a = readLine()!!.toInt()

  val b = readLine()!!.toInt()

  // 通常攻撃での減産
  val normal = Math.ceil(x.toDouble() / a).toInt()

  
  // 補数
  val xb = java.lang.Integer.toBinaryString(x) 
  val bb = java.lang.Integer.toBinaryString(b).toInt(2)
  
  var sum = xb.toInt(2)
  var result = 0
  val searchRange = (1..normal+1).toList()
  

  while(true){
    sum +=  bb
    val sumstr = java.lang.Integer.toBinaryString(sum).padStart(n, '0')
  
    result = i
    if( sumstr[0] == '1' ) {
      break
    }
  }
 
  
  println(normal)
  println(result)
  val output = listOf(normal, result).min()
  println(output)
}
