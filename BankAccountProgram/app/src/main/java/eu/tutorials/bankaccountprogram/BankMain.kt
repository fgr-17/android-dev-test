package eu.tutorials.bankaccountprogram

fun main() {
    val fedeBankAccount = BankAccount("Fede", 1302.20)
    fedeBankAccount.deposit(300.4)
    fedeBankAccount.withdraw(10.4)
    fedeBankAccount.withdraw(44.1)
    fedeBankAccount.deposit(230.1)
    fedeBankAccount.displayTransactionHistory()
    fedeBankAccount.displayAccountInfo()

    val sarahBankAccount = BankAccount("Sarah", 300.0)
    sarahBankAccount.deposit(100.0)
    sarahBankAccount.withdraw(10.0)
    sarahBankAccount.deposit(300.0)
    sarahBankAccount.displayTransactionHistory()
    sarahBankAccount.displayAccountInfo()

}