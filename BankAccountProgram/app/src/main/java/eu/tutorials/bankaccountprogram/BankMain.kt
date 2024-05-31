package eu.tutorials.bankaccountprogram

fun main() {
    val fedeBankAccount = BankAccount("Fede", 1302.20)

    fedeBankAccount.displayAccountInfo()

    fedeBankAccount.deposit(300.4)
    fedeBankAccount.withdraw(10.4)
    fedeBankAccount.withdraw(44.1)
    fedeBankAccount.deposit(230.1)
    fedeBankAccount.displayTransactionHistory()
}