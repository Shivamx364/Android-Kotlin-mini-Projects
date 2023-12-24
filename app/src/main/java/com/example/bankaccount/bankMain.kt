package com.example.bankaccount

fun main(){
    val shivamAccount= BankAccount("Shivam Jaiswal",20000.00)
    shivamAccount.deposit(234.00)
    shivamAccount.withdraw(345.00)
    shivamAccount.withdraw(267.00)
    shivamAccount.deposit(300.0)
    shivamAccount.displayTransactionHistory()
    shivamAccount.accountBalance()

}