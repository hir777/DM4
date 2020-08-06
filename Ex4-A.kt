import java.util.Random

fun main(args: Array<String>) {
    val times:Int = 3
    var countHeads:Int = 0
    var countTails:Int = 0
    var result:String
    val userName:String?
    
    // ask user about his or her name
    print("Who are you?\n> ")
    userName = readLine()
    println("\nHello, ${userName}!")
    
    // toss coin
    println("Tossing a coin")
    for( i in 0 until times ){
        result = CoinToss()
        println("Round ${i+1}: " + result)
        if( result == "Heads" )
            countHeads = countHeads.inc()
        else if( result == "Tails" )
            countTails = countTails.inc()
    }
    
    // print the result of the game
    println("Heads: ${countHeads}, Tails: ${countTails}")
    if( countHeads >= countTails )
        println("${userName} won!")
    else
        println("${userName} lost!")
}


// a function which simulates coin toss game
// return value: Heads or Tails (String)
fun CoinToss(): String{
    val random = Random()
    
    if( random.nextBoolean() )
        return "Heads"
    else
        return "Tails"
}
