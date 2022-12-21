var accountBalance = (0..1000).random() // méthode random
println("The current balance is ${accountBalance}")
val money = (0..1000).random()
println("The amout you transferred is ${money} dollars")

var output = 0

fun withdraw(amount :Int) :Int {
    accountBalance -= amout // accountBalance = accountBalance - amount
    println("You successfully withdrew ${amount} dollars. The current balance is $accountBalance dollars")
    return amount
}

output = withdraw(money) // réassigne valeur // output est = au return de la fonction withdraw(money)
println("the amout you withdrew is ${output} dollars")

fun debitWithdraw(amount :Int) :Int {
    if (accountBalance == 0) {
        println("Can't withdraw, no money on this account")
        return accountBalance
    }
    else if (amount > accountBalance) {
        println("not enough money on this account! The current balance is ${accountBalance} dollars")
        return 0
    }
    else {
        return withdraw(amount)
    }

}

output = deposit(money) // réassigne valeur
println("The amount you deposited is ${output} dollars.")

fun creditDeposit(amout :Int) :Int {
    if (accountBalance == 0) {
        println("This account is completely paid off! Do not deposit money!")
        return accountBalance 
        }

        else if (accountBalance + amount > 0) {
    }





}


    






