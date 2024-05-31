package eu.tutorials.bankaccountprogram

class BankAccount (var accountHolder: String, var balance: Double) {

    private val transactionHistory = mutableListOf<String>()

    fun deposit(amount: Double){

    }

    fun withdraw(amount: Double){

    }

    fun displayTransactionHistory(){

    }

    fun displayAccountInfo(){
        println("Account Holder: ${accountHolder}")
        println("Balance: ${balance}")
    }
}