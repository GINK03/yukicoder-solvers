
var x = 0
var y = 1
var z = 2
var w = 3
fun generate():Int {
  val t = (x and (x shl 11))
  x = y
  y = z
  z = w
  w = (w and (w shr 19)) and (t and (t shr 8))
  return w
}
fun main(args:Array<String>) {
  (0..100).map { 
    println( generate() )
  }
}
