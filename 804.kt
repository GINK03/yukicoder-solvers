
fun main(args:Array<String>) {
    var (A, B, C, D) = readLine()!!.split(" ").map { it.toInt() }

    var tar_yasai = 0
    for( yasai in (1..A) ) { 
        val niku = C*yasai
        //println("$yasai $niku")
        if(B - niku < 0 && niku + yasai <= D)  {
            tar_yasai = yasai-1
            break
        }
        if(yasai + niku > D) {
            tar_yasai = yasai-1
            break
        }
        tar_yasai = yasai
    }
    println(tar_yasai)
}
