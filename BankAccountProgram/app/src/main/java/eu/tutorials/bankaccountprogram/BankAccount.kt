package eu.tutorials.bankaccountprogram

class BankAccount (var accountHolder: String, var balance: Double) {

    private val transactionHistory = mutableListOf<String>()

    fun deposit(amount: Double){
        balance += amount
        transactionHistory.add("$accountHolder deposited $$amount - balance: ${this.acctBalance()}")
    }

    fun withdraw(amount: Double){
        if (amount <= balance) {
            balance -= amount
            transactionHistory.add("$accountHolder withdrew $$amount - balance: ${this.acctBalance()}")
        }
        else {
            println("You don't have the funds to withdraw $$amount")
        }
    }

    fun displayTransactionHistory(){
        println("Transaction history for $accountHolder")
        for (transaction in transactionHistory) {
            println(transaction)
        }
    }

    fun displayAccountInfo(){
        println("Account Holder: ${accountHolder} - Balance: ${this.acctBalance()}")
    }

    fun acctBalance(): Double {
        return balance
    }
}