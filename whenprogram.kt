import java.util.Scanner
fun main(args: Array<String>){
    val reader = Scanner(System.`in`)
    println("Enter the number c")
    var c = reader.nextInt()
    println("Enter the number d")
    var d = reader.nextInt()
    var e = d+c
    when(e){
        50->println("yeah")
        60->println("Yeah2")
        70->println("yeah3")
        !in 50..70->println("Noooo")
    }
}
