import java.util.Scanner
fun main(args: Array<String>){
val reader = Scanner(System.`in`)
    //suppose we wanna know the profits a business is making
    println("Enter the cost price of a commodity")
    var cost = reader.nextInt()
    println("Enter the selling price of that commodity")
    var sell = reader.nextInt()
    var profits = sell-cost
    //now instead of switch we gonna use when
    when(profits){
        5000->println("The profits are low "+profits)
        7000->println("profits are some how growing "+profits)
        10000->println("owesome!")
        //we can continue until we feel to finish
        !in 5000..10000->println("You are doing nothing")
        //now lets run and see if our "when" works properly
    }
}
