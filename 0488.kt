
fun main( args : Array<String> )  {
  val G = (0..55).map { (0..55).toMutableList() }.toMutableList()
  val (n,m) = readLine()!!.split(" ").map { it.toInt() }
  var cnt  = 0
  (1..m).map { 
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    G[a][b] = 1
    G[b][a] = 1
  }
  (0..n).map { i -> 
  (0..n).map { j -> 
  (0..n).map { k -> 
  (0..n).map { l ->
    val d1 = G[i][j] + G[i][k] + G[i][l]
    val d2 = G[j][i] + G[j][k] + G[j][l]
    val d3 = G[k][i] + G[k][j] + G[k][l]
    val d4 = G[l][i] + G[l][j] + G[l][k]
    if(d1 == 2 && d2 == 2 && d3 == 2 && d4 == 2) 
      cnt++
  } } } }
  println(cnt)
}
