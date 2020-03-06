
fun main(args:Array<String>) {
  val inputs = readLine()!!.split(" ")
  val hour = inputs[0].toInt()
  val min = inputs[1].toInt()
  val delta = 9.0 - inputs[2].replace("UTC", "").toDouble()

  val base_min = hour*60 + min

  val delta_min = delta * 60

  val next_mins = (base_min - delta_min) + 24*60

  val next_hour = next_mins  / 60 % 24
  val next_min  = next_mins  % 60 
  //println("${hour} ${min} ${delta}")
  println("${next_hour.toInt().toString().padStart(2, '0')}:${next_min.toInt().toString().padStart(2, '0')}")
}
