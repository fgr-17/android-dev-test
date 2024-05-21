package eu.tutorials.rockpaperscissors

fun main() {

    var computerChoice = ""
    var playerChoice = ""

    println("Rock, Paper or Scissors? Enter your choice!")

    var validInput : Boolean = false
    while(!validInput) {
        playerChoice = readln()
        if (playerChoice == "Rock" || playerChoice == "Paper" || playerChoice == "Scissors" ||
            playerChoice == "rock" || playerChoice == "paper" || playerChoice == "scissors") {
            validInput = true
        }
        else {
            println("Please enter rock, paper or scissors")
        }
    }




    val randomNumber = (1..3).random()
    when(randomNumber) {
        1 -> computerChoice = "Rock"
        2 -> computerChoice = "Paper"
        3 -> computerChoice = "Scissors"
    }

    val winner = when {
        playerChoice == computerChoice -> "Tie"
        playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
        playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
        playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
        else -> "Computer"
    }

    if (winner == "Tie") {
        println("It's a tie")
    }
    else {
        println("Winner is $winner")
    }


}