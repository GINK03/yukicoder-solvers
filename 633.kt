
data class Person(val step:Int, var charge:Int)
fun main(args:Array<String>) {

  val n = readLine()!!.toInt()

  val money = (1..n-1).map { readLine()!!.toInt() }.toMutableList()
  money.add(0)

  val buff = mutableListOf<Person>()

  var charges = 0
  (1..n).zip(money) { index, money ->
    val (down, up) = readLine()!!.split(" ").map { it.toInt() }
    //println("moeny ${index} ${money}") 
    // add persons
    (1..up).map { 
      buff.add( Person(index, 0) )
    }
    // remove persons
    (1..down).map {
      val head = buff[0]
      charges += head.charge
      buff.removeAt(0)
    }
    
    // charge all persons
    for( person in buff ) {
      person.charge += money
    }
    //println( buff )
    //println(charges)
  }
  println(charges)
}
